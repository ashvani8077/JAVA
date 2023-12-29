import java.util.Scanner;

//Write a program to compare two string.
public class StringQ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String1: ");
        String str1=sc.nextLine();
        System.out.print("String2: ");
        String str2=sc.nextLine();
        int re=str1.compareTo(str2);
        System.out.println(re);
    }
}
