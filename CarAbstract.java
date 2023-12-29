//32.Take as input S, a string. Write a function that does basic string compression
// . Print the value returned. E.g. for input “aaabbccds” print out a3b2c2d1s1.
import java.util.*;
public class CarAbstract {
    public static void main(String args[]) {
        Suzuki s=new Suzuki();
        Mahindra m=new Mahindra();
        s.colour();
        s.engine();
        s.fuel();
        s.price();
        s.sheet();
        m.colour();
        m.engine();
        m.fuel();
        m.price();
        m.sheet();
    }
}
abstract class Car{
    Car(){
        System.out.println("Welcome To Car Showroom");
    }
    abstract void colour();
    abstract void engine();
    abstract void fuel();
    abstract void price();
    void sheet(){
        System.out.println("Car Sheet Should be 5");
    }
}
class Suzuki extends Car{
    void colour(){
        System.out.println("White");
    }
    void engine(){
        System.out.println("500hp");
    }
    void fuel(){
        System.out.println("Petrol");
    }
    void price(){
        System.out.println("5L");
    }
}
class Mahindra extends Car{
    void colour(){
        System.out.println("Black");
    }
    void engine(){
        System.out.println("1000hp");
    }
    void fuel(){
        System.out.println("Diesel");
    }
    void price() {
        System.out.println("10L");
    }
}
