import java.util.Scanner;

//write a program to count total number of vowels and consonant in a string.
public class StringQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        int vowel=0;
        int cons=0;
        int other=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vowel++;
                }
                else{
                    cons++;
                }
            }
            else{
                other++;
            }
        }
        System.out.println("Vowel: "+vowel);
        System.out.println("Constant: "+cons);
        System.out.println("Other Digit and Symbol: "+other);
    }
}
