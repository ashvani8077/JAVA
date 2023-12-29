import java.util.Scanner;

//Write a Java program to check whether a character is uppercase or lowercase alphabet.
public class IfElseQ11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Only Alphabet:");
        char c=sc.next().charAt(0);
        if (c>='A'&&c<='Z'){
            System.out.println(c+" is in UPPERCASE.");
        }
        else{
            System.out.println(c+" is  in LOWERCASE.");
        }
    }
}
