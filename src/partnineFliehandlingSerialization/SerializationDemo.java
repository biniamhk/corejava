package partnineFliehandlingSerialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        Save obj = new Save();
        obj.i = 10;
        File f = new File("/home/biniam/Downloads/Qrcode/serialazatiomdemo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save) ois.readObject();
        System.out.println("the value of the object is: " + obj1.i);


    }
}

class Save implements Serializable {
    int i;
}
