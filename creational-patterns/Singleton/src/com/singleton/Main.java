package com.singleton;

public class Main {

    public static void main(String[] args) {
	    LazyInitialization lazySingleton = LazyInitialization.getInstance();
	    ThreadSafeInitialization threadSafeSingleton = ThreadSafeInitialization.getInstance();
	    EagerInitialization eagerSingleton = EagerInitialization.getInstance();
    }
}
