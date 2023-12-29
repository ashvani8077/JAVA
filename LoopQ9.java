//wap to print table of any n number.
import java.util.Scanner;
public class LoopQ9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for table=");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}