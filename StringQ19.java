import java.util.Scanner;
////write a program to find lowest frequency character in a string.
public class StringQ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int arr[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[str.charAt(i) - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                continue;
            }
            else if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.printf("%c: %d",index+97,min);
    }
}


