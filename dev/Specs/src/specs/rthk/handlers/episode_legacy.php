<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="zh-hk" lang="zh-hk">
<head>
<META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE" />
<meta name="robots" content="noarchive" />
<meta name="googlebot" content="noarchive" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- Webtrend Meta Tag -->
<meta name="WT.cg_n" content="prog_page:radio1/openline_openview" />
<meta name="WT.cg_s" content="2013-01-01" />
<!-- Webtrend Meta Tag -->
<meta name="title" content="rthk.hk 香港電台網站: 自由風自由 PHONE:挺梁倒梁團體元旦遊行" />
<meta name="description" content="
主持：陳燕萍
評論員：陳智傑
監製：陳燕萍
編導：梁仲禮
資料搜集：方艷媚
製作：香港電台公共事務組" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7"/>
<title>rthk.hk 香港電台網站: 自由風自由 PHONE:挺梁倒梁團體元旦遊行</title>
<link href="http://rthk.hk/include2010/css/base.css" rel="stylesheet" type="text/css" />
<link href="http://rthk.hk/include2010/css/programme.css" rel="stylesheet" type="text/css" />
<link href="http://rthk.hk/include2010/css/programme_theme2.css" rel="stylesheet" type="text/css" />

<link href="/css/r1.css" rel="stylesheet" type="text/css" />



<script src="http://rthk.hk/include2010/scripts/swfobject.js" language="JavaScript" type="text/javascript"></script>
<script src="http://rthk.hk/include2010/scripts/sharing.js" language="JavaScript" type="text/javascript"></script>
<script src="http://rthk.hk/include2010/scripts/utilities.js" language="JavaScript" type="text/javascript"></script>

<!--[if IE 6]>
<script src="http://rthk.hk/include2010/scripts/DD_belatedPNG_0.0.8a-min.js"></script>
<script type="text/javascript">
DD_belatedPNG.fix('*');
</script>
<![endif]-->

<script src="http://rthk.hk/include2010/scripts/jquery-1.4.2.min.js" type="text/javascript"></script>
<!-- For Homepage revamp -->
<body>
<div id="wrapper">
<div id="theme" class="radio">

<!-- menu -->
<script>
/*
function submitForm(queryType) {
	queryTypeVal = "&queryType="+queryType;
	queryStrVal = "&queryStr="+document.getElementById('queryStr').value;
	document.location.href = "http://search.rthk.org.hk/search/index.php?submitform=1"+queryTypeVal+queryStrVal;
}
*/
$().ready(function() { 

	/* control the weather div */
	$('#gh-weather').load('/include2010/gen_htm/global_weather.htm?'+Math.random());
	var weather_refresh = setInterval(function() {
		//$('#gh-weather').fadeOut('slow').load('/include2010/gen_htm/global_weather.htm?'+Math.random()).fadeIn("slow");
		$('#gh-weather').load('/include2010/gen_htm/global_weather.htm?'+Math.random());
	}, 60000);

	/* control global header live button */
	$("#gh-nav #live a").click(function() {
		$("#globallive").slideToggle('slow', function() {
		//$("#globallive").animate({height: 'toggle'},3000, function() {
			$("#globallive .content .ch-radio").load("/include2010/gen_htm/global_radio_live.htm?"+Math.random());
			$("#tbl-tv-proglist").load("/include2010/gen_htm/global_tv_live.htm?"+Math.random());
			$("#tbl-tv-webcast").load("/include2010/gen_htm/global_webcast_live.htm?"+Math.random());			
		});
		if ($(this).is('.current')) {
			$(this).removeClass("current");
		} else {
			$(this).addClass("current");
		}
	});

	/* control global header share button */
	$("#gh-fb-links #share a").hover(function() {
		$("#gh-share-options").css("visibility","visible");
	});
	$("#gh-share-options").mouseleave(function() {
		$("#gh-share-options").css("visibility","hidden");
	});
	
	/* control global header radio button */
	$("#gh-nav #radio a").hover(function() {
		$("#sub-radio-ch").css("visibility","visible");
	});	
	$("#sub-radio-ch").mouseleave(function() {
		$("#sub-radio-ch").css("visibility","hidden");
	});

}); 
</script>

<!--Google Search //-->
<!--<script src="http://rthk.hk/include2010/scripts/jquery-1.4.2.min.js" type="text/javascript"></script>
<script type="text/javascript" src="http://rthk.hk/scripts/jquery-ui/jquery-ui.min.js"></script>//-->
<script type="text/javascript" src="http://rthk.hk/scripts/jquery-ui/jquery-ui-1.8.24.custom.min.js"></script>
<script type="text/javascript" src="http://rthk.hk/scripts/querySuggestionData_podcast_en.js"></script>
<link href="http://rthk.hk/scripts/jquery-ui/jquery-ui.css" rel="stylesheet" type="text/css">
<script>
    // Assume that the function getQuerySuggestionData() is defined for retrieving the suggestion data.
    $(document).ready(function() {
      var gm_language = 'en';
      $("form[name='gs'] input[name='q']").autocomplete({
        source: window.getQuerySuggestionData ? window.getQuerySuggestionData(gm_language) : [],
        // Give more time to enter Chinese.
        delay: 1000,
        select: function(event, ui) {
          // Submit on item selection, like the effect in Google search.
          // It may not work to submit immediately, so delay submitting.
          setTimeout(function() {
            document.forms['gs'].submit();
          }, 0);
        }
      });
    });
</script>
<!--End of Google search //-->

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

  <!-- set class to be the active section -->
  <div id="globalheader-e" class="home">
    <div id="gh-logo"><a class="xtrig" href="http://rthk.hk/hp_index_eng_20100614.htm#2" rel="coda-slider-1"><h1><img src="http://rthk.hk/include2010/homepics/images/home_logo.png" alt="香港電台網站 RTHK ON THE INTERNET"/></h1></a></div>
    <!--/gh-logo-->
    <div id="gh-featurebox">
      <div id="gh-fb-links">
        <ul>
		  <li id="desktopver"><a href="http://rthk.hk/index_eng.htm">Desktop Ver.</a></li>
          <li id="cleanver"><a href="http://app3.rthk.org.hk/simple/simple_template.php">Simple Ver.</a></li>
          <li id="textmode"><a href="http://rthk.hk/text/chi/">Text</a></li>
          <li id="cht"><kanhanbypass><a href="http://rthk.hk/index.htm">繁</a></kanhanbypass></li>
          <li id="chs"><a href="http://gbcode.rthk.org.hk/TuniS/rthk.hk/index.htm">簡</a></li>
          <li id="eng"><a href="http://rthk.hk/index_eng.htm">Eng</a></li>
          <li id="mobile"><a href="http://m.rthk.hk">Mobile</a></li>
          <li id="tools"><a href="http://rthk.hk/tools/index_e.htm">Apps</a></li>
          <li id="myrthk"><a href="http://myrthk.hk">myrthk</a></li>
          <!--<li id="faq"><a href="http://rthk.hk/faq/index_e.htm">FAQ</a></li>//-->
          <li id="sitemap"><a href="http://rthk.hk/sitemap/index_e.htm">Site Map</a></li>
          <!--li id="customize"><a href="#">Setting</a></li-->
          <li id="share"><a href="#">Share</a></li>
        </ul>
      </div>
      <!--/gh-submenu-->
      <div id="gh-fb-search">
        <form action="http://search.rthk.hk/search" name="gs" id="searchFrm" method="get">
          <input id="access" name="access" value="p" type="hidden" />
          <input id="entqr" name="entqr" value="0" type="hidden" />
          <input id="output" name="output" value="xml_no_dtd" type="hidden" />
          <input id="sort" name="sort" value="date%3AD%3AL%3Ad1" type="hidden" />
          <input id="client" name="client" value="en_frontend" type="hidden" />
          <input id="ud" name="ud" value="1" type="hidden" />
          <input id="site" name="site" value="default_collection" type="hidden" />
          <input id="oe" name="oe" value="UTF-8" type="hidden" />
          <input id="proxystylesheet" name="proxystylesheet" value="en_frontend" type="hidden" />
          <input id="proxyreload" name="proxyreload" value="1" type="hidden" />
          <input id="q" name="q" type="text" /><label for="q" style="display:none;">Search</label>
          <input id="searchBtn" title="Search" type="button" value="" onClick='$("#searchFrm").submit();' />
        </form>
      </div>
      <!--/gh-search-->
    </div>
    <!--/gh-features-->
    <div id="gh-weather">
    </div>
    <!--/gh-weather-->
    
    <div id="gh-nav">
      <ul>
          <li id="home"><a class="xtrig" href="http://rthk.hk/index_eng.htm#2" rel="coda-slider-1">Home</a></li> 
          <li id="radio"><a href="#">Radio</a></li> 
          <li id="tv"><a class="xtrig" href="http://rthk.hk/index_eng.htm#3" rel="coda-slider-1">TV</a></li> 
          <li id="webit"><a class="xtrig" href="http://rthk.hk/index_eng.htm#4" rel="coda-slider-1">Web+</a></li> 
          <li id="news"><a href="http://rthk.hk/rthk/news/englishnews/index_news.htm">News</a></li> 
          <li id="live"><a href="#">Live</a></li> 
          <!--li id="archive"><a href="http://search.rthk.org.hk/search/index_2010.php?lang=eng&submitform=1&queryType=arch_all&queryStr=">Archive</a></li--> 
		  <li id="archive"><a href="http://programme.rthk.hk/channel/radio/index_archive.htm">Archive</a></li>
          <li id="podcast"><a href="http://podcast.rthk.hk/podcast/index.php?lang=en-US">Podcasts</a></li> 
      </ul>
    </div>
    <!--/gh-nav-->

    <div id="gh-share-options" style="position: absolute; width: 116px; top: 0px; left: 663px; z-index: 100; visibility: hidden;">
		  <a href="javascript:fbs_click()"><img src="http://rthk.hk/include2010/homepics/images/icon_share_fb.gif" title="facebook" alt="facebook" /></a>
		  <a href="javascript:twitter_click()"><img src="http://rthk.hk/include2010/homepics/images/icon_share_twitter.gif" title="twitter" alt="twitter" /></a>
		  <a href="javascript:shareByEmail()"><img src="http://rthk.hk/include2010/homepics/images/icon_share_email.gif" title="email" alt="email" /></a>
    </div><!--/gh-share-options-->
	
	<div id="sub-radio-ch" class="submenu" style="position: absolute; width: 230px; top: 80px; left: 117px; z-index: 90; visibility: hidden; padding-top: 40px">
        <ul>			
	  <li id="r1"><a href="http://programme.rthk.hk/channel/radio/index.php?c=radio1">Radio 1</a></li>
	  <li id="dab31"><a href="http://programme.rthk.hk/channel/radio/index.php?c=dab31">DAB 31</a></li>
	  <li id="r2"><a href="http://programme.rthk.hk/channel/radio/index.php?c=radio2">Radio 2</a></li>
	  <li id="dab32"><a href="http://hxradio.cnr.cn/" target="_blank">DAB 32</a></li>
	  <li id="r3"><a href="http://programme.rthk.hk/channel/radio/index.php?c=radio3">Radio 3</a></li>
	  <li id="dab33"><a href="http://programme.rthk.hk/channel/radio/index.php?c=dab33">DAB 33</a></li>
	  <li id="r4"><a href="http://programme.rthk.hk/channel/radio/index.php?c=radio4">Radio 4</a></li>
	  <li id="dab34"><a href="http://www.bbc.co.uk/worldservice/" target="_blank">DAB 34</a></li>
	  <li id="r5"><a href="http://programme.rthk.hk/channel/radio/index.php?c=radio5">Radio 5</a></li>
	  <li id="dab35"><a href="http://programme.rthk.hk/channel/radio/index.php?c=dab35">DAB 35</a></li>
	  <li id="pth"><a href="http://programme.rthk.hk/channel/radio/index.php?c=pth">Radio PTH</a></li>
        </ul>
    </div><!--/sub-radio-ch-->
	
  </div>
  <!--/globalheader-e-->
  
    <div id="globallive">
      <div class="content">	  
        <div class="ch-radio">		  
        </div><!--/.ch-radio-->
   	    <div class="ch-tv">
          <div class="padding"><img src="http://rthk.hk/include2010/homepics/images/head_tv_timetable_live_e.gif" alt="Today's TV Webcast Schedule" /></div>
   	      <div id="tbl-tv-proglist">		  
		  </div><!--/tbl-tv-proglist-->
		  
		  <div id="tbl-tv-webcast">			
		  </div><!--/tbl-tv-webcast-->
		  
 		 </div><!--/.ch-tv-->
         <div class="clear"></div>
      </div><!--/.content-->
    </div><!--/globallive-->
  
  
	
<!-- end menu -->
<div id="main-wrapper">
	<div id="channel-header">
			<div id="channel-bar">
			<div id="channel-name"><h2><img src="/homepics/images/channel_name_r1.gif" alt="Radio 1" width="140" height="44" /></h2></div>
			<div id="channel-live">
				<ul>
				<li id="live-title">網上直播</li>
				<li id="listen-hq"><a href="javascript:MM_openBrWindow('player_popup.php?rid=168&player=mp3&type=live','rthk_pop_player','scrollbars=no,resizable=no,width=660,height=400');"><img src="/homepics/images/live_btn_mp3.gif" alt="收聽 MP3" title="收聽 MP3" /></a></li>
				<li id="listen-hq"><a href="javascript:MM_openBrWindow('player_popup.php?rid=168&player=hq&type=live','rthk_pop_player','scrollbars=no,resizable=no,width=660,height=400');"><img src="/homepics/images/live_btn_hq.gif" alt="收聽高質版 High Quality Version" title="收聽高質版 High Quality Version" /></a></li>
				<li id="live-programme"><a href="programme.php?name=eveningnews&d=2014-01-10&p=1073&e=&m=episode">晚間新聞天地</a></li>
				</ul>
			</div>
			<div id="channel-btn"><a href="javascript:bookmarksite('RTHK.HK 香港電台網站','http://programme.rthk.hk/channel/radio/programme.php?name=radio1/openline_openview&d=2013-01-01&p=1069&e=202746&m=episode');">加入到書籤 Add to bookmark</a></div>
		</div>
			<!-- nav -->
				<div id="nav" class="archive">
			<ul id="channelnav">
			<li id="home"><a href="/channel/radio/index.php?c=radio1" title="第一台主頁">第一台主頁</a></li>
			<li id="archive"><a href="/channel/radio/index.php?c=radio1&m=archive" title="重溫一台節目">重溫一台節目</a></li>
			<li id="schedule"><a href="/channel/radio/index.php?c=radio1&m=timetable" title="節目時間表">節目時間表</a></li>
			<li id="djprofiles"><a href="/channel/presenters/profiles.php?c=radio1&m=djprofiles" title="台前幕後">台前幕後</a></li>
<!--			<li id="contactus"><a href="mailto:webmaster@rthk.hk" title="聯絡我們">聯絡我們</a></li>-->

			</ul>
		</div>

	
	</div>
	<div id="main-body">
		<div id="left-column">

		
		
		
		
		
		
		<div id="item-sharewithfds">
			<div class="subheader">推介給朋友</div>
			<div class="content">
				<div class="desc">歡迎你透過以下方式與朋友分享本節目內容。</div>
				<div class="icons">
					<ul>
					<script>function fbs_click() {u=location.href;t=document.title;g=document.location.pathname;window.open('http://app1.rthk.org.hk/sharing/sharing.php?type=facebook&group='+g+'&title=<title>&url2=http://www.facebook.com/sharer.php?u='+encodeURIComponent(u)+'&t='+encodeURIComponent(t),'sharer','toolbar=0,status=0,width=626,height=436');void(0);}</script>
<a href="#" onclick="fbs_click();"><img src="http://app1.rthk.org.hk/sharing/images/facebook.png" alt="facebook" title="facebook" border="0"/></a> 

<script>function goo_click() {u=location.href;t=document.title;g=document.location.pathname;window.open('http://app1.rthk.org.hk/sharing/sharing.php?type=google&group='+g+'&url2=http://www.google.com/bookmarks/mark?op=edit&bkmk='+encodeURIComponent(u)+'&title='+encodeURIComponent(t),'sharer','toolbar=0,status=0,width=626,height=436');void(0);}</script>
<a href="#" onclick="goo_click();"  ><img src="http://app1.rthk.org.hk/sharing/images/googlebookmark.png" alt="googlebookmark" title="googlebookmark" border="0"/></a>


<script> function twitter_click() {u=location.href;t=document.title;g=document.location.pathname;window.open('http://app1.rthk.org.hk/sharing/sharing.php?type=twitter&group='+g+'&u='+encodeURIComponent(u)+'&url2=http://www.twitter.com/home?status=&title='+encodeURIComponent(t),'sharer','toolbar=0,resizable=yes,scrollbars=yes,status=0,width=626,height=436');void(0);}</script>
<a href="#" onclick=" twitter_click();" ><img src="http://app1.rthk.org.hk/sharing/images/twitter.png" alt="twitter" title="twitter" border="0"/></a> 

<script> function del_click() {u=location.href;t=document.title;g=document.location.pathname;window.open('http://app1.rthk.org.hk/sharing/sharing.php?type=delicious&group='+g+'&url2=http://del.icio.us/post?url='+encodeURIComponent(u)+'&title='+encodeURIComponent(t),'sharer','toolbar=0,status=0,width=626,height=436');void(0);}</script>
<a href="#" onclick=" del_click();" ><img src="http://app1.rthk.org.hk/sharing/images/delicious.png" alt="delicious" title="delicious" border="0"/></a>  

<script> function sina_click() {p=document.getElementById('sina_image_src').href;u=location.href;t=document.title;g=document.location.pathname;window.open('http://app1.rthk.org.hk/sharing/sina_sharing.php?type=sina&group='+g+'&url2=http://service.weibo.com/share/share.php?pic='+p+'&title='+t+'&u='+encodeURIComponent(u)+'&t='+encodeURIComponent(t),'sharer','scrollbars=1,toolbar=0,status=0,width=626,height=436');void(0);}</script>
<a href="#" onclick="sina_click();" ><img src="http://app1.rthk.org.hk/sharing/images/sina.png" alt="sina" title="sina" border="0"/></a> 

<script> function shareByEmail() {var u = location.href;window.open('/popup_email.php?url='+encodeURIComponent(u),'sharer','toolbar=0,status=0,width=500,height=550');}</script>
<a href="#" onclick=" shareByEmail();" ><img src="http://app1.rthk.org.hk/sharing/images/email.gif" alt="email" title="email" border="0"/></a> 
<script>
function addToFavorites() {
	var url = location.href;
	var title = document.title;
	if (window.sidebar) { // Mozilla Firefox Bookmark		
		window.sidebar.addPanel(title, url,"");	
	} else if( window.external ) { // IE Favorite		
		window.external.AddFavorite( url, title); 
	} else if(window.opera && window.print) { // Opera Hotlist		
		return true; 
	}
}  
</script>
		
<br><br>
<a href="javascript:addToFavorites();"> 加入到書籤 <br>Add to bookmark</a>


					</ul>
				</div>
				<div class="clear-both"></div>
			</div>
                    
		</div>
       
	
		        
		

		</div>
          
		<!-- end of column -->
		<div id="right-column">

		
		<!-- program content -->
		<div id="item-prog-main">

						<div id="prog-menu" class="chi">            

				<ul>
							<li><a href="programme.php?name=radio1/openline_openview&p=1069">節目介紹</a></li>
			
			
									<li id="current">本集內容</li>
				
									<li><a href="programme.php?name=radio1/openline_openview&p=1069&m=archive&page=1&item=100">各集內容</a></li>
				
			
															<li><a href="programme.php?name=radio1/openline_openview&p=1069&m=photo">相片集</a></li>
					
				
								<li><a href="http://app3.rthk.hk/special/pau/">特備網頁</a></li>
				
				                
								<li><a href="http://podcast.rthk.hk/podcast/item_epi.php?pid=289">Podcasts</a></li>
								</ul>
				<div class="clear-both"></div>
			</div>
			<div id="prog-head">
				<div class="title"><h3>自由風自由 PHONE</h3>
				<!---program name end--->
				</div>

								  <div class="host">
				主持人：陳燕萍					</div>
			</div>
								<div id="prog-playbar">
					<ul>
 
					<li>收聽<BR />Listen</li>
										<li><a href="javascript:MM_openPalyerWindow('player_popup.php?pid=1069&eid=202746&d=2013-01-01&player=media&type=archive&channel=radio1','rthk_pop_player','scrollbars=no,resizable=no,width=660,height=400');" class="media">Window Media</a></li>
															<li><a href="javascript:MM_openPalyerWindow('player_popup.php?pid=1069&eid=202746&d=2013-01-01&player=real&type=archive&channel=radio1','rthk_pop_player','scrollbars=no,resizable=no,width=660,height=400');" class="real">Real Media</a></li>
										    
						<li>獨立播放<br />Standalone Player</li>
											<li><a href="http://www.rthk.org.hk/asx/rthk/radio1/openline_openview/20130101.asx" onclick="dcsMultiTrack('DCS.dcsuri', 'http://www.rthk.org.hk/asx/rthk/radio1/openline_openview/20130101.asx', 'WT.ti', '自由風自由 PHONE','WT.cg_n','player_archive:radio1/openline_openview' 'WT.cg_s','2013-01-01')" target="_blank">Media</a><br /><a href="http://www.rthk.org.hk/smi/rthk/radio1/openline_openview/20130101.smi"  onclick="dcsMultiTrack('DCS.dcsuri', 'http://www.rthk.org.hk/smi/rthk/radio1/openline_openview/20130101.smi', 'WT.ti', '自由風自由 PHONE','WT.cg_n','player_archive:radio1/openline_openview' 'WT.cg_s','2013-01-01')" target="_blank">Real</a></li>					                                                             

					</ul>
					<div class="clear-both"></div>
				</div>


							<div id="prog-content">                
				<div id="epi-list">
					<div class="jumpmenu">
						<form>
						<select name="epiSelect" id="epiSelect" onmousedown="this.style.width='auto'" onblur="this.style.width='100%'" onChange="MM_jumpMenu('parent',this,0)">
						<option value="">選擇集數</option>
						
						<option value="programme.php?name=radio1/openline_openview&d=2014-01-10&p=1069&e=247042&m=episode">2014-01-10 施政報告前瞻︰教育</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2014-01-09&p=1069&e=246886&m=episode">2014-01-09 民主黨指「三軌方案」無提到缺一不可</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2014-01-08&p=1069&e=246715&m=episode">2014-01-08 真普聯發表政改方案</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2014-01-07&p=1069&e=246478&m=episode">2014-01-07 明報撤換總編輯劉進圖</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2014-01-06&p=1069&e=246251&m=episode">2014-01-06 愉園球員球場被廉署帶走協助調查</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2014-01-03&p=1069&e=245967&m=episode">2014-01-03 虐殺流浪貓阿Miu 兩青年判囚16個月</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2014-01-02&p=1069&e=245786&m=episode">2014-01-02 元旦遊行人數減少</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2014-01-01&p=1069&e=245623&m=episode">2014-01-01 民陣舉行元旦大遊行</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-31&p=1069&e=245467&m=episode">2013-12-31 民陣明元旦遊行建制派團體沿途擺街站</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-30&p=1069&e=245312&m=episode">2013-12-30 北角五洲大廈三級火15人留醫5人危殆</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-27&p=1069&e=245056&m=episode">2013-12-27 元旦有多個團體舉辦遊行</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-26&p=1069&e=244867&m=episode">2013-12-26 少數族裔貧窮問題</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-25&p=1069&e=244828&m=episode">2013-12-25 貧窮兒童的聖誕願望</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-24&p=1069&e=244737&m=episode">2013-12-24 美容業反對一刀切規管行業</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-23&p=1069&e=244604&m=episode">2013-12-23 消息指伊利沙伯醫院將搬啟德重建</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-20&p=1069&e=244324&m=episode">2013-12-20 香港電訊收購CSLNW</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-19&p=1069&e=244184&m=episode">2013-12-19 消委會指兩大超市向供應商施壓</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-18&p=1069&e=244055&m=episode">2013-12-18 終院判決居港一年可申綜援</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-17&p=1069&e=243938&m=episode">2013-12-17 終院裁定綜緩申請人需居港滿七年違憲</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-16&p=1069&e=243756&m=episode">2013-12-16 港鐵將軍澳綫服務癱瘓近5小時</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-13&p=1069&e=243508&m=episode">2013-12-13 有藥房以高達584元出售某品牌奶粉</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-12&p=1069&e=243283&m=episode">2013-12-12 深圳龍崗活禽市場驗出H7N9</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-11&p=1069&e=243125&m=episode">2013-12-11 政改諮詢系列︰專訪陳弘毅</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-10&p=1069&e=243002&m=episode">2013-12-10 兩電今公布來年電費加價</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-09&p=1069&e=242867&m=episode">2013-12-09 梁振英出席地區諮詢會曾俊華被雞蛋扔中</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-06&p=1069&e=242642&m=episode">2013-12-06 南非前總統曼德拉病逝</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-05&p=1069&e=242471&m=episode">2013-12-05 林鄭否認中央官員為政改設限</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-04&p=1069&e=242341&m=episode">2013-12-04 政改諮詢正式啟動</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-03&p=1069&e=242140&m=episode">2013-12-03 馮煒光獲委任為新聞統籌專員</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-12-02&p=1069&e=241987&m=episode">2013-12-02 泰國局勢惡化保安局對曼谷發出紅色外遊警示</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-29&p=1069&e=241719&m=episode">2013-11-29 柏志高︰考慮把專上學歷公屋申請者扣分</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-28&p=1069&e=241597&m=episode">2013-11-28 李嘉誠：香港不能「人治」 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-27&p=1069&e=241471&m=episode">2013-11-27 帳委會報告譴責湯顯明</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-26&p=1069&e=241335&m=episode">2013-11-26 深圳港籍學生班收雙非童</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-25&p=1069&e=241158&m=episode">2013-11-25 吾爾開希過境向港投案被遣返</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-22&p=1069&e=240865&m=episode">2013-11-22 旺角行人專區時間縮短</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-21&p=1069&e=240702&m=episode">2013-11-21 李飛明日到禮賓府出席午宴</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-20&p=1069&e=240590&m=episode">2013-11-20 無線台慶平均收線29點</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-19&p=1069&e=240439&m=episode">2013-11-19 梁振英指認真跟進顧問公司批評</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-18&p=1069&e=240301&m=episode">2013-11-18 陳茂波視察新界東北再遇抗議</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-15&p=1069&e=240061&m=episode">2013-11-15 香港民情指數跌至20年來最低</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-14&p=1069&e=239909&m=episode">2013-11-14 李國能：不應以人大釋法推翻終院判決</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-13&p=1069&e=239812&m=episode">2013-11-13 林鄭月娥︰賑災與菲律賓人質事件不應混為一談</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-12&p=1069&e=239627&m=episode">2013-11-12 菲律賓風災逾萬人死亡</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-11&p=1069&e=239488&m=episode">2013-11-11 林煥光促梁振英檢討發牌惹爭議</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-08&p=1069&e=239228&m=episode">2013-11-08 陳弘毅︰政府不再問通訊局意見或違反程序公義</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-07&p=1069&e=239091&m=episode">2013-11-07 立法會否決特權法索電視發牌文件</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-06&p=1069&e=238947&m=episode">2013-11-06 立法會今審議特權法查港視發牌事件</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-05&p=1069&e=238843&m=episode">2013-11-05 政府發表六頁紙文件解釋發牌理據</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-04&p=1069&e=238653&m=episode">2013-11-04 政府會晤建制派議員游說不支持特權法</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-11-01&p=1069&e=238405&m=episode">2013-11-01 高永文︰七項建議分涉醫療程序的美容服務</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-31&p=1069&e=238230&m=episode">2013-10-31 人質家屬代表與洪英鐘再開會</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-30&p=1069&e=238075&m=episode">2013-10-30 港芭蕾舞團劇目疑抽起文革戲</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-29&p=1069&e=237929&m=episode">2013-10-29 香港電視指如有合理解釋 考慮毋須司法覆核 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-28&p=1069&e=237776&m=episode">2013-10-28 34名立會議員聯署促發3個免費電視牌照</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-25&p=1069&e=237533&m=episode">2013-10-25 有學者批評人口政策只見樹木不見森林</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-24&p=1069&e=237410&m=episode">2013-10-24 建制議員聯署指佔中發起人勾結台獨勢力</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-23&p=1069&e=237198&m=episode">2013-10-23 建制議員聯署批評佔中發起人與台獨分子見面</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-22&p=1069&e=237003&m=episode">2013-10-22 王維基指梁振英解釋火上加油　決定司法覆核 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-21&p=1069&e=236795&m=episode">2013-10-21 多位政界人士促請政府公開免費電視發牌理據</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-18&p=1069&e=236489&m=episode">2013-10-18 政府宣佈政改諮詢年底啟動</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-17&p=1069&e=236323&m=episode">2013-10-17 梁振英出席立法會答問大會</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-16&p=1069&e=236183&m=episode">2013-10-16 香港電視不獲發牌裁員320人</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-15&p=1069&e=236041&m=episode">2013-10-15 政府批出電視牌照予有線電盈</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-14&p=1069&e=235902&m=episode">2013-10-14 下白泥蠅患 疑與堆填區有關</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-11&p=1069&e=235681&m=episode">2013-10-11 菲傳媒指梁振英同意「放下」人質事件</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-10&p=1069&e=235594&m=episode">2013-10-10 立法會討論閒置軍事用地問題</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-09&p=1069&e=235467&m=episode">2013-10-09 有政黨促限菲律賓人入境及停上輸入菲傭</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-08&p=1069&e=235305&m=episode">2013-10-08 梁振英指與菲總統同意就人質事件展開會談</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-07&p=1069&e=235143&m=episode">2013-10-07 逾500本地父母遊行爭取香港人幼稚園優先入學</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-04&p=1069&e=234854&m=episode">2013-10-04 港大校務委員會委任馬斐森為新校長 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-03&p=1069&e=234709&m=episode">2013-10-03 考評局向員工發放獎金七百萬惹爭議</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-02&p=1069&e=234530&m=episode">2013-10-02 國慶觀升旗學民成員靜默示威被拖走</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-10-01&p=1069&e=234430&m=episode">2013-10-01 南丫海難一周年官方無悼念活動 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-30&p=1069&e=234286&m=episode">2013-09-30 政府公布香港首條貧窮線</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-27&p=1069&e=234034&m=episode">2013-09-27 政府明天公布貧窮線</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-26&p=1069&e=233902&m=episode">2013-09-26 社區驗毒諮詢四個月</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-25&p=1069&e=233758&m=episode">2013-09-25 都市固體廢物收費諮詢公眾意見</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-24&p=1069&e=233556&m=episode">2013-09-24 政府加碼資助淘汰老舊柴油車涉117億 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-23&p=1069&e=233431&m=episode">2013-09-23 政府周末公佈香港首條「貧窮線」</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-20&p=1069&e=233238&m=episode">2013-09-20 無線指通訊局指控沒有根據不排除提出上訴</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-19&p=1069&e=233159&m=episode">2013-09-19 通訊事務管理局裁定無線違反競爭條文 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-18&p=1069&e=233017&m=episode">2013-09-18 夫婦虐印傭分別判囚3年3月及5年半 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-17&p=1069&e=232869&m=episode">2013-09-17 梁振英建議擴大接待自由行能力</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-16&p=1069&e=232718&m=episode">2013-09-16 梁振英總結三次落區 稱與市民保持「零距離」</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-13&p=1069&e=232433&m=episode">2013-09-13 海關抽檢海天堂龜苓膏樣本</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-12&p=1069&e=232318&m=episode">2013-09-12 政府公布廉署獨立委員會報告</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-11&p=1069&e=232152&m=episode">2013-09-11 梁振英指政府對樓市辣招立場不變 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-10&p=1069&e=232048&m=episode">2013-09-10 鄧竟成任郊野公園委會主席惹爭議</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-09&p=1069&e=231924&m=episode">2013-09-09 陳茂波網誌撰文提郊野公園覓地建屋</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-06&p=1069&e=231708&m=episode">2013-09-06 科大辦家長日被指大學幼園化</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-05&p=1069&e=231455&m=episode">2013-09-05 環保團體發公開信關注台山核電廠安全</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-04&p=1069&e=231300&m=episode">2013-09-04 張德江會見香港紀律部隊交流團</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-03&p=1069&e=231173&m=episode">2013-09-03 長遠房屋策略督導委員會公布諮詢文件</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-09-02&p=1069&e=231029&m=episode">2013-09-02 新界東北拆長者村 石仔嶺逾千長者受影響</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-30&p=1069&e=230799&m=episode">2013-08-30 屋宇署獲法庭頒啟明街封閉令 　  </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-29&p=1069&e=230476&m=episode">2013-08-29 學民思潮全民提名聯署約章</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-28&p=1069&e=230339&m=episode">2013-08-28 醫管局設委員會查余卓文被封刀事件 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-27&p=1069&e=230181&m=episode">2013-08-27 關愛基金向工廈及商廈的劏房戶發放一次過津貼</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-26&p=1069&e=229997&m=episode">2013-08-26 屋署發封樓令 啟明街40戶需月內搬遷</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-23&p=1069&e=229725&m=episode">2013-08-23 前副廉政專員李銘澤撰文指梁振英令廉署政治化</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-22&p=1069&e=229575&m=episode">2013-08-22 馬尼拉人質事件3周年家屬今入稟民事索償</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-21&p=1069&e=229470&m=episode">2013-08-21 政府就規管光污染諮詢兩個月</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-20&p=1069&e=229336&m=episode">2013-08-20 新加坡公布新一輪發展藍圖</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-19&p=1069&e=229212&m=episode">2013-08-19 梁振英昨日觀塘再落區</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-16&p=1069&e=228953&m=episode">2013-08-16 團體發起佔領中電行動</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-15&p=1069&e=228822&m=episode">2013-08-15 教育局公布跨境學童增八校網選擇</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-14&p=1069&e=228706&m=episode">2013-08-14 強颱風尤特掠香港凌晨掛8號風球</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-13&p=1069&e=228585&m=episode">2013-08-13 幫港出聲行動登全版廣告</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-12&p=1069&e=228453&m=episode">2013-08-12 梁振英要求教育局就林慧思事件提交報告</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-09&p=1069&e=228179&m=episode">2013-08-09 政黨引述教局月中公布跨境學童校網安排 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-08&p=1069&e=228067&m=episode">2013-08-08 廉署入稟向商台陽光時務索訪問紀錄</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-07&p=1069&e=227952&m=episode">2013-08-07 政府上載政治委任官員涉潛在利益衝突新指引</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-06&p=1069&e=227797&m=episode">2013-08-06 團體發起「反辣招」簽名行動</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-05&p=1069&e=227636&m=episode">2013-08-05 林慧思事件引發千人旺角行人專用區對疊</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-02&p=1069&e=227405&m=episode">2013-08-02 發展局政助何建宗被指家族持新界東北地皮</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-08-01&p=1069&e=227255&m=episode">2013-08-01 律政司決定不檢控林奮強  </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-31&p=1069&e=227121&m=episode">2013-07-31 林慧思事件 有團體周日發起行動支持警察</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-30&p=1069&e=226983&m=episode">2013-07-30 陳茂波再出席立法會指「要講的已說講完」</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-29&p=1069&e=226809&m=episode">2013-07-29 大球場草地變「爛地」曾德成稱感抱歉 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-26&p=1069&e=226574&m=episode">2013-07-26 長策會同意未來10年公私營房屋六比四</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-25&p=1069&e=226414&m=episode">2013-07-25 陳茂波出席立法會再就擁農地事件解畫</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-24&p=1069&e=226282&m=episode">2013-07-24 報道指陳茂波兒子曾擁地皮權益</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-23&p=1069&e=226148&m=episode">2013-07-23 陳茂波再次交代太太擁農地事件 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-22&p=1069&e=226001&m=episode">2013-07-22 鄭耀棠「艷星論」論篩選</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-19&p=1069&e=225759&m=episode">2013-07-19 陳冠中表態參與佔中</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-18&p=1069&e=225608&m=episode">2013-07-18 有報導指大量「洋垃圾」運港棄置堆填區</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-17&p=1069&e=225490&m=episode">2013-07-17 陳啟宗批評曾俊華是大罪人</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-16&p=1069&e=225348&m=episode">2013-07-16 張曉明赴立法會與議員午宴</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-15&p=1069&e=225194&m=episode">2013-07-15 商品說明條例新修訂今周五生效</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-12&p=1069&e=224954&m=episode">2013-07-12 堆填區撥款申請料今日不能完成討論 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-11&p=1069&e=224786&m=episode">2013-07-11 特首出席答問大會 議員要求政改諮詢時間表</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-10&p=1069&e=224649&m=episode">2013-07-10 陳茂波指若收回粉嶺高球會發展不怕打官司</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-09&p=1069&e=224511&m=episode">2013-07-09 劉皇發支持拉布阻堆填區撥款</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-08&p=1069&e=224403&m=episode">2013-07-08 戴耀廷出席協恩中學講座談佔中</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-05&p=1069&e=224227&m=episode">2013-07-05 政府稱新界東北發展模式為傳統新市鎮加強版</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-04&p=1069&e=224036&m=episode">2013-07-04 發展局公布新界東北發展區修訂方案</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-03&p=1069&e=223869&m=episode">2013-07-03 議員質疑政府隱瞞西九超支</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-02&p=1069&e=223743&m=episode">2013-07-02 七一遊行 民陣指43萬人 警方指6.6萬</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-07-01&p=1069&e=223618&m=episode">2013-07-01 七一民陣遊行爭普選 團體同步舉行慶典</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-28&p=1069&e=223416&m=episode">2013-06-28 李國章籲大學校長勿保佔中學生</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-27&p=1069&e=223271&m=episode">2013-06-27 美國司法部指香港找借口不扣留斯諾登</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-26&p=1069&e=223162&m=episode">2013-06-26 梁振英發表施政匯報指有信心做滿任期</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-25&p=1069&e=223020&m=episode">2013-06-25 梁振英發表上任一周年施政匯報</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-24&p=1069&e=222928&m=episode">2013-06-24 斯諾登離開香港</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-21&p=1069&e=222681&m=episode">2013-06-21 林鄭月娥承認仍未夠票數支持通過堆填區擴建撥款</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-20&p=1069&e=222521&m=episode">2013-06-20 鄉議局反對政府將西灣村納入郊國野公園</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-19&p=1069&e=222411&m=episode">2013-06-19 蘇慶和指市建局賺錢將全部投放於市區重建</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-18&p=1069&e=222295&m=episode">2013-06-18 慶委會將於七月一日推出多項活動</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-17&p=1069&e=222179&m=episode">2013-06-17 政府抽起立法會擴建三個堆填區的撥款動議</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-14&p=1069&e=221879&m=episode">2013-06-14 立法會促設私人會所審核機制</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-13&p=1069&e=221750&m=episode">2013-06-13 啟德郵輪碼頭啟用</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-12&p=1069&e=221656&m=episode">2013-06-12 有公務員團體要求成立委員會仲裁加薪幅度</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-11&p=1069&e=221575&m=episode">2013-06-11 前CIA洩密者藏身香港</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-10&p=1069&e=221407&m=episode">2013-06-10 佔領中環運動舉行第一場商討日</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-07&p=1069&e=221139&m=episode">2013-06-07 3個警隊工會決定退出薪酬趨勢調查委員會 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-06&p=1069&e=221014&m=episode">2013-06-06 田北俊提特權法查商交所</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-05&p=1069&e=220868&m=episode">2013-06-05 六四晚會受風雨影響提早結束 大會宣布有15萬人出席晚會</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-04&p=1069&e=220654&m=episode">2013-06-04 浸大調查指零學生自稱中國人</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-06-03&p=1069&e=220528&m=episode">2013-06-03 李兆基捐地冀年輕人免首期月供即可置業 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-31&p=1069&e=220261&m=episode">2013-05-31 全球競爭力香港跌落第三位</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-30&p=1069&e=220110&m=episode">2013-05-30 立法會辯論毋忘六四議案遭否決</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-29&p=1069&e=219968&m=episode">2013-05-29 建制團體訪京引述王光亞無意換特首</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-28&p=1069&e=219829&m=episode">2013-05-28 梁振英指目前無計劃改組行政會議</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-27&p=1069&e=219633&m=episode">2013-05-27 學民思潮未經申請遊行往中聯辦遭警方警告</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-24&p=1069&e=219377&m=episode">2013-05-24 佔領中環下月首場商討日</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-23&p=1069&e=219225&m=episode">2013-05-23 公務員團體開會未一致確認薪酬報告</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-22&p=1069&e=219106&m=episode">2013-05-22 商交所被查張震遠暫停所有公職</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-21&p=1069&e=219023&m=episode">2013-05-21 政府十年減廢藍圖</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-20&p=1069&e=218806&m=episode">2013-05-20 張震遠交回商交所牌照</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-17&p=1069&e=218596&m=episode">2013-05-17 學生堵路女示威者遭男警熊抱拖走</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-16&p=1069&e=218530&m=episode">2013-05-16 台菲衝突︰台灣艦艇艦駛進護漁界以南 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-15&p=1069&e=218381&m=episode">2013-05-15 海難死者家屬發公開信批評梁振英無誠意 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-14&p=1069&e=218230&m=episode">2013-05-14 長實取消雍澄軒交易</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-13&p=1069&e=218101&m=episode">2013-05-13 曾鈺成剪布明日終止辯論</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-10&p=1069&e=217835&m=episode">2013-05-10 有報導指行會討論政策要先評估內地觀感</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-09&p=1069&e=217689&m=episode">2013-05-09 佔中義工陳玉峰被警方拘控</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-08&p=1069&e=217515&m=episode">2013-05-08 不滿拉纜飯鐘錢計入加薪 工人復工或存暗湧</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-07&p=1069&e=217421&m=episode">2013-05-07 碼頭罷工潮結束工人獲加薪9.8%</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-06&p=1069&e=217259&m=episode">2013-05-06 陳茂波於網誌撰文批評軍用碼頭指控失實</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-03&p=1069&e=217000&m=episode">2013-05-03 曾鈺成晤議員商拉布對策</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-02&p=1069&e=216850&m=episode">2013-05-02 梁振英成立檢討委員會跟進湯顯明事件 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-05-01&p=1069&e=216753&m=episode">2013-05-01 南丫島撞船事故調查報告指海事處責無旁賃</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-30&p=1069&e=216695&m=episode">2013-04-30 梁振英指有需要時會嚴肅處理湯顯明事件</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-29&p=1069&e=216554&m=episode">2013-04-29 政府發起家是香港運動</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-26&p=1069&e=216234&m=episode">2013-04-26 和黃登全版廣告批工會進行「文革式的揪鬥」</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-25&p=1069&e=216077&m=episode">2013-04-25 湯顯明再被揭宴中聯辦逾20次</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-24&p=1069&e=215962&m=episode">2013-04-24 有報導指湯顯明在任期間豪宴內地官員</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-23&p=1069&e=215796&m=episode">2013-04-23 財委會明早商議撥款一億賑災基金助四川</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-22&p=1069&e=215660&m=episode">2013-04-22 四川雅安七級地震增至192死</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-19&p=1069&e=215394&m=episode">2013-04-19 碼頭工潮外判商高寶突然結業</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-18&p=1069&e=215236&m=episode">2013-04-18 審計署揭發廉署公務酬酢開支超出常規</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-17&p=1069&e=215096&m=episode">2013-04-17 政府和港鐵達成票價調整新機制</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-16&p=1069&e=214960&m=episode">2013-04-16 社民連及人力預算案拉布提七百多項修訂</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-15&p=1069&e=214821&m=episode">2013-04-15 愛港力示威佔領中環論壇受影響</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-12&p=1069&e=214546&m=episode">2013-04-12 調解會議未能就工人加薪達共識 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-11&p=1069&e=214395&m=episode">2013-04-11 李柱銘收回特首普選方案</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-10&p=1069&e=214257&m=episode">2013-04-10 民建聯調查指七成人不支持佔領中環</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-09&p=1069&e=214142&m=episode">2013-04-09 私隱專員批評港鐵無處理好閉路電視片段</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-08&p=1069&e=214017&m=episode">2013-04-08 內地今日再確診3宗H7N9個案</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-05&p=1069&e=213722&m=episode">2013-04-05 內地H7N9禽流感病例增至16宗6死</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-04&p=1069&e=213591&m=episode">2013-04-04 碼頭工潮勞工處邀請三方會談失敗</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-03&p=1069&e=213502&m=episode">2013-04-03 有報導指碼頭公司高層兼任外判公司董事</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-02&p=1069&e=213404&m=episode">2013-04-02 貨櫃碼頭工潮事件 / 周一嶽：會繼續爭取性傾向人士免受歧視立法</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-04-01&p=1069&e=213225&m=episode">2013-04-01 貨櫃碼頭公司入禀申請禁制令促工人撤離 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-29&p=1069&e=213082&m=episode">2013-03-29 貨櫃碼頭工潮持續</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-28&p=1069&e=213045&m=episode">2013-03-28 喬曉陽指對抗中央不能當特首</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-27&p=1069&e=212883&m=episode">2013-03-27 私隱條例下周生效 限制轉移客戶資料作直銷推廣</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-26&p=1069&e=212734&m=episode">2013-03-26 中央對普選立場</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-25&p=1069&e=212548&m=episode">2013-03-25 終院駁回外傭居港權案上訴</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-22&p=1069&e=212067&m=episode">2013-03-22 高永文就12宗錯誤檢控攜帶米糊個案致歉</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-21&p=1069&e=211901&m=episode">2013-03-21 政府進一步諮詢維港以外填海選址 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-20&p=1069&e=211711&m=episode">2013-03-20 兩幅「港人港地」下周四正式招標</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-19&p=1069&e=211554&m=episode">2013-03-19 花園街大火死因庭裁定九名死者死於意外</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-18&p=1069&e=211378&m=episode">2013-03-18 港台風波︰公共廣播機構與作為政府部門的衝突</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-15&p=1069&e=211138&m=episode">2013-03-15 廣播處長鄧忍光出席港台員工大會</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-14&p=1069&e=210975&m=episode">2013-03-14 新創建港大投得黃竹坑私家醫院用地</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-13&p=1069&e=210848&m=episode">2013-03-13 梁振英指適時啟動政改諮詢</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-12&p=1069&e=210736&m=episode">2013-03-12 鄧忍光指並無政治干預港台</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-11&p=1069&e=210603&m=episode">2013-03-11 有指2017年普選特首要有篩選</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-08&p=1069&e=210319&m=episode">2013-03-08 政改諮詢何時展開各界意見不一</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-07&p=1069&e=210189&m=episode">2013-03-07 俞正聲閉門講話確保愛國愛港力量執政</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-06&p=1069&e=210066&m=episode">2013-03-06 胡漢清指「限奶令」違反《基本法》第115條</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-05&p=1069&e=209941&m=episode">2013-03-05 內地官媒指港限帶奶粉過激 批評政策不合理</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-04&p=1069&e=209807&m=episode">2013-03-04 再有電梯急墜 維修安全引起關注</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-03-01&p=1069&e=209572&m=episode">2013-03-01 財政預算案之土地政策 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-28&p=1069&e=209342&m=episode">2013-02-28 曾俊華被批年年錯估財政盈餘</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-27&p=1069&e=209221&m=episode">2013-02-27 新一屆政府推出首份財政預算案</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-26&p=1069&e=209030&m=episode">2013-02-26 埃及樂蜀熱氣球爆炸意外 / 中電公布業績 預告大幅加價</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-25&p=1069&e=208896&m=episode">2013-02-25 政府新辣招 樓市何去何從</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-22&p=1069&e=208602&m=episode">2013-02-22 香港單親人士數目續上升</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-21&p=1069&e=208487&m=episode">2013-02-21 曼聯對傑志球迷不滿門票少位置差</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-20&p=1069&e=208344&m=episode">2013-02-20 長實拆售酒店房 政府指一定跟進 	</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-19&p=1069&e=208227&m=episode">2013-02-19 長實拆售酒店房 手法惹爭議</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-18&p=1069&e=208115&m=episode">2013-02-18 唐英年大宅僭建事件屋宇署已發傳票</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-15&p=1069&e=207845&m=episode">2013-02-15 有團體倡議天橋底建臨時房屋</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-14&p=1069&e=207692&m=episode">2013-02-14 內地團無房住被迫瞓旅遊巴</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-13&p=1069&e=207620&m=episode">2013-02-13 新春期間旅客迫爆景點</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-12&p=1069&e=207556&m=episode">2013-02-12 風雲人物賀蛇年</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-11&p=1069&e=207515&m=episode">2013-02-11 薄扶林村的保育意義</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-08&p=1069&e=207276&m=episode">2013-02-08 政府就改善過海隧道交通分流展開3個月公眾諮詢</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-07&p=1069&e=207136&m=episode">2013-02-07 梁振英就練乙錚文章發律師信</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-06&p=1069&e=206971&m=episode">2013-02-06 教局擬增跨境校網應付跨境學童</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-05&p=1069&e=206859&m=episode">2013-02-05 長策會研究資助房屋計劃設入息下限</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-04&p=1069&e=206744&m=episode">2013-02-04 立法會召開特別會議討論本港奶粉缺貨的問題</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-02-01&p=1069&e=206488&m=episode">2013-02-01 政府宣布打擊水貨措施確保奶粉供應</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-31&p=1069&e=206371&m=episode">2013-01-31 傳鄧竟成湯顯明獲委任新一屆政協</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-30&p=1069&e=206220&m=episode">2013-01-30 18區地標工程被批醜樣阻街</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-29&p=1069&e=206094&m=episode">2013-01-29 應對奶粉荒 有建議將奶粉列為法定儲備商品</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-28&p=1069&e=205929&m=episode">2013-01-28 泛民考慮用權力及特權法傳劉夢熊解釋對特首指控</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-25&p=1069&e=205568&m=episode">2013-01-25 劉夢熊爆料風波 梁振英接受訪問否認說謊</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-24&p=1069&e=205454&m=episode">2013-01-24 奶粉再現缺貨潮 高永文指會確保供應充足</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-23&p=1069&e=205266&m=episode">2013-01-23 打擊水貨客政府拒取消一簽多行</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-22&p=1069&e=205126&m=episode">2013-01-22 政府建議立法規定遠洋船要泊岸轉油減污染</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-21&p=1069&e=204933&m=episode">2013-01-21 金融發展局架構及運作問題</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-19&p=1069&e=&m=episode">2013-01-19 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-18&p=1069&e=204678&m=episode">2013-01-18 調查指近半人指施政報告扶貧力度不足</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-17&p=1069&e=204532&m=episode">2013-01-17 梁振英任內維持七萬五千公屋單位</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-16&p=1069&e=204414&m=episode">2013-01-16 梁振英發表任內首份施政報告</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-15&p=1069&e=204306&m=episode">2013-01-15 喬曉陽希望港區人大推動年輕人認識國情</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-14&p=1069&e=204182&m=episode">2013-01-14 多個基督教團體舉行祈禱音樂會 反對訂立性傾向歧視法 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-11&p=1069&e=203911&m=episode">2013-01-11 申訴專員建議改革白車送院制度</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-10&p=1069&e=203742&m=episode">2013-01-10 大專新聞教育工作者聯席聯署反對公司條例修訂</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-09&p=1069&e=203627&m=episode">2013-01-09 《公司條例》限查冊惹爭議 </option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-08&p=1069&e=203512&m=episode">2013-01-08 統計署統計員涉造假 署方成立小組展開調查</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-07&p=1069&e=203397&m=episode">2013-01-07 有發展商建議農地免補地價建平價上車盤</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-04&p=1069&e=203163&m=episode">2013-01-04 有政黨倡議為失業綜援設年限</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-03&p=1069&e=203000&m=episode">2013-01-03 張曉明拜會梁振英指中聯辦支持政府施政</option> 
						
						<option value="programme.php?name=radio1/openline_openview&d=2013-01-02&p=1069&e=202866&m=episode">2013-01-02 有傳媒報導挺梁團體派錢動員</option> 
												<option value="programme.php?name=radio1/openline_openview&d=2013-01-01&p=1069&e=202746&m=episode" SELECTED="selected">2013-01-01 挺梁倒梁團體元旦遊行 </option>
												</select>
						</form>
					</div>
				</div>
								<div id="epi-text">
					<div id="epi-top" style="display:none;">
						<div class="titlebar">
														<span class="title">挺梁倒梁團體元旦遊行 </span><br />
														<span class="time">2013-01-01 HKT 18:20</span>
						</div>

						<div class="clear-both"></div>
					</div>
										<div class="title">
                    挺梁倒梁團體元旦遊行                    </div>
                    					<br />
主持：陳燕萍<br />
評論員：陳智傑<br />
監製：陳燕萍<br />
編導：梁仲禮<br />
資料搜集：方艷媚<br />
製作：香港電台公共事務組					<BR /><BR />
												<P><a href="http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24500.asx" onclick="dcsMultiTrack('DCS.dcsuri', 'http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24500.asx', 'WT.ti', '自由風自由 PHONE','WT.cg_n','player_archive:radio1/openline_openview' 'WT.cg_s','2013-01-01')" class="link-audio">1708-1730 挺梁倒梁團體元旦遊行</a><BR />現場報導︰高福慧</P>
												<P><a href="http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24501.asx" onclick="dcsMultiTrack('DCS.dcsuri', 'http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24501.asx', 'WT.ti', '自由風自由 PHONE','WT.cg_n','player_archive:radio1/openline_openview' 'WT.cg_s','2013-01-01')" class="link-audio">1738-1800 挺梁倒梁團體元旦遊行</a><BR />現場報導︰陳遠東</P>
												<P><a href="http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24502.asx" onclick="dcsMultiTrack('DCS.dcsuri', 'http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24502.asx', 'WT.ti', '自由風自由 PHONE','WT.cg_n','player_archive:radio1/openline_openview' 'WT.cg_s','2013-01-01')" class="link-audio">1825-1830 五分鐘點評</a><BR />【五分鐘點評】<BR>
陳智傑︰「激進」是這樣煉成的 (編輯題)</P>
												<P><a href="http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24503.asx" onclick="dcsMultiTrack('DCS.dcsuri', 'http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24503.asx', 'WT.ti', '自由風自由 PHONE','WT.cg_n','player_archive:radio1/openline_openview' 'WT.cg_s','2013-01-01')" class="link-audio">1838-1900 內地維權人士狀況回顧</a><BR />【荒誕的囚禁】<BR>
製作．採訪︰葉雅媛、陳遠東</P>
												<P><a href="http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24504.asx" onclick="dcsMultiTrack('DCS.dcsuri', 'http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24504.asx', 'WT.ti', '自由風自由 PHONE','WT.cg_n','player_archive:radio1/openline_openview' 'WT.cg_s','2013-01-01')" class="link-audio">1909-1930 內地維權人士狀況回顧</a><BR />訪問︰張耀良 (中國維權律師關注組執行委員) </P>
												<P><a href="http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24505.asx" onclick="dcsMultiTrack('DCS.dcsuri', 'http://programme.rthk.hk//assets/contentindex/asx/radio1_1069_202746_24505.asx', 'WT.ti', '自由風自由 PHONE','WT.cg_n','player_archive:radio1/openline_openview' 'WT.cg_s','2013-01-01')" class="link-audio">1938-2000 元旦遊行人士於政總集會</a><BR />現場報導︰高福慧 (政府總部現場)<BR>
現場報導︰陳遠東 (皇后大道中現場)</P>
					<BR><BR><div class="tags">Tag:  </div>

				</div>
				<div class="clear-both"></div>
			</div>
		</div>

	
		</div>
<!-- Home page revamp -->        
		<!-- end of left column --> 
        <div class="clear"></div> 
	</div>
</div> 
</div>
  <div id="globalfooter-e"> 
    <div id="gf-catergory"> 
      <div id="gf-cat-col"> 
        <h3>Explore RTHK</h3> 
        <div class="column"> 

          <ul> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=News"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_news.png" align="absmiddle" alt="News" title="News"/> News</a></li> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Current Affairs"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_currentaffairs.png" align="absmiddle" alt="Current Affairs" title="Current Affairs"/> Current Affairs</a></li> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Sports"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_sport.png" align="absmiddle" alt="Sports" title="Sports" /> Sports</a></li> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Weather"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_weather.png" align="absmiddle" alt="Weather" title="Weather" /> Weather</a></li> 
		  </ul> 
        </div> 
        <!--/.column--> 
        <div class="column"> 

          <ul> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Arts %26 Culture"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_artculture.png" align="absmiddle" alt="Arts &amp; Culture" title="Arts &amp; Culture" /> Arts &amp; Culture</a></li> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Education"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_education.png" align="absmiddle" alt="Education" title="Education"/> Education</a></li> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Personalities%20Feature"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_personalities.png" align="absmiddle" alt="Personalities Feature" title="Personalities Feature"/> Personalities Feature</a></li> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=History"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_history.png" align="absmiddle" alt="History" title="History"/> History</a></li> 
		  </ul> 
        </div> 
        <!--/.column--> 
        <div class="column"> 

          <ul> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Lifestyle"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_lifestyle.png" align="absmiddle" alt="Lifestyle" title="Lifestyle"/> Lifestyle</a></li> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Music"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_music.png" align="absmiddle" alt="Music" title="Music"/> Music</a></li> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Concert"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_concert.png" align="absmiddle" alt="Concert" title="Concert"/> Concert</a></li> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Community"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_community.png" align="absmiddle" alt="Community" title="Community"/> Community</a></li> 

            </ul> 
        </div> 
        <!--/.column--> 
        <div class="column"> 

          <ul> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Children"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_child.png" align="absmiddle" alt="Children" title="Children"/> Children</a></li> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Teenagers"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_teenager.png" align="absmiddle" alt="Teenagers" title="Teenagers"/> Teenagers</a></li> 
            <li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=Religion"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_religion.png" align="absmiddle" alt="Religion" title="Religion"/> Religion</a></li> 
			<li><a href="http://programme.rthk.hk/channel/cat_results.php?lang=eng&tag=International"><img src="http://rthk.hk/include2010/homepics/images/gf_cate_international.png" align="absmiddle" alt="International" title="International"/> International</a></li> 
			</ul> 
        </div> 
        <!--/.column--> 
		<div class="clear"></div> 
      </div> 
      <!--/gf-cat-col--> 
          </div> 
    <!--/gf-catergory--> 
      <div id="gf-cat-icons"> 
      <ul> 
          <li id="icon1"><a href="http://rthk.hk/intzone/">Soha</a></li>
		  <li id="icon2"><a href="http://rthk.hk/tools/index_e.htm">Apps</a></li>
          <li id="icon3"><a href="http://www.etvonline.tv/">eTV online</a></li>
		  <li id="icon4"><a href="http://teenpower.rthk.hk/">Teen Power</a></li>
		  <li id="icon5"><a href="http://elderly.rthk.hk/">Apower</a></li>
		  <li id="icon6"><a href="http://rthk.hk/special/pau/">PAU</a></li>
		  <li id="icon7"><a href="http://rthk.hk/about/dab/index_e.htm">RTHK Digital Audio Broadcasting</a></li>
		  <li id="icon8"><a href="http://rthk.hk/about/dtt/index_e.htm">Digital Terrestrial Television Broadcasting</a></li>
          <li id="icon9"><a href="http://cibs.rthk.hk/?lang=english">Community Involvement Broadcasting Service</a></li>
          <li id="icon10"><a href="http://rthk.hk/special/legcolive/">Legco Live</a></li>
		  <li id="icon11"><a href="http://rthk.hk/mediadigest/">Media Digest</a></li>
		  <li id="icon12"><a href="http://rthk.hk/special/index_e.htm">Special Website</a></li>

      </ul> 
      </div> 
      <!--/gf-cat-icons--> 
      <!--/gf-banners--> 
    <div id="gf-links"> 
		<a href="http://rthk.hk/about/index_e.htm" class="first">About RTHK</a> 
		<a href="http://rthk.hk/press/eng/">Press Release</a> 
		<a href="http://rthk.hk/downloads/index_e.htm">Download Zone</a> 
		<a href="http://rthk.hk/recruit/index_e.htm">Recruitment</a> 
		<a href="http://rthk.hk/tender/index_e.htm">Tender</a> 
		<a href="http://rthk.hk/copyright/index_e.htm">Copyright</a> 
		<a href="http://rthk.hk/privacy/index_e.htm">Privacy</a> 
		<a href="http://rthk.hk/w3caa/index_e.htm">Web Accessibility Conformance</a> 
		<a href="http://rthk.hk/faq/index_e.htm">FAQ</a>
		<a href="http://rthk.hk/sharing/index_e.htm">Sharing</a> 
		<a href="http://rthk.hk/contactus/index_e.htm">Contact Us</a>
        </div> 
<!--/gf-links--> 
<div id="gf-awards">
	<img src="http://rthk.hk/include2010/homepics/images/gf_awards.gif" border="0" usemap="#Map" alt="" />
    <map name="Map" id="Map">
    <area shape="rect" coords="288,10,366,63" title="Hong Kong ICT Awards 2011" alt="Hong Kong ICT Awards 2011" />
    <area shape="rect" coords="198,10,275,61" title="Top 10 .hk Website Competition" alt="Top 10 .hk Website Competition" />
    <area shape="rect" coords="376,10,431,62" title="Web Care Awards 2011" alt="Web Care Awards 2011" />
    <area shape="rect" coords="442,10,629,62" title="Meritorious Websites Contest 2011" alt="Meritorious Websites Contest 2011" />
    <area shape="rect" coords="637,10,798,62" title="2011 Healthy Mobile Phone/Tablet Apps" alt="2011 Healthy Mobile Phone/Tablet Apps" />
    </map>
	</div><!--/gf-awards-->
    <div id="gf-banners"> 
<!-- w3c
      <div id="btn-back"><a href=""></a></div>
--> 
      <ul> 
        <li><a href="http://www.brandhk.gov.hk/" target="_blank"><img src="http://rthk.hk/include2010/dummy/banner_01.jpg" alt="BrandHK" /></a></li> 
        <li><a href="http://www.gov.hk/en/residents/" target="_blank"><img src="http://rthk.hk/include2010/dummy/banner_02.jpg" alt="GovHK" /></a></li> 
        <li><a href="http://www.cedb.gov.hk/" target="_blank"><img src="http://rthk.hk/include2010/dummy/banner_cedb_e.jpg" alt="Commerce and Economic Development Bureau" /></a></li>
        <li><a href="http://www.weather.gov.hk/" target="_blank"><img src="http://rthk.hk/include2010/dummy/banner_03.jpg" alt="Hong Kong Observatory" /></a></li> 
        <li><a href="http://www.unhcr.org.hk/unhcr/en/news_and_updates/news_list/news_details.html?id=610" target="_blank"><img src="http://rthk.hk/include2010/dummy/banner_unhcr.jpg" alt="UNHCR" /></a></li> 
        
        <li><a href="http://caringcompany.org.hk/about.php?&lang=1" target="_blank"><img src="http://rthk.hk/include2010/dummy/banner_06.jpg" alt="Caring Company" /></a></li> 
      </ul> 
<!-- w3c
      <div id="btn-next"><a href=""></a></div>
--> 
    </div> 
    <!--/gf-banners--> 
    <div id="gf-copyright">&copy; 2013 rthk.hk </div> 
    <!--/gf-copyright--> 
    <div id="gf-requirement">This site is best viewed with: resolution 1024 x 768, <a href="http://www.microsoft.com/windows/internet-explorer/default.aspx" target="_blank">Internet Explorer 6.0</a> or above, <a href="http://www.adobe.com/products/flashplayer/" target="_blank">Flash Player 9.0</a> or above.</div> 
    <!--/gf-requirement--> 
    <div class="clear"></div> 
  </div> 
  <!--/globalfooter--> 
	

</div>
<!--/wrapper--> 
<link rel="image_src" href="http://rthk.hk/include2010/homepics/images/facebook.jpg" /> 
<link id="sina_image_src" rel="sina_image_src"  href="http://rthk.hk/include2010/homepics/images/facebook.jpg" /> 
</body> 
</html> 


