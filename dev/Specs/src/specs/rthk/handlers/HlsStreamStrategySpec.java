package specs.rthk.handlers;

import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.rthk.handlers.HlsStreamStrategy;
import com.hoffenkloffen.radio.utils.IDownloader;
import org.junit.Test;
import org.mockito.Mockito;
import specs.BaseSpec;
import specs.SpecSupport;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class HlsStreamStrategySpec extends BaseSpec {
    protected HlsStreamStrategy strategy;

    private IDownloader downloader;

    protected void given() {
        downloader = Mockito.mock(IDownloader.class);

        strategy = new HlsStreamStrategy(downloader);
    }

    @Test
    public void should_handle_new_stream() throws Exception {
        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_new.php";
        String content = SpecSupport.readFile(path);

        path = "\\Specs\\src\\specs\\rthk\\handlers\\popup.php";
        String response = SpecSupport.readFile(path);
        Mockito.when(downloader.getResponse("http://programme.rthk.hk/channel/radio/player_popup.php?pid=4561&eid=246081&d=2014-01-05&player=mp3&type=archive&channel=radio2")).thenReturn(response);

        Stream result = strategy.getStream(content);

        assertThat(result, is(notNullValue()));
        assertThat(result.getUrl(), is(equalTo("http://stmw.rthk.hk/aod/_definst_/radio/archive/radio2/siksifung/mp3/mp3:20140105.mp3/playlist.m3u8")));
    }

    @Test
    public void should_not_handle_old_stream() throws Exception {
        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_old.php";
        String content = SpecSupport.readFile(path);

        Stream result = strategy.getStream(content);

        assertThat(result, is(nullValue()));
    }
}
