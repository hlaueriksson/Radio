using System.Net;
using System.Text.RegularExpressions;
using Newtonsoft.Json;

var url = "http://programme.rthk.hk/channel/radio/index_archive.php";

Console.WriteLine("Loading: " + url);

var client = new WebClient { Encoding = System.Text.Encoding.UTF8 };
var html = client.DownloadString(url);

var pattern = "<a href=\"(http://programme.rthk.hk/channel/radio/programme.php.*?)\" class=\"(.*?)\".?>(.*?)</a>";

var result = new List<object>();

foreach (Match match in Regex.Matches(html, pattern)) {
	var program = new { url = match.Groups[1].Value, station = match.Groups[2].Value, name = match.Groups[3].Value.Trim() };
	if (program.station == "tv") continue; // Skip 電視 TV
	result.Add(program);
}

using (FileStream fs = File.Open("output/programs.json", FileMode.Create))
using (StreamWriter sw = new StreamWriter(fs))
using (JsonWriter jw = new JsonTextWriter(sw)) {
  jw.Formatting = Formatting.Indented;
  JsonSerializer serializer = new JsonSerializer();
  serializer.Serialize(jw, result);
}
