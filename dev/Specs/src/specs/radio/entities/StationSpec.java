package specs.radio.entities;

import com.hoffenkloffen.radio.entities.Station;
import org.junit.Test;
import specs.BaseSpec;
import specs.SpecSupport;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class StationSpec extends BaseSpec {
    protected Station station;

    protected void given() {
        station = new Station();
        station.setUrl("http://programme.rthk.hk/channel/radio/index_archive.php#r1");
        station.setName("第一台 Radio 1");
    }

    @Test
    public void should_serialize_to_json() {
        String result = station.serialize();

        assertThat(result, is(notNullValue()));
    }

    @Test
    public void should_deserialize_from_json() {
        String json = station.serialize();
        Station result = Station.deserialize(json);

        assertThat(result.getUrl(), is(equalTo(station.getUrl())));
        assertThat(result.getName(), is(equalTo(station.getName())));
    }

    @Test
    public void should_deserialize_list_from_json() throws IOException {
        String json = SpecSupport.readFile("\\RTHK\\res\\raw\\stations.json");
        List<Station> result = Station.deserializeList(json);

        assertThat(result.size(), is(equalTo(6)));

        assertThat(result.get(0).getUrl(), is(equalTo(station.getUrl())));
        assertThat(result.get(0).getName(), is(equalTo(station.getName())));
    }
}
