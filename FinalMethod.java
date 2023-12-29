public class FinalMethod {
    int a=5;
    void get(){         //IF WE USE FINAL HERE THERE WILL BE ERROR BECAUSE WE MAKE ONLY ONE METHOD WITH SAME NAME;
        System.out.println(a);
    }
}
class xyz extends FinalMethod{
    void get(){
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        xyz x=new xyz();
        x.get();
    }
}
