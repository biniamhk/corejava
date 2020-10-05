package partone;

public class PrintfDemo {
    public static void main(String [] arg){
        int i,j,k;
        i=5;  j=8; j+=8;
        k=i+j;
        System.out.println("the value of K is"+k);
 //===================================
        //biniary converter
        int binarychanger=0B101011;
        System.out.println(binarychanger);
        //post and pre increement
        int m=5;
        int n=m++ + --m;
        System.out.println("the value of n is"+n);
 // ===========================
        //bitwise operators & and /
        int a=25;
        int b=15;
         int c1=a&b;
         int c2=a/b;
        System.out.println(c1+" , "+c2);
//============================================
        //write and left shift operator
        int x=16;//        00010000
        int y1=x >>2; //this will cut two bits  ;
        int y2=x<<2;//this will add two bits
        System.out.println("the shift operators");
        System.out.println(y1+",  "+y2);
//=================================================
      boolean z=false;
      z=!z;
        System.out.println(z);
        int zi=11;
        int zy=12;
     int  sum= zi==zy ? zi+zy : zi*zy;
        System.out.println(sum);

    }
}
