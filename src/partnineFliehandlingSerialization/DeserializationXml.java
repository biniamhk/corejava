package partnineFliehandlingSerialization;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.List;

public class DeserializationXml {
    public static void main(String[] args) throws Exception {
        XMLDecoder xmlDecoder=new XMLDecoder(new BufferedInputStream(new FileInputStream("/home/biniam" +
                "/Downloads/Qrcode/serialazdemoXML.xml")));
      College college=(College) xmlDecoder.readObject();
        List<Student> std=college.getStd();
        for(Student values:std){
            System.out.println(values);
        }
    }
}
