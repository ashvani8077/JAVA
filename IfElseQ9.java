import java.util.Scanner;

//Write a Java program to input any alphabet and check whether it is vowel or consonant.
public class IfElseQ9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Any Character:");
        char c=sc.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'|| c=='A'|| c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println(c+" is VOWEL.");
        }
        else {
            System.out.println(c+" is not a VOWEL.");
        }
    }
}
