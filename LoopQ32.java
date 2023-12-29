import java.util.Scanner;

//Write a Java program to check whether a number is Perfect number or not.
public class LoopQ32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int num= sc.nextInt();
        int temp=num;
        int sum=0;
        for (int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(temp==sum){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not perfect Number");
        }
    }
}
