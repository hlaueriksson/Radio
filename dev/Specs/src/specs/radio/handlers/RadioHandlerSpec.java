package specs.radio.handlers;

import com.hoffenkloffen.radio.entities.Episode;
import com.hoffenkloffen.radio.entities.Program;
import com.hoffenkloffen.radio.entities.Station;
import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.handlers.*;
import org.junit.Test;
import org.mockito.Mockito;
import specs.BaseSpec;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class RadioHandlerSpec extends BaseSpec {
    protected RadioHandler handler;

    private IStationHandler stationHandler;
    private IProgramHandler programHandler;
    private IEpisodeHandler episodeHandler;
    private IStreamHandler streamHandler;

    protected void given() {
        stationHandler = Mockito.mock(IStationHandler.class);
        programHandler = Mockito.mock(IProgramHandler.class);
        episodeHandler = Mockito.mock(IEpisodeHandler.class);
        streamHandler = Mockito.mock(IStreamHandler.class);

        handler = new RadioHandler(stationHandler, programHandler, episodeHandler, streamHandler);
    }

    @Test
    public void should_return_stations() {
        Mockito.when(stationHandler.getStations()).thenReturn(Arrays.asList(new Station()));

        List<Station> result = handler.getStations();

        assertThat(result.isEmpty(), is(false));
    }

    @Test
    public void should_return_programs() {
        Mockito.when(programHandler.getPrograms(null)).thenReturn(Arrays.asList(new Program()));

        List<Program> result = handler.getPrograms(null);

        assertThat(result.isEmpty(), is(false));
    }

    @Test
    public void should_return_episodes() {
        Mockito.when(episodeHandler.getEpisodes(null)).thenReturn(Arrays.asList(new Episode()));

        List<Episode> result = handler.getEpisodes(null);

        assertThat(result.isEmpty(), is(false));
    }

    @Test
    public void should_return_stream() {
        Mockito.when(streamHandler.getStream(null)).thenReturn(new Stream());

        Stream result = handler.getStream(null);

        assertThat(result, is(notNullValue()));
    }
}
