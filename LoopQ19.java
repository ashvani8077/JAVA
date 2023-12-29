import java.util.Scanner;

//Write a Java program to enter a number and print it in words.
public class LoopQ19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int re;
        int num= sc.nextInt();
        while (num>0){
            re=num%10;
            num=num/10;
            switch (re) {
                case 1:
                    System.out.print("ONE ");
                    break;
                case 2:
                    System.out.print("TWO ");
                    break;
                case 3:
                    System.out.print("THREE ");
                    break;
                case 4:
                    System.out.print("FOUR ");
                    break;
                case 5:
                    System.out.print("FIVE ");
                    break;
                case 6:
                    System.out.print("SIX ");
                    break;
                case 7:
                    System.out.print("SEVEN ");
                    break;
                case 8:
                    System.out.print("EIGHT ");
                    break;
                case 9:
                    System.out.print("NINE ");
                    break;
                case 0:
                    System.out.print("ZERO ");
                    break;
                default:
                    System.out.println("ENTER ONLY INTEGER");
            }
        }
    }
}
