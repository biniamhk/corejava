package partnineFliehandlingSerialization;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws  Exception {
        Properties p=new Properties();
        //storing data
       /*OutputStream os=new FileOutputStream("/home/biniam/Downloads/Qrcode/dataconf.properties");
        p.setProperty("url","localhost:3306/mydb");
        p.setProperty("uname","biniam");
        p.setProperty("pass","0000");
        p.store(os,"classified");*/

        //to retrive data from file
        InputStream in=new FileInputStream("/home/biniam/Downloads/Qrcode/dataconf.properties");
        p.load(in);
        System.out.println(p.getProperty("url"));
        System.out.println(p.getProperty("pass"));

        p.list(System.out); //to read all from file

    }
}