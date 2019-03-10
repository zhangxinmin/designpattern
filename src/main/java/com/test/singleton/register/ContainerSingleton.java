package com.test.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private ContainerSingleton (){}
    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
    public static Object getBean(String className){
        synchronized(ioc){
            if(!ioc.containsKey(className)){
                Object obj=null;
                try {
                    obj= Class.forName(className );
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                ioc.put(className,obj  );
                return obj;
            }else{
                return ioc.get(className   );
            }
        }
    }

}
