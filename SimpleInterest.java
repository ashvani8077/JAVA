//wap to find the simple interest.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Amount=");
        int amount= sc.nextInt();
        System.out.println("Rate=");
        int rate= sc.nextInt();
        System.out.println("Time=");
        int time= sc.nextInt();
        int si=(amount*rate*time)/100;
        System.out.println("Simple Interest is="+si);
    }
}



//Ashvani Sharma
//G1-14
