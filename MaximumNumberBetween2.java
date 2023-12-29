//Wap to find maixmum number between 2 numbers using conditional.
import java.util.Scanner;
public class MaximumNumberBetween2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No.1=");
        int num1= sc.nextInt();
        System.out.println("Enter No.2=");
        int num2= sc.nextInt();
        if (num1>num2){
            System.out.println("Number "+num1+" is Greater than number "+num2);
        }
        else {
            System.out.println("Number "+num2+" is Greater than number "+num1);
        }
    }
}


//Ashvani Sharma
//G1-14

