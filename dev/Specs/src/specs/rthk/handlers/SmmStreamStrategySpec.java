package specs.rthk.handlers;

import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.rthk.handlers.SmmStreamStrategy;
import com.hoffenkloffen.radio.utils.IDownloader;
import org.junit.Test;
import org.mockito.Mockito;
import specs.BaseSpec;
import specs.SpecSupport;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SmmStreamStrategySpec extends BaseSpec {
    protected SmmStreamStrategy strategy;

    private IDownloader downloader;

    protected void given() {
        downloader = Mockito.mock(IDownloader.class);

        strategy = new SmmStreamStrategy(downloader);
    }

    @Test
    public void should_handle_legacy_stream() throws Exception {
        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_legacy.php";
        String content = SpecSupport.readFile(path);

        path = "\\Specs\\src\\specs\\rthk\\handlers\\stream_legacy.asx";
        String response = SpecSupport.readFile(path);
        Mockito.when(downloader.getResponse("http://www.rthk.org.hk/asx/rthk/radio1/openline_openview/20130101.asx")).thenReturn(response);

        Stream result = strategy.getStream(content);

        assertThat(result, is(notNullValue()));
        assertThat(result.getUrl(), is(equalTo("mms://202.177.192.111/rthk/radio1/20130101/2013010117.asf")));
    }
}
