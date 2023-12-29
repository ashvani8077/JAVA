import java.util.Scanner;

//Write a java program to search all occurrences of a character in given string.
public class StringQ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        System.out.print("Find: ");
        String s=sc.next();
        int re;
        char c=s.charAt(0);
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==c){
                System.out.println(i+" ");
            }
        }
    }
}
