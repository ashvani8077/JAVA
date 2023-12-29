import java.util.Scanner;

//Write a java program to count total number of words
//in a string.
public class StringQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        String [] re=str.split(" ");
        int len= re.length;
        System.out.println(len);
    }
}
