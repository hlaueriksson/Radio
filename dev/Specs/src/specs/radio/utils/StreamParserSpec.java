package specs.radio.utils;

import com.hoffenkloffen.radio.entities.Stream;
import com.hoffenkloffen.radio.utils.StreamParser;
import com.hoffenkloffen.radio.utils.ILogFacade;
import org.junit.Test;
import org.mockito.Mockito;
import specs.BaseSpec;
import specs.SpecSupport;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class StreamParserSpec extends BaseSpec {
    protected StreamParser parser;

    private ILogFacade log;

    protected void given() {
        log = Mockito.mock(ILogFacade.class);

        parser = new StreamParser(log);
    }

    @Test
    public void should_handle_null_stream() {
        Stream result = parser.parse(null);

        assertThat(result, is(notNullValue()));
        assertThat(result.getUrl(), is(nullValue()));
    }

    @Test
    public void should_handle_stream_with_invalid_content() throws Exception {
        String path = "\\Specs\\src\\specs\\radio\\utils\\Stream_invalid.asx";
        InputStream stream = SpecSupport.getInputStream(path);

        Stream result = parser.parse(stream);

        assertThat(result, is(notNullValue()));
        assertThat(result.getUrl(), is(nullValue()));
    }

    @Test
    public void should_handle_stream_with_valid_content() throws Exception {
        String path = "\\Specs\\src\\specs\\radio\\utils\\Stream.asx";
        InputStream stream = SpecSupport.getInputStream(path);

        String inputStreamString = new Scanner(stream, "UTF-8").useDelimiter("\\A").next();

        InputStream stream2 = new ByteArrayInputStream(inputStreamString.getBytes("UTF-8"));

        Stream result = parser.parse(stream2);

        assertThat(result, is(notNullValue()));
        assertThat(result.getUrl(), is(equalTo("mms://202.177.192.111/rthk/radio2/20130818/2013081812.asf")));
    }
}
