import java.util.Scanner;

//wap to find maximum number of two number using switch case.
public class SwitchQ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Num1: ");
        int num1= sc.nextInt();
        System.out.print("Num2: ");
        int num2= sc.nextInt();
        int re;
        if(num1>num2){
            re=0;
        }
        else{
            re=1;
        }
        System.out.print("Greater Number is: ");
        switch (re){
            case 0:
                System.out.println(num1);
                break;
            case 1:
                System.out.println(num2);
                break;
        }
    }
}
