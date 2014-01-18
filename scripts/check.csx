using System.IO;
using System.Net;
using System.Text.RegularExpressions;
using System.Linq;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

var downloader = new Downloader();
var hls = new Hls();
var smm = new Smm();

var json = File.ReadAllText("output/programs.json");
var programs = JArray.Parse(json);

foreach(var program in programs) {
	var url = program["url"].ToString() + "&m=archive&page=1&item=1000";

	Console.WriteLine("Loading:");
	Console.WriteLine(url);
	
	var html = downloader.GetContent(url);
	
	var pattern = "<div class=\"title\">.*<a href=\"(.*?m=episode)\">(.*?)</a>";

	var matches = Regex.Matches(html, pattern).Cast<Match>();
	
	Console.WriteLine("\t" + matches.Count() + " episodes");
	
	foreach (var match in matches) {
		url = "http://programme.rthk.hk/channel/radio/" + match.Groups[1].Value;
		
		Console.WriteLine("\t" + url);
		
		html = downloader.GetContent(url);

		var supported = false; 
		
		var stream = hls.GetStream(html);
		if(stream != null) {
			Console.WriteLine("\t\tHLS: " + stream);
			supported = true;
		}
		
		stream = smm.GetStream(html);
		if(stream != null) {
			Console.WriteLine("\t\tSMM: " + stream);
			supported = true;
		}
		
		if(!supported) Console.WriteLine("\t\tUNSUPPORTED PROTOCOL!");
	}
	
	Console.WriteLine();
}

public class Downloader {
	public string GetContent(string url) {
		var client = new WebClient { Encoding = System.Text.Encoding.UTF8 };
		
		return client.DownloadString(url);
	}
}

public class Hls {
	public string GetStream(string html) {
		var pattern = "<a href=\"(.*?)\" class=\"mp3\">MP3</a>";	
		var match = Regex.Matches(html, pattern).Cast<Match>().SingleOrDefault();
		
		return match != null ? match.Groups[1].Value : null;
	}
}

public class Smm {
	public string GetStream(string html) {
		var pattern = "href=\"(http://www.rthk.org.hk/asx/rthk/.*?asx)\"";
		var match = Regex.Matches(html, pattern).Cast<Match>().SingleOrDefault();
		
		return match != null ? match.Groups[1].Value : null;
	}
}