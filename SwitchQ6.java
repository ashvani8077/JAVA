import java.util.Scanner;

//write a program to check given number is postitive, negative, and equal.
public class SwitchQ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Num: ");
        int num= sc.nextInt();
        int re;
        if(num>0){
            re=0;
        }
        else if(num<0){
            re=1;
        }
        else {
            re=2;
        }
        switch (re){
            case 0:
                System.out.println("Positive");
                break;
            case 1:
                System.out.println("Negative");
                break;
            default:
                System.out.println("Zero");
        }
    }
}
