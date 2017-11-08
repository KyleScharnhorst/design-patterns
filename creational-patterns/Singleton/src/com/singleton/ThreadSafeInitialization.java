package com.singleton;

/**
 * A way to make lazy initialization thread-safe.
 * Note the synchronized modifier to the getInstance method.
 */
public class ThreadSafeInitialization {

    private static ThreadSafeInitialization _instance = null;

    private ThreadSafeInitialization() {}

    public static synchronized ThreadSafeInitialization getInstance() {
        if(_instance == null) {
            _instance = new ThreadSafeInitialization();
        }
        return _instance;
    }

}
