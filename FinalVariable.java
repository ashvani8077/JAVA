public class FinalVariable {
    int a=5;
    int b=6;        //IF WE USE FINAL HERE THERE WILL BE ERROR BECAUSE WE MAKE VALUE OF B BINAL SO WE CANT CHANGE;
    void get(){
        a=a+5;
        b=b+5;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        FinalVariable a=new FinalVariable();
        a.get();
    }
}
