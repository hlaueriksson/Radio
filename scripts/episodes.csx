using System.Net;
using System.Text.RegularExpressions;

var url = "http://programme.rthk.hk/channel/radio/programme.php?name=radio2/siksifung&p=4561&m=archive&page=1&item=500";

Console.WriteLine("Loading: " + url);

var client = new WebClient { Encoding = System.Text.Encoding.UTF8 };
var html = client.DownloadString(url);

var pattern = "<a href=\"(programme.php.*?m=episode)\">(.*?)</a>";

foreach (Match match in Regex.Matches(html, pattern)) {
	var episode = new { url = match.Groups[1].Value, name = match.Groups[2].Value.Trim() };
	Console.WriteLine(episode.url + " " + episode.name);
}

// Episode info
url = "http://programme.rthk.hk/channel/radio/programme.php?name=radio2/siksifung&p=4561";

Console.WriteLine("Loading: " + url);

client = new WebClient { Encoding = System.Text.Encoding.UTF8 };
html = client.DownloadString(url);

Console.WriteLine(Regex.Match(html, "<h3>(.*?)</h3>").Groups[1].Value); // Name
Console.WriteLine(Regex.Match(html, "<div id=\"epi-text\">\\s*(.*?)\\s*</div>").Groups[1].Value.Trim()); // Description
