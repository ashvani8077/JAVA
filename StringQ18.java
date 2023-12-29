import java.util.Scanner;

//write a program to find highest frequency character in a string.
public class StringQ18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("String: ");
        String str= sc.nextLine();
        str=str.toLowerCase();
        char c='a';
        int arr[]=new int[26];
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            arr[str.charAt(i)-'a']++;
        }
        int index=0;
       int max=Integer.MIN_VALUE;
       for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.printf("%c=%d", index+97,max);
    }
}
