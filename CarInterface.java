public class CarInterface implements Suzuki2 {
    public void colour(){
        System.out.println("White");
    }
    public void engine(){
        System.out.println("500hp");
    }
    public void fuel(){
        System.out.println("Petrol");
    }
    public void price(){
        System.out.println("5L");
    }

    public static void main(String[] args) {
        CarInterface ca=new CarInterface();
        ca.colour();
        ca.engine();
        ca.fuel();
        ca.price();
    }
}
interface Suzuki2{
    abstract void colour();
   abstract void engine();
   abstract void fuel();
    abstract void price();
}