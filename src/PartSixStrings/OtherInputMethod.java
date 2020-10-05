package PartSixStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OtherInputMethod {
    public static void main(String[] args) {
       /* //USING SYSTEM IN
        int i=System.in.read();
        System.out.println((char) i);
        //USING BUFFER READER TO INPUT FROM USER
        System.out.println("hej user enter any number");
        InputStreamReader is=new InputStreamReader(System.in);
        //IF WE USE THE ABOVE METHOD ONLY ONCE WE CAN CHANGE LIKE BELLOW
        //BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(is);
        int num=Integer.parseInt(br.readLine());
        System.out.println(num);*/
       for(int i=0;i<3;i++){
       Scanner sc=new Scanner(System.in);
       try {

           System.out.println("enter from keyboard");
           int j=sc.nextInt();
           System.out.println("thanks topen");
       }catch(Exception e) {
           System.out.println("enter only numbers");
       }
       }
        System.out.println("Game over");

    }
}
