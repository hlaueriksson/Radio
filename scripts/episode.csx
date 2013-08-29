using System.Net;
using System.Text.RegularExpressions;

var url = "http://programme.rthk.hk/channel/radio/programme.php?name=radio2/siksifung&d=2013-08-25&p=4561&e=229871&m=episode";

Console.WriteLine("Loading: " + url);

var client = new WebClient { Encoding = System.Text.Encoding.UTF8 };
var html = client.DownloadString(url);

var pattern = "href=\"(http://www.rthk.org.hk/asx/rthk/.*asx)\"";

foreach (Match match in Regex.Matches(html, pattern)) {
	var episode = new { Url = match.Groups[1].Value };
	Console.WriteLine(episode.Url);
}
