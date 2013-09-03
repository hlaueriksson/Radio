using System.Net;
using System.Text.RegularExpressions;
using Newtonsoft.Json;

var url = "http://programme.rthk.hk/channel/radio/index_archive.php";

Console.WriteLine("Loading: " + url);

var client = new WebClient { Encoding = System.Text.Encoding.UTF8 };
var html = client.DownloadString(url);

var pattern = "<div class=\"channeljump\"><a href=\"(#.*?)\">(.*?)</a></div>";

var result = new List<object>();

foreach (Match match in Regex.Matches(html, pattern)) {
	var station = new { url = url + match.Groups[1].Value, name = match.Groups[2].Value };
	result.Add(station);
}

result.RemoveAt(0); // Skip 電視 TV

using (FileStream fs = File.Open("output/stations.json", FileMode.Create))
using (StreamWriter sw = new StreamWriter(fs))
using (JsonWriter jw = new JsonTextWriter(sw))
{
  jw.Formatting = Formatting.Indented;
  JsonSerializer serializer = new JsonSerializer();
  serializer.Serialize(jw, result);
}
