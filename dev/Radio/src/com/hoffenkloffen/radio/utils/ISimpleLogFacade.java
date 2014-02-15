package com.hoffenkloffen.radio.utils;

public interface ISimpleLogFacade extends ILogFacade {

    int d(String msg);

    int i(String msg);

    int e(String msg);

    int e(String msg, Throwable tr);

    int v(String msg);

    int w(String msg);

    int wtf(String msg);
}
