package parteightcloning;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class QRCodeGenerator {
    public static void main(String[] args) throws Exception {

        String details = "Lidya Yehdego.\n  " +
                         "Noah och marys moster\n    " +
                         "kommer från Eritrea.\n    " +
                         "she is near to Bear than to human being.\n";
        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.GIF).stream();
        File f = new File("/home/biniam/Downloads/Qrcode/Mychanel.Jpg");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();

    }
}
