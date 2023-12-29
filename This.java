public class This {
    int rollno;
    String name;
    void get(int rollno,String name){
        this.rollno=rollno;         //If we not use this. here then it define the roll number to it self and the instance variable never get their values.
        this.name=name;
    }
    void display(){
        System.out.println(rollno+" "+name);
    }

    public static void main(String[] args) {
        This s=new This();
        s.get(24,"GLA");
        s.display();
    }
}
