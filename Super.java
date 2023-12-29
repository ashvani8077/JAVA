public class Super {
   int marks=70;
   void get(){
       System.out.println("Parent class");
   }
}
class check extends Super{

    int marks=90;
    void get(){
        System.out.println(super.marks);
        System.out.println("CHild class");
    }

    public static void main(String[] args) {
        check ch=new check();
        ch.get();
    }
}
