//wap to find factorial of any number.
import java.util.*;
public class FactorialOfAnyNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int f=1;
        for(int i=n;i>=1;i--){
            f=f*i;
        }
        System.out.println(f);
    }
}




//Ashvani Sharma
//G1-14