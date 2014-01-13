using System.IO;
using System.Net;
using System.Text.RegularExpressions;

//var url = "http://programme.rthk.hk/channel/radio/programme.php?name=radio2/siksifung&d=2013-12-29&p=4561&e=245170&m=episode";
var url = "http://programme.rthk.hk/channel/radio/programme.php?name=radio2/siksifung&d=2014-01-05&p=4561&e=246081&m=episode";

Console.WriteLine("Loading: " + url);

var client = new WebClient { Encoding = System.Text.Encoding.UTF8 };
var html = client.DownloadString(url);

//File.AppendAllText("output/episode.html", html);

//var pattern = "href=\"(http://www.rthk.org.hk/asx/rthk/.*asx)\"";
var pattern = "<a href=\"(.*?)\" class=\"mp3\">MP3</a>";

foreach (Match match in Regex.Matches(html, pattern)) {
	var episode = new { url = match.Groups[1].Value };
	Console.WriteLine(episode.url);
}
