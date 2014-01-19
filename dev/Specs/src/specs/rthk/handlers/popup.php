<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>RTHK Player</title>
<script src="/scripts/utilities.js" language="JavaScript" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="http://rthk.hk/include2010/css/player.css" />
<base target="_blank">

<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

</head>
<body> 
<!-- Define Live mode or Archive Mode-->
<div id="rthk-player" class="mode-archive">
<!-- Define channel e.g. ch-r1, ch-r2, ch-r3, ch-r4..etc -->
	<div id="ch-radio2">
	<!-- Define Player Skin style //-->
		<div id="player-skin" class="skin-default">
		<SCRIPT LANGUAGE="JavaScript">
		<!--
		function readCookie(name) {
			var nameEQ = name + "=";
			var ca = document.cookie.split(';');
			for(var i=0;i < ca.length;i++) {
				var c = ca[i];
				while (c.charAt(0)==' ') c = c.substring(1,c.length);
				if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length,c.length);
			}
			return null;
		}
		var userSkin = readCookie("player-skin");
		if (userSkin) {
			//alert(userSkin);

			changeClass('player-skin',userSkin);

		}
		//-->
		</SCRIPT>
			<div id="player-header">
				<div id="logo-rthk"><a href="http://rthk.hk/">rthk.hk 香港電台網站</a></div>
									<div id="tab-live"><a href="player_popup.php?rid=173&player=mp3&type=live" target="_self">電台電視直播 Live Radio / TV</a></div>
																	<div id="tab-archive" class="current"><a href="player_popup.php?name=&pid=4561&eid=&d=2014-01-19&player=mp3&type=archive&channel=radio2" target="_self">節目重溫 Archive</a></div>
				 							</div>
			

			<div id="player-main">
				<div id="player-body">
					<div id="ch-logo"><img src="http://rthk.hk/include2010/homepics/player/player_ch_logo_radio2.gif" /></div>
					<div id="ch-prog">
										<!-- click to the programme page-->
						<div class="title" id="ctitle"><a href="#" onclick="opener.location.href='programme.php?p=4561'" target="_self">【 sik 】【 si 】【 fung 】</a></div>
						<div class="host" id="chost">主持人 Presenter ：  胡 世 傑 、 黃 明 樂 、 陳 嘉 銘 </div>
					</div>

											<div id="player">Loading the player...</div>
							<script type="text/javascript" src="http://rthk.hk/jwplayer/v67/jwplayer.js"></script>
							<script>jwplayer.key="RHmDaaXFvIaag2yzvYg/87kDOuxw1DTMS7Y+wHd8cTI="</script>
							<script type="text/javascript">
$(function(){
$( "#mp3LinkSelector" ).change(function()
{
	playMp3Link($(this).val());
});
});
var hlsStreamUrl = new Array();
var segmentTitle = new Array();
function playMp3Link(mp3Number)
{
          hlsStreamUrl[0] = 'http://stmw.rthk.hk/aod/_definst_/radio/archive/radio2/siksifung/mp3/mp3:20140105.mp3/playlist.m3u8';
          segmentTitle[0] = '全部 All (HKT 12:04 - 14:00)';
          hlsStreamUrl[1] = 'http://stmw.rthk.hk/aod/_definst_/radio/archive/radio2/siksifung/mp3/mp3:20140105.mp3/playlist.m3u8?wowzaplaystart=0&wowzaplayduration=3358010';
          segmentTitle[1] = '第一部份 Part 1 (HKT 12:04 - 13:00)';
          hlsStreamUrl[2] = 'http://stmw.rthk.hk/aod/_definst_/radio/archive/radio2/siksifung/mp3/mp3:20140105.mp3/playlist.m3u8?wowzaplaystart=3358010&wowzaplayduration=3358000';
          segmentTitle[2] = '第二部份 Part 2 (HKT 13:04 - 14:00)';
								jwplayer("player").setup
								({
									sources:
									[
										{file: hlsStreamUrl[mp3Number]}
									],
									width:320,
									height:40,
									autostart: true,
									//skin: "stormtrooper",
									primary: "flash"
								});
}

							</script>
					


					<div id="prog-media">
						<div class="subheader">收聽 Listen</div>

						<div class="content">
															<div id="playMp3List">
<select id='mp3LinkSelector'><option value='0'>全部 All (HKT 12:04 - 14:00)</option><option value='1'>第一部份 Part 1 (HKT 12:04 - 13:00)</option><option value='2'>第二部份 Part 2 (HKT 13:04 - 14:00)</option></select>							</div>


													</div>
				</div>
				</div>
				<!-- show limited programme info-->
				<div id="prog-info">
					<!-- show limited episode info-->
					<div id="prog-episode">
						<div class="subheader">本集內容 About Episode</div>
						<div class="content">
							<div class="title"><a href="#" onclick="opener.location.href='programme.php?p=4561&e=246081&d=2014-01-05&m=episode'" target="_self">2014-01-05 左膠右膠  幫倒忙?   </a></div>
							<div class="text">
							主持：胡世傑、陳嘉銘、黃明樂      							</span>
														<span class="text"><a href="#" onclick="opener.location.href='programme.php?p=4561&e=246081&d=2014-01-05&m=episode'" target="_self" class="link-more">更多 More</a>
														</div>
						</div>
					</div>
					<div id="prog-archive">
						<div class="subheader">節目重溫  Archive</div>
						<div class="content">
							<div id="list-archive">
								<ul>
																			<li><a href="player_popup.php?name=&pid=4561&eid=248115&d=2014-01-19&player=mp3&type=archive&channel=radio2" target="_self" > 2014-01-19  旅客迫爆香港?   </a></li>
																			<li><a href="player_popup.php?name=&pid=4561&eid=247161&d=2014-01-12&player=mp3&type=archive&channel=radio2" target="_self" > 2014-01-12  明報變暗?   </a></li>
																			<li><a href="player_popup.php?name=&pid=4561&eid=246081&d=2014-01-05&player=mp3&type=archive&channel=radio2" target="_self" > 2014-01-05  左膠右膠  幫倒忙?   </a></li>
																			<li><a href="player_popup.php?name=&pid=4561&eid=245170&d=2013-12-29&player=mp3&type=archive&channel=radio2" target="_self" > 2013-12-29  別了梅艷芳十年   </a></li>
																			<li><a href="player_popup.php?name=&pid=4561&eid=244489&d=2013-12-22&player=mp3&type=archive&channel=radio2" target="_self" > 2013-12-22  青年人性知識   </a></li>
																		</ul>
																		<a href="#" onclick="opener.location.href='programme.php?p=4561&m=archive&page=1&item=50'" target="_self" class="link-more">更多 More</a>
																</div>
						</div>
					</div>
					<!-- show limited episode about-->
					<div class="clear-both"></div>
				</div>
			</div>


			
			<div id="player-footer">
				<div id="btn-close"><a href="javascript:window.close();" target="_self">關閉視窗 Close</a></div>
				<div id="btn-color-style">
					<!-- click to switch player skin, order is important -->
					<a href="#" onclick="changeClass('player-skin','skin-black')" target="_self">black</a>
					<a href="#" onclick="changeClass('player-skin','skin-white')" target="_self">white</a>
					<a href="#" onclick="changeClass('player-skin','skin-blue2')" target="_self">blue2</a>
					<a href="#" onclick="changeClass('player-skin','skin-palepurple')" target="_self">palepurple</a>
					<a href="#" onclick="changeClass('player-skin','skin-blue')" target="_self">blue</a>
					<a href="#" onclick="changeClass('player-skin','skin-green')" target="_self">green</a>
					<a href="#" onclick="changeClass('player-skin','skin-yellow')" target="_self">yellow</a>
					<a href="#" onclick="changeClass('player-skin','skin-orange')" target="_self">orange</a>
					<a href="#" onclick="changeClass('player-skin','skin-red')" target="_self">red</a>
					<a href="#" onclick="changeClass('player-skin','skin-purple')" target="_self">purple</a>
				</div>
				<!--show corresponding channel or url (e.g. url-r1, url-r2, url-r3 )-->
				<div id="btn-url"><a href="/channel/radio/index.php?c=radio2" class="url-radio2">http://radio2.rthk.hk</a></div>
			</div>
		</div>
	</div>
</div>

<!-- http://programme.rthk.hk/channel/radio/player_popup.php?pid=401&eid=114910&d=2010-09-09&player=media&type=archive&channel=radio2-->
<!-- http://programme.rthk.hk/channel/radio/player_popup.php?rid=173&player=media&type=live -->


<!-- START OF SmartSource Data Collector TAG -->
<script src="http://rthk.hk/include2010/stat/webtrends.js" type="text/javascript"></script> 
<script type="text/javascript">
//<![CDATA[
var _tag=new WebTrends();
_tag.dcsGetId();
//]]>>
</script>
<script type="text/javascript">
//<![CDATA[
// Add custom parameters here.
//_tag.DCSext.param_name=param_value;
_tag.dcsCollect();
//]]>>
</script>
<noscript>
<div><img alt="DCSIMG" id="DCSIMG" width="1" height="1" 
src="http://sdc.rthk.hk/dcseht10h000004r7f320gnyr_5q2e/njs.gif?dcsuri=/nojavascript&amp;WT.js=No&amp;WT.tv=8.6.2"/></div>
</noscript>
<!-- END OF SmartSource Data Collector TAG -->



<script type="text/javascript">

//Browser Support Code
function ajaxFunction(type,dcsuri,pdcsuri,ti,pti,cg_n,pcg_n,cg_s,pcg_s){

	//alert(dcsuri+","+pdcsuri+","+ti+","+pti+","+cg_n+","+pcg_n+","+cg_s+","+pcg_s);
	
	var ajaxRequest;  // The variable that makes Ajax possible!
	/*
	var dcsuri = 'dcsuri='+pdcsuri;
	var ti = 'ti='+pti;
	var cg_n = 'cg_n='+pcg_n;
	var cg_s = 'cg_s='+pcg_s;
	*/
	try{
		// Opera 8.0+, Firefox, Safari
		ajaxRequest = new XMLHttpRequest();
		
	} catch (e){
		// Internet Explorer Browsers
		try{
			ajaxRequest = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try{
				ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e){
				// Something went wrong
				//alert("Your browser broke!");
				return false;
			}
		}
	}
	// Create a function that will receive data sent from the server
	ajaxRequest.onreadystatechange = function(){
		if(ajaxRequest.readyState == 4){
			;
			//alert(ajaxRequest.responseText);
			//document.myForm.time.value = ajaxRequest.responseText;
		}
	}

	//alert("webtrendCheck.php?dcsuri="+encodeURIComponent(pdcsuri)+"&ti="+encodeURIComponent(pti)+"&cg_n="+encodeURIComponent(pcg_n)+"&cg_s="+encodeURIComponent(pcg_s));		
	ajaxRequest.open("GET", "webtrendCheck.php?dcsuri="+encodeURIComponent(pdcsuri)+"&ti="+encodeURIComponent(pti)+"&cg_n="+encodeURIComponent(pcg_n)+"&cg_s="+encodeURIComponent(pcg_s), true);
	//ajaxRequest.open("GET", "webtrendCheck.php?p="+encodeURIComponent(p), true);	
	ajaxRequest.send(null); 
}


function dcsMultiTrackAlert(type,dcsuri,pdcsuri,ti,pti,cg_n,pcg_n,cg_s,pcg_s){
	try
	{
		if(type=="live"){
			pcg_n=pcg_n.replace("player_live_programme", plink[currentProgram])
			//alert(pcg_n);
		};	
			
		//alert(dcsuri+","+pdcsuri+","+ti+","+pti+","+cg_n+","+pcg_n+","+cg_s+","+pcg_s);
		dcsMultiTrack('DCS.dcsuri', pdcsuri, 
		'WT.ti',pti,
		'WT.cg_n',pcg_n,
		'WT.cg_s',pcg_s
		);		

		/*
		// check webtrend to database
		if (pcg_n=='player_live:radio2/keepuco' || pcg_n=='player_live:radio1/keepuco' || pcg_n=='player_live:radio5/keepuco'){
			ajaxFunction(type,'DCS.dcsuri', pdcsuri, 
			'WT.ti',pti,
			'WT.cg_n',pcg_n,
			'WT.cg_s',pcg_s
			);		
		}
		*/			
		
	}
	catch(e)
	{
		// dump error
	}

}	
</script>
	
	<script type="text/javascript">
	// webtrend count 
	try
	{				
		// streaming				
		dcsMultiTrackAlert('archive','DCS.dcsuri', '%2Fchannel%2Fradio%2Fplayer_popup.php', 
		'WT.ti', 'siksifung',
		'WT.cg_n','player_archive:radio2/siksifung',
		'WT.cg_s', '2014-01-05'
		)		
	

		// pageview
		dcsMultiTrackAlert('archive','DCS.dcsuri', '%2Fchannel%2Fradio%2Fprogramme_popup.php', 
		'WT.ti', 'siksifung',
		'WT.cg_n','prog_page:radio2/siksifung',
		'WT.cg_s', '2014-01-05'
		)	
	}
	catch(e)
	{
		// dump error
	}	
playMp3Link(0);</script>	 
</body>
</html>
