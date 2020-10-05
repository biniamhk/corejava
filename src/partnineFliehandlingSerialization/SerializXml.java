package partnineFliehandlingSerialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializXml {
    public static void main(String[] args) throws Exception {
        Student st1=new Student();
        st1.setRollno(101);
        st1.setSname("Biniam");
        Student st2=new Student();
        st2.setRollno(102);
        st2.setSname("Edu");
        List<Student> std=new ArrayList<>();
        std.add(st1);
        std.add(st2);
        College college=new College();
        college.setStd(std);
        XMLEncoder xmlEncoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("/home/biniam/" +
                "Downloads/Qrcode/serialazdemoXML.xml")));
        xmlEncoder.writeObject(college);
        xmlEncoder.close();

    }
}
