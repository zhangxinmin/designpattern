package com.test.singleton.register;

import java.io.*;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {
 //   public static void main (String[] args) throws Exception {
//        EnumSingleton ins1= null;
//        EnumSingleton ins2=EnumSingleton.getInstance();
//        ins2.setData(new Object());
//        FileOutputStream fos =  new FileOutputStream("enumsingleton");
//        ObjectOutputStream oos = new ObjectOutputStream(fos );
//        oos.writeObject(ins2  );
//        oos.flush();
//        oos.close();
//        FileInputStream fis =  new FileInputStream("enumsingleton");
//        ObjectInputStream ois = new ObjectInputStream(fis );
//        ins1=(EnumSingleton)ois.readObject();
//        ois.close();
//        System.out.println(ins1.getData());
//        System.out.println(ins2.getData());
//        System.out.println(ins2.getData()==ins1.getData());




//    }
//    public static void main(String[] args) {
//        try {
//            Class clazz = EnumSingleton.class;
//            Constructor c = clazz.getDeclaredConstructor();
//            c.newInstance();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("Tom",666);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
