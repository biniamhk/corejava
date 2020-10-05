package partthree;

import java.util.Random;

public class DemoPartThree {
    public static void main(String[] args) {
       /* int a[] = new int[4];
        a[0] = 1;
        a[1] = 4;
        a[2] = 6;
        a[3] = 8;
        try {
            for (int i = 0; i < 8; i++)//USING NORMAL FORLOOP
                System.out.println(a[i]);
        } catch (Exception e) {
            System.out.println("max value is 4");

        }
        for (int k : a)
            System.out.println(k + "  ");//USING ENHANCED FOR LOOP
        //ASSIGNING VALUES TO ARRAY USING RANDOM VALUE
        int x[] = new int[20];
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(50);
        }
        for (int y : x)
            System.out.println(y)*/

        //TWO DIMENTIONAL ARRAY
        int p[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println(" ");
        }

        //HOW TO PRINT 2D ARRAY USING ENHANCED FOR LOOP
        for(int i[]:p){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        //THREE DIMENTIONAL ARRAY
       int a[][][]=new int[4][4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    a[i][j][k]=i+j+k;
                    System.out.println(a[i][j][k]);

                }
            }

        }
//PRINTING 3D ARRAY USING NORMAL FOR LOOP
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    System.out.print(a[i][j][k]);

                }
                System.out.println("");
            }
            System.out.println("");

        }

//PRINTING 3D ARRAY USING INHANCED FOR LOOP
        for(int i[][]:a){
            for(int j[]:i){
                for(int k:j){
                    System.out.print(k);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }


}
