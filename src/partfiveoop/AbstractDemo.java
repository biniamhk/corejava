package partfiveoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.xml.bind.SchemaOutputResolver;

public class AbstractDemo {
    public static void main(String[] args) {
       /*
       THIS IS NOT WORKING BECAUSE WE CAN NOT CREATE OBJECT OF ABSTRACT CLASS
        EduPhone objEdu = new EduPhone();
        objEdu.call(); */
       Biniam obj=new Biniam();//we can call all methods in Edu,Noah,Biniam classes
        obj.cook();
        obj.dance();
        obj.call();
        obj.move();

    }
}

abstract class EduPhone {
    public void call() {
        //Edu solves calling feature of phone
        System.out.println("Calling...");
    }

    //BUT EDU CAN NOT SOLVE THE PHONE TO MOVE DANCE AND COOK
    // SO SHE LEAVES TO OTHER PEOPLE TO SOLVE THEM AND DECLARE AS ABSTRACT METHODS
    public abstract void move();

    public abstract void dance();

    public abstract void cook();
}

abstract class Noah extends EduPhone { //THIS CLASS IS ABSTRACT BECAUSE
    // IT EXTENDS ABSTRACT CLASS IN WHICH IT ONLY DEFINE THE MOVE METHOD
    // BUT IF WE DEFINE ALL THE METHODS WE DONT NEED TO SAY ABSTRACT CLASS

    @Override
    public void move() {
        System.out.println("moving...");

    }
}
class Biniam extends  Noah{

    @Override
    public void dance() {
        System.out.println("dancing...");

    }

    @Override
    public void cook() {
        System.out.println("cooking.....");

    }
}