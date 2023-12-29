import java.util.Scanner;

//Write a Java program to check whether a character is alphabet or not.
public class IfElseQ8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Any Character:");
        char c=sc.next().charAt(0);
        if ((c>='a'&& c<='z') || (c>='A'&&c<='Z')){
            System.out.print(c+" is Alphabet.");
        }
        else {
            System.out.print(c+" is not an Alphabet.");
        }
    }
}
