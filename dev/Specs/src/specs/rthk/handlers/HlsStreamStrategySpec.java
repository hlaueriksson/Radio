package specs.rthk.handlers;

import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.rthk.handlers.HlsStreamStrategy;
import org.junit.Test;
import specs.BaseSpec;
import specs.SpecSupport;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class HlsStreamStrategySpec extends BaseSpec {
    protected HlsStreamStrategy strategy;

    protected void given() {
        strategy = new HlsStreamStrategy();
    }

    @Test
    public void should_handle_new_stream() throws Exception {
        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_new.php";
        String content = SpecSupport.readFile(path);

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
