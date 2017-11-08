package com.singleton;

public class LazyInitialization {

    private static LazyInitialization _instance = null;

    private LazyInitialization() {}

    public static LazyInitialization getInstance() {
        if(_instance == null) {
            _instance = new LazyInitialization();
        }
        return _instance;
    }

}
