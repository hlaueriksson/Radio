package com.hoffenkloffen.radio.entities;

public class Stream {

    public enum Protocol {
        NONE,
        RTMP,
        MMS
    }

    private String url;

    public Stream(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public Protocol getProtocol() {
        if (url.startsWith("rtmp://")) return Protocol.RTMP;
        if (url.startsWith("mms://")) return Protocol.MMS;

        return Protocol.NONE;
    }
}
