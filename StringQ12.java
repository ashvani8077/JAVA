import java.util.Scanner;

//Write a java program to check whether a string is
//palindrome or not.
public class StringQ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        String temp=str;
        StringBuffer sd=new StringBuffer(str);
        sd.reverse();
        String re= sd.toString();
        if(re.equals(temp)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
