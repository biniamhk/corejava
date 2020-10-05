package partfiveoop;

public class InheritanceDemo {
    public static void main(String[] args) {
        AddSubMul obj = new AddSubMul();
        obj.n1=25;
        obj.n2=15;
        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.mul();
        System.out.println(obj.result);

    }
}
class Add{
    int n1,n2,result;
    public void sum(){
        result=n1+n2;
    }
}
class  AddSub extends Add {
    public void sub(){
        result=n1-n2;//THESE ARE INHERITED FROM Add CLASS
    }
//THE ABOVE IS SINGLE LEVEL INHERITANCE
}
class AddSubMul extends AddSub{
    public void mul(){
        result=n1*n2;
    }
    //THIS IS MULTI LEVEL INHERITANCE
}