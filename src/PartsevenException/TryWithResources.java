package PartsevenException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) {
        int i=5;
        try {
            if(i<10){
                throw new ThrowExceptions("this is error");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            String str="";
            str=br.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class ThrowExceptions extends Exception{
    public ThrowExceptions(String str) {
        System.out.println(str);
    }
}
