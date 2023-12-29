import java.util.Scanner;
//Write a Java program to find all factors of a number.
public class LoopQ22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int num=sc.nextInt();
        System.out.print("Factors are: ");
        for (int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
    }
}
