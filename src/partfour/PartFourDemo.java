package partfour;

public class PartFourDemo {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(4, 7, 8, 5);
    }
    }
    class Display{
    //SENDING VARIABLE NUMBER OF ARGUMENTS
        public void show(int ... a) {
            for (int i : a)
                System.out.println(i);
        }
    }