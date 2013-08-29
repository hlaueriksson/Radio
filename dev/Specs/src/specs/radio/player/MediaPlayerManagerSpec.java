package specs.radio.player;

import com.hoffenkloffen.radio.player.IMediaPlayerFacade;
import com.hoffenkloffen.radio.player.MediaPlayerManager;
import com.hoffenkloffen.radio.utils.ILogFacade;
import org.junit.Test;
import org.mockito.Mockito;
import specs.BaseSpec;

import java.io.IOException;

public class MediaPlayerManagerSpec extends BaseSpec {
    protected MediaPlayerManager manager;

    private ILogFacade log;
    private IMediaPlayerFacade player;
    private String path;

    protected void given() {
        log = Mockito.mock(ILogFacade.class);
        player = Mockito.mock(IMediaPlayerFacade.class);
        path = "mms://202.177.192.111/rthk/radio2/20130818/2013081812.asf";

        manager = new MediaPlayerManager(log, player, path);
    }

    @Test
    public void should_prepare_episode() throws IOException {
        manager.prepare();

        Mockito.verify(player).setDataSource(path);
        Mockito.verify(player).prepare();
    }

    @Test
    public void should_log_if_prepare_episode_fails() throws IOException {
        Exception exception = new IOException();

        Mockito.doThrow(exception).when(player).prepare();

        manager.prepare();

        Mockito.verify(log).e("MediaPlayerManager", "Prepare failed.", exception);
    }

    @Test
    public void should_not_pause_if_not_playing() throws IOException {
        Mockito.when(player.isPlaying()).thenReturn(false);

        manager.pause();

        Mockito.verify(player, Mockito.never()).pause();
    }

    @Test
    public void should_not_stop_if_not_playing() throws IOException {
        Mockito.when(player.isPlaying()).thenReturn(false);

        manager.stop();

        Mockito.verify(player, Mockito.never()).stop();
    }
}
