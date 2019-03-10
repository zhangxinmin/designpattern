package com.test.singleton;

import java.io.*;

public class SerialTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton c1=null;
        HungrySingleton c2=HungrySingleton.getInstance();
        FileOutputStream fos = new FileOutputStream(new File("serializeobj"));
        ObjectOutputStream oos= new ObjectOutputStream(fos );
        oos.writeObject(c2 );
        oos.flush();oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("serializeobj")));
        Object o = ois.readObject();
        ois.close();
        c1=(HungrySingleton) o;
        System.out.println(c1==c2);
    }
}
