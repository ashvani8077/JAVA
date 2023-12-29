import java.util.Scanner;

//Write a program to find length of a number.
public class StringQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String: ");
        String str=sc.nextLine();
        int len=str.length();
        System.out.print(len);
    }
}
