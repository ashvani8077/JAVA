import javax.swing.*;
import java.util.Scanner;

//write a program to remove first occurence of a character from string.
public class StringQ21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String: ");
        String re= sc.nextLine();
        System.out.print("Delete: ");
        char ch=sc.next().charAt(0);
        int occ=re.indexOf(ch);
        String result="";
        for (int i=0;i<re.length();i++){
            if(i==occ){
                continue;
            }
            result=result+re.charAt(i);
        }
        System.out.println(result);
    }
}
