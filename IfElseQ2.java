//Write a Java program to find maximum between three numbers.

import java.util.Scanner;

public class IfElseQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.1=");
        int a=sc.nextInt();
        System.out.print("Enter No.2=");
        int b=sc.nextInt();
        System.out.print("Enter No.3=");
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
