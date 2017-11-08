package com.singleton;

public class EagerInitialization {

    private static final EagerInitialization _instance = new EagerInitialization();

    private EagerInitialization() {}

    public static EagerInitialization getInstance() {
        return _instance;
    }

}
