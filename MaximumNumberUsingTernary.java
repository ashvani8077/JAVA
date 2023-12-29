//wap to find maximum number between 3 using ternary operator
import java.util.Scanner;
public class MaximumNumberUsingTernary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter No.1=");
        int a = sc.nextInt();
        System.out.printf("Enter No.2=");
        int b = sc.nextInt();
        System.out.printf("Enter No.3=");
        int c=sc.nextInt();
        int result = ( a > b ) ? (a > c ? a : c) : ( b > c ? b : c);
        System.out.println(result);
    }
}


//Ashvani Sharma
//G1-14
