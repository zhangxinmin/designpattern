package com.test.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
    private Object readResolve(){
        return hungrySingleton;
    }
}
