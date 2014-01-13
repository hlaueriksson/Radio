package com.hoffenkloffen.radio.entities;

public class Stream {

    public enum Protocol {
        NONE,
        HLS,
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
        if (url.startsWith("http://") && url.endsWith(".m3u8")) return Protocol.HLS;
        if (url.startsWith("mms://")) return Protocol.MMS;

        return Protocol.NONE;
    }
}
