package ParttolvInnerclass;
enum Mobile {
    SAMSUNG(100),APPLE(200),LG;
    int price;

    Mobile() {
        price = 80;
        System.out.println("constructor");
    }
    public  int getPrice(){
        return price;
    }
    Mobile(int p){
        price=p;
    }
    public int getprice(){
        return price;
    }


}

public class EnumExample {
    public static void main(String[] args) {
        System.out.println(Mobile.SAMSUNG.getPrice());
        System.out.println(Mobile.APPLE.getPrice());
        System.out.println(Mobile.LG.getPrice());
        Mobile m=Mobile.LG;

        //listing out all values in enum
        Mobile m1[]=Mobile.values();
        for(Mobile mobile:m1)
            System.out.println(mobile);
        switch (m){
            case APPLE:
                System.out.println("best mobile ever");
                break;
            case SAMSUNG:
                System.out.println("the second best mobile");
                break;
            case LG:
                System.out.println("they are good with other electronic not with phone");
                break;

        }
    }
}
