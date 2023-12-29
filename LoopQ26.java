import java.util.Scanner;

//Write a Java program to check whether a number is Prime number or not.
public class LoopQ26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        String result = "Yes, Prime Number";
        int counter = 0;
        int i=2;
        if (num==i){
            result="Yes, Prime Number";
        }
        else {
            while (i<num){
                if (num%i==0){
                    result="Not a Prime Number";
                }
                i++;
            }
        }
        System.out.println(result);
    }
}
