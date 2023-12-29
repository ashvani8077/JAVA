import java.util.Scanner;

//Write a Java program to find sum of all odd numbers between 1 to n.
public class LoopQ8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            if (i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
