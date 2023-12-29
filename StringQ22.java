import javax.swing.*;
import java.util.Scanner;

//write a program to remove last occurence of a character from string.
public class StringQ22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String: ");
        String re= sc.nextLine();
        System.out.print("Delete: ");
        char ch=sc.next().charAt(0);
        int occ=re.indexOf(ch);
        String result="";
        for (int i=re.length()-1;i>=0;i--){
            if(i==occ){
                continue;
            }
            result=re.charAt(i)+result;
        }
        System.out.println(result);
    }
}
