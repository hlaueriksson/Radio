package specs.radio.entities;

import com.hoffenkloffen.radio.entities.Program;
import org.junit.Test;
import specs.BaseSpec;
import specs.SpecSupport;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProgramSpec extends BaseSpec {
    protected Program program;

    protected void given() {
        program = new Program();
        program.setUrl("http://programme.rthk.hk/channel/radio/programme.php?name=radio1/legco_2012_forum_gc&p=5611");
        program.setName("2012 立法會選舉論壇 - 地區選舉");
        program.setStation("radio1");
    }

    @Test
    public void should_serialize_to_json() {
        String result = program.serialize();

        assertThat(result, is(notNullValue()));
    }

    @Test
    public void should_deserialize_from_json() {
        String json = program.serialize();
        Program result = Program.deserialize(json);

        assertThat(result.getUrl(), is(equalTo(program.getUrl())));
        assertThat(result.getName(), is(equalTo(program.getName())));
        assertThat(result.getStation(), is(equalTo(program.getStation())));
    }

    @Test
    public void should_deserialize_list_from_json() throws IOException {
        String json = SpecSupport.readFile("\\RTHK\\res\\raw\\programs.json");
        List<Program> result = Program.deserializeList(json);

        assertThat(result.size(), is(equalTo(538)));

        assertThat(result.get(0).getUrl(), is(equalTo(program.getUrl())));
        assertThat(result.get(0).getName(), is(equalTo(program.getName())));
        assertThat(result.get(0).getStation(), is(equalTo(program.getStation())));
    }
}
