import java.util.Scanner;
//Write a Java program to check whether a number is Strong number or not.
public class LoopQ34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int num= sc.nextInt();
        int sum=0;
        int temp=num;
        while (num>0){
            int fact=1;
            int last=num%10;
            while (last>0){
                fact=fact*last;
                last--;
            }
            sum=sum+fact;
            num=num/10;
       }
        if(sum==temp){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }
    }
}
