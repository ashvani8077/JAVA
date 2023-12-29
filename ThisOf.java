public class ThisOf {
    int rollnol;
    String name;
    ThisOf(){
        rollnol=10;
        name="Riya";
    }
    ThisOf(float marks){
        this();
        System.out.println(rollnol+" "+name+" "+marks);
    }

    public static void main(String[] args) {
        ThisOf t=new ThisOf(70.4f);
    }
}
