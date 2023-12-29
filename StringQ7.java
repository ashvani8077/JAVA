import java.util.Scanner;

//Write a java program to toggle case of each character of
//a string.
public class StringQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String k="";
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65&& str.charAt(i)<=90){
                k=k+(char)(str.charAt(i)+32);
            }
            else{
                k=k+(char)(str.charAt(i)-32);
            }
        }
        System.out.println(k);
    }
}
