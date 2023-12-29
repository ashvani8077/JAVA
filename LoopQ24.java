import java.util.Scanner;

//Write a Java program to find HCF (GCD) of two numbers.
public class LoopQ24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number1: ");
        int num1=sc.nextInt();

        System.out.print("Number2: ");
        int num2=sc.nextInt();
        int large;
        int hcf=0;
        if (num1>num2){
            large=num1;
        }
        else {
            large=num2;
        }
        for (int i=2;i<=large;i++){
            if ((num1%i==0)&&(num2%i==0)){
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
}
