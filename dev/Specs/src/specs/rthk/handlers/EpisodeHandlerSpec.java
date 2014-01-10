package specs.rthk.handlers;

import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.rthk.handlers.EpisodeHandler;
import com.hoffenkloffen.radio.utils.IDownloader;
import org.junit.Test;
import org.mockito.Mockito;
import specs.BaseSpec;
import specs.SpecSupport;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.anyString;

public class EpisodeHandlerSpec extends BaseSpec {
    protected EpisodeHandler handler;

    private IDownloader downloader;

    private Program program;

    protected void given() {
        downloader = Mockito.mock(IDownloader.class);

        handler = new EpisodeHandler(downloader);

        program = new Program();
        program.setUrl("http://programme.rthk.hk/channel/radio/programme.php?name=radio2/siksifung&p=4561");
    }

    @Test
    public void should_return_episodes_for_a_program() throws IOException {
        String path = "\\Specs\\src\\specs\\rthk\\handlers\\program.php";
        String response = SpecSupport.readFile(path);

        Mockito.when(downloader.getResponse(anyString())).thenReturn(response);

        List<Episode> result = handler.getEpisodes(program);

        assertThat(result.size(), is(52));

        Episode first = result.get(0);

        assertThat(first.getUrl(), is("http://programme.rthk.hk/channel/radio/programme.php?name=radio2/siksifung&d=2014-01-05&p=4561&e=246081&m=episode"));
        assertThat(first.getName(), is("2014-01-05 左膠右膠  幫倒忙?"));
    }
}
