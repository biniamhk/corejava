package PartSixStrings;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String s1,s2,s3;
        int length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two strings");
        s1=sc.nextLine();
        s2=sc.nextLine();
        s3=s1.concat(s2); //s1+s2; is possible
        System.out.println("this is the result of concatination : " +s3);
        length=s1.length();//to find length of string
        System.out.println("the length of the first string is : "+length);
        s1=s1.toUpperCase();//changing to upper case
        s2=s2.toLowerCase();//changing to lower case
        System.out.println(s1+"    "+s2);
        //STRNG SPLITING
        String str ="biniam,eden,noah,mary";
        String names[]=str.split(",");
        System.out.println(names[2]);

    }
}
