//wap to check is number divisible by 3 and 5.
import java.util.Scanner;
public class DivisibleBy_3_and_5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number=");
        int num=sc.nextInt();
        if (num%3==0 &&num%5==0){
            System.out.println("Yes ");
        }
        else {
            System.out.println("No");
        }
    }
}



//Ashvani Sharma
//G1-14

