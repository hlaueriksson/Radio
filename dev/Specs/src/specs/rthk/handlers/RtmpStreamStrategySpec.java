package specs.rthk.handlers;

import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.rthk.handlers.RtmpStreamStrategy;
import org.junit.Test;
import specs.BaseSpec;
import specs.SpecSupport;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class RtmpStreamStrategySpec extends BaseSpec {
    protected RtmpStreamStrategy strategy;

    protected void given() {
        strategy = new RtmpStreamStrategy();
    }

    @Test
    public void should_handle_new_stream() throws Exception {
        String path = "\\Specs\\src\\specs\\rthk\\handlers\\episode_new.php";
        String content = SpecSupport.readFile(path);

        Stream result = strategy.getStream(content);

        assertThat(result, is(notNullValue()));
        assertThat(result.getUrl(), is(equalTo("rtmp://stmw.rthk.hk/aod/_definst_&file=radio/archive/radio2/siksifung/mp3/20140105.mp3")));
    }
}
