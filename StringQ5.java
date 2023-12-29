import java.util.Scanner;

//Write a program to convert lowercase string to uppercase
public class StringQ5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String: ");
        String str=sc.nextLine();
        str=str.toUpperCase();
        System.out.println(str);
    }
}
