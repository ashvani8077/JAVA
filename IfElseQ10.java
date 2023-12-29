import java.util.Scanner;

//Write a Java program to input any character and check whether it is alphabet, digit or special character.
public class IfElseQ10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Any Character:");
        char c=sc.next().charAt(0);
        if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
            System.out.print(c+" is an ALPHABET.");
        } else if (c>='0'&&c<='9')
        {
            System.out.print(c+" is a NUMERIC VALUE.");
        }
        else {
            System.out.println(c+" is SPECIAL CHARACTER.");
        }
    }
}
