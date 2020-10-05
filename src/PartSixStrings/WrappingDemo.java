package PartSixStrings;

public class WrappingDemo {
    public static void main(String[] args) throws Exception {
        int i=5;
        Integer ii=new Integer(i);//this is Boxing
        Integer jj=i;  //autoboxing
        int j=jj.intValue();//unboxing
        int k=jj;   //auotunboxing

    }
}
