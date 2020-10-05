package PartsevenException;

public class ExceptionDemo {
    public static void main(String[] args) {
        //UNCHECKED EXCEPTION
        int i=6,j=0,k=0;
        try {
            k=i/j;
        }catch (Exception e){
            System.out.println("can not be divided by zero");
        }
        System.out.println(k);

        }
    }

