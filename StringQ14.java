import java.util.Scanner;

//Write a java program to find first occurrence of a character in a given string.
public class StringQ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        System.out.print("Find: ");
        String s=sc.next();
        int re=-1;
        char c=s.charAt(0);
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==c){
                re=i;
                break;
            }
        }
        System.out.println(re);
    }
}
