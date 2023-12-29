import java.util.Scanner;

//Write a Java program to find LCM of two numbers.
public class LoopQ25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number1: ");
        int num1=sc.nextInt();

        System.out.print("Number2: ");
        int num2=sc.nextInt();
        int large;
        int lcm=0;
        if (num1>num2){
            large=num1;
        }
        else {
            large=num2;
        }
        int temp=num1*num2;
        while (large<=temp){
            if ((large%num1==0)&&(large%num2==0)){
                lcm=large;
                break;
            }
            large++;
        }
        System.out.println(lcm);
    }
}
