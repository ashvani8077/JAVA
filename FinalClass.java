public class FinalClass {                   //IF WE USE FINAL HERE THERE WILL BE ERROR BECAUSE WE MAKE ONLY ONE CLASS WITH SAME NAME;
    void get(){
        System.out.println("Class 1");
    }
}
class abc extends FinalClass{
    void get(){
        System.out.println("Class 2");
    }

    public static void main(String[] args) {
        abc x=new abc();
        x.get();
    }
}
