package specs.rthk.handlers;

import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.rthk.handlers.MmsStreamStrategy;
import com.hoffenkloffen.radio.utils.IDownloader;
import org.junit.Test;
import org.mockito.Mockito;
import specs.BaseSpec;
import specs.SpecSupport;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class MmsStreamStrategySpec extends BaseSpec {
    protected MmsStreamStrategy strategy;

    private IDownloader downloader;

    protected void given() {
        downloader = Mockito.mock(IDownloader.class);

        strategy = new MmsStreamStrategy(downloader);
    }

    @Test
    public void should_handle_old_stream() throws Exception {
        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_old.php";
        String content = SpecSupport.readFile(path);

        path = "\\Specs\\src\\specs\\rthk\\handlers\\stream.asx";
        String response = SpecSupport.readFile(path);
        Mockito.when(downloader.getResponse("http://www.rthk.org.hk/asx/rthk/radio2/siksifung/20131229.asx")).thenReturn(response);

        Stream result = strategy.getStream(content);

        assertThat(result, is(notNullValue()));
        assertThat(result.getUrl(), is(equalTo("mms://202.177.192.111/rthk/radio1/20130101/2013010117.asf")));
    }

    @Test
    public void should_not_handle_new_stream() throws Exception {
        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_new.php";
        String content = SpecSupport.readFile(path);

        Stream result = strategy.getStream(content);

        assertThat(result, is(nullValue()));
    }

    @Test
    public void should_not_handle_missing_old_stream() throws Exception {
        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_old.php";
        String content = SpecSupport.readFile(path);

        Mockito.when(downloader.getResponse("http://www.rthk.org.hk/asx/rthk/radio2/siksifung/20131229.asx")).thenReturn(null);

        Stream result = strategy.getStream(content);

        assertThat(result, is(nullValue()));
    }

    @Test
    public void should_not_handle_invalid_old_stream() throws Exception {
        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_old.php";
        String content = SpecSupport.readFile(path);

        path = "\\Specs\\src\\specs\\rthk\\handlers\\stream_invalid.asx";
        String response = SpecSupport.readFile(path);
        Mockito.when(downloader.getResponse("http://www.rthk.org.hk/asx/rthk/radio2/siksifung/20131229.asx")).thenReturn(response);

        Stream result = strategy.getStream(content);

        assertThat(result, is(nullValue()));
    }
}
