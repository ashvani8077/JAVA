//wap to find maximum number between 3 numbers.
import java.util.Scanner;
public class MaximumNumberBetween3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter No.1=");
        int a=sc.nextInt();
        System.out.printf("Enter No.2=");
        int b=sc.nextInt();
        System.out.printf("Enter No.3=");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greatest");
        }
        else if(b>c && b>a){
            System.out.println(b+" is greatest ");
        }
        else{
            System.out.println(c+" is greatest");
        }
    }
}



//Ashvani Sharma
//G1-14