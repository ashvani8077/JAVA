import java.util.Scanner;

//Write a Java program to print all Perfect numbers between 1 to n.
public class LoopQ33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int num= sc.nextInt();
        for (int i=1;i<=num;i++){
            int temp=i;
            int sum=0;
             for (int j=1;j<i;j++){
                 if(i%j==0){
                     sum=sum+j;
                 }
                 if(temp==sum){
                     System.out.println(i);
                     break;
                 }
             }
        }
    }
}
