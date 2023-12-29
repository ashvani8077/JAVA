import java.util.Scanner;

//Write a program to concate two strings.
public class StringQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String1: ");
        String str1=sc.nextLine();
        System.out.print("String2: ");
        String str2=sc.nextLine();
        str1=str1.concat(str2);
        System.out.println(str1);

    }
}
