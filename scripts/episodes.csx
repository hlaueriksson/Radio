using System.Net;
using System.Text.RegularExpressions;

var url = "http://programme.rthk.hk/channel/radio/programme.php?name=radio2/siksifung&p=4561&m=archive&page=1&item=500";

Console.WriteLine("Loading: " + url);

var client = new WebClient { Encoding = System.Text.Encoding.UTF8 };
var html = client.DownloadString(url);

var pattern = "<a href=\"(programme.php.*?m=episode)\">(.*?)</a>";

foreach (Match match in Regex.Matches(html, pattern)) {
	var episode = new { Url = match.Groups[1].Value, Name = match.Groups[2].Value.Trim() };
	Console.WriteLine(episode.Url + " " + episode.Name);
}
