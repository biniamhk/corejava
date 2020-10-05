package partnineFliehandlingSerialization;

import java.io.*;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("/home/biniam/Downloads/Qrcode/demo.txt"); //creating file
        FileOutputStream fos = new FileOutputStream(f); //tells in which file to operate
        DataOutputStream dos = new DataOutputStream(fos);// writing something to the file with the help of its methods
        Scanner sc=new Scanner(System.in);

        dos.writeUTF(sc.nextLine());//"biniam haile kifle\nEden yehdego\nNoah Biniam\nMary Biniam");

        //reading something from the file
        FileInputStream fis=new FileInputStream(f);
        DataInputStream dis=new DataInputStream(fis);
        String str=dis.readUTF();
        System.out.println(str);
    }
}
