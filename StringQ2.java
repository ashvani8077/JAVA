import java.util.Scanner;

//Write a program to copy ine string to another string.
public class StringQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String: ");
        String str=sc.nextLine();
        String str2;
        str2=str;
        System.out.print(str2);
    }
}
