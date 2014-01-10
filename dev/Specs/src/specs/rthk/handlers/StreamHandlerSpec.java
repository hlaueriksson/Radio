package specs.rthk.handlers;

import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.rthk.handlers.StreamHandler;
import com.hoffenkloffen.radio.utils.IDownloader;
import org.junit.Test;
import org.mockito.Mockito;
import specs.BaseSpec;
import specs.SpecSupport;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StreamHandlerSpec extends BaseSpec {
    protected StreamHandler handler;

    private IDownloader downloader;

    private Episode episode;

    protected void given() {
        downloader = Mockito.mock(IDownloader.class);

        handler = new StreamHandler(downloader);

        episode = new Episode();
    }

    @Test
    public void should_return_a_radio_stream_for_an_episode_with_legacy_markup() throws IOException {
        episode.setUrl("http://programme.rthk.hk/channel/radio/programme.php?name=radio1/openline_openview&d=2013-01-01&p=1069&e=202746&m=episode");

        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_legacy.php";
        String response = SpecSupport.readFile(path);
        Mockito.when(downloader.getResponse(episode.getUrl())).thenReturn(response);

        path = "\\Specs\\src\\specs\\rthk\\handlers\\stream_legacy.asx";
        response = SpecSupport.readFile(path);
        Mockito.when(downloader.getResponse("http://www.rthk.org.hk/asx/rthk/radio1/openline_openview/20130101.asx")).thenReturn(response);

        Stream result = handler.getStream(episode);

        assertThat(result.getProtocol(), is(Stream.Protocol.MMS));
        assertThat(result.getUrl(), is("mms://202.177.192.111/rthk/radio1/20130101/2013010117.asf"));
    }

    @Test
    public void should_return_a_radio_stream_for_an_episode_with_old_markup() throws IOException {
        episode.setUrl("http://programme.rthk.hk/channel/radio/programme.php?name=radio2/siksifung&d=2013-12-29&p=4561&e=245170&m=episode");

        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_old.php";
        String response = SpecSupport.readFile(path);
        Mockito.when(downloader.getResponse(episode.getUrl())).thenReturn(response);

        Stream result = handler.getStream(episode);

        assertThat(result.getProtocol(), is(Stream.Protocol.RTMP));
        assertThat(result.getUrl(), is("rtmp://stmw.rthk.hk/aod/_definst_&file=radio/archive/radio2/siksifung/mp3/20131229.mp3"));
    }

    @Test
    public void should_return_a_radio_stream_for_an_episode_with_new_markup() throws IOException {
        episode.setUrl("http://programme.rthk.hk/channel/radio/programme.php?name=radio2/siksifung&d=2014-01-05&p=4561&e=246081&m=episode");

        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_new.php";
        String response = SpecSupport.readFile(path);
        Mockito.when(downloader.getResponse(episode.getUrl())).thenReturn(response);

        Stream result = handler.getStream(episode);

        assertThat(result.getProtocol(), is(Stream.Protocol.RTMP));
        assertThat(result.getUrl(), is("rtmp://stmw.rthk.hk/aod/_definst_&file=radio/archive/radio2/siksifung/mp3/20140105.mp3"));
    }
}
