import java.util.Scanner;

//Write a java program to find reverse of a string.
public class StringQ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        StringBuffer sd=new StringBuffer(str);
        sd.reverse();
        System.out.println(sd);
    }
}
