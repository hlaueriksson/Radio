package specs.radio.entities;

import com.hoffenkloffen.radio.entities.Episode;
import org.junit.Test;
import specs.BaseSpec;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class EpisodeSpec extends BaseSpec {
    protected Episode episode;

    protected void given() {
        episode = new Episode();
        episode.setUrl("mms://202.177.192.111/rthk/radio2/20130818/2013081812.asf");
    }

    @Test
    public void should_serialize_to_json() {
        String result = episode.serialize();

        assertThat(result, is(notNullValue()));
    }

    @Test
    public void should_deserialize_from_json() {
        String json = episode.serialize();
        Episode result = Episode.deserialize(json);

        assertThat(result.getUrl(), is(equalTo(episode.getUrl())));
    }
}
