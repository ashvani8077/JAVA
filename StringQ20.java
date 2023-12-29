import java.util.Scanner;

//Write a program to count frequency of each character in a string.
public class StringQ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        char c = 'a';
        int arr[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.printf("%c: %d \n", i + 97, arr[i]);
            }
        }
    }
}
