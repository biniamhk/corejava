package parttwo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class DemoIf {
    public static void main(String[] args) {
        int num = 6780990;
        if (num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
//====================================0
//biger of three numbers
        int a, b, c;
        a = 8;
        b = 2;
        c = 80;
        if (a > b && a > c)
            System.out.println("A: is the bigest");
        else if (b > a && b > c)
            System.out.println("B: is the bigest");
        else
            System.out.println("c: is the bigest");

        // switch operator
        String s = "hi";

        switch (s) {
            case "hi":
                System.out.println("hello");
                break;
            case "hello":
                System.out.println("goodmorning");
                break;
        }
        System.out.println("printing pattern===============================");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("printing all ascii values");
        for (int i = 0; i <= 127; i++) {
            System.out.printf("%d : %c \n", i, i);
        }

        System.out.println("printing pattern advanced");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                int k = i + j - 1;
                if (k > 4)
                    System.out.print(k - 4 + " ");
                else
                    System.out.print(k + " ");

            }
            System.out.println("");
        }
        System.out.println(" ");
        //printing ,1 0 pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");

            }
            System.out.println(" ");
        }

        // printing numbers
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }


//fibonacii series
        int k = 0, x = 1, y = 1;
        System.out.print("1 1 ");
        while (k <= 1000) {
            k = x + y;
            System.out.print(k + " ");
            x = y;
            y = k;

        }


        //checking Palindrum numbers
        int n = 123, r, revnum = 0;
        int t = n;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            revnum = revnum * 10 + r;
        }
        if (t == revnum)
            System.out.println("\n   Palindrum");
        else
            System.out.println(" \n  not pallindrom");

//##################################checking perfect number
        int n1 = 28;
        boolean c1 = isPerfect(n);
        if (c1)
            System.out.println("Is Perfect Number");
        else
            System.out.println("It is okey");

//############################### ARMSTRONG NUMBER

        int armnum = 153;
        int temp=armnum;
        int reminder,sum=0;
        while (armnum > 0) {
            reminder = n % 10;
            armnum = n / 10;
            sum=sum+reminder*reminder*reminder;
        }
      if(sum==temp){
          System.out.println("THE NUMBER IS ARMSTRONG NUMBER");
      }
      else
          System.out.println("THE NUMBER IS NOT ARMSTRONG");

      //##############3 CHECKING NUMBER IF IT IS PRIME NUMBER
        int num1=11 ;
        boolean isPrime=true;
        for(int i=2;i<num1;i++){
            if(num1%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num1+":is a prime number");
        }
        else
            System.out.println(num1+":is not prime");
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        if (n == sum)
            return true;
        return false;


    }

}