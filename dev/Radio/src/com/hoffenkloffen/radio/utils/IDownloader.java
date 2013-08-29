package com.hoffenkloffen.radio.utils;

import java.io.InputStream;

public interface IDownloader {

    InputStream getInputStream(final String uri);
}
