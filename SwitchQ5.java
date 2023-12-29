import java.util.Scanner;

//Write a Java program to check whether a number is even or oddu sing switch case.
public class SwitchQ5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Num: ");
        int num= sc.nextInt();
        int re;
        if(num%2==0){
            re=0;
        }
        else{
            re=1;
        }
        switch (re){
            case 0:
                System.out.println("EVEN");
                break;
            case 1:
                System.out.println("ODD");
                break;
        }
    }
}
