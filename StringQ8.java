import java.util.Scanner;

//write a program to find total number of alphabet ,digit or special character in a string.
public class StringQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        int alpha = 0;
        int cha = 0;
        int digit = 0;
        for (int i = 0; i < str.length(); i++) {
            char re = str.charAt(i);
                if ((re >= 'A' && re <= 'Z') || (re >= 'a' && re <= 'z')) {
                    alpha++;
                } else if (re >= '0' && re <= '9') {
                    digit++;
                } else {
                    cha++;
                }
            }
        System.out.println("Alphabet: "+alpha);
        System.out.println("Digit: "+digit);
        System.out.println("Special Character: "+cha);
        }
    }