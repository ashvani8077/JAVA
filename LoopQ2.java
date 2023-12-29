import java.util.Scanner;

//2. Write a Java program to print all natural numbers in reverse (from n to 1). – using whileloop
public class LoopQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int num=sc.nextInt();
        while(num>0){
            System.out.println(num);
            num--;
        }
    }
}
