import java.util.Scanner;

//Write a Java program to find sum of all prime numbers between 1 to n.
public class LoopQ28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        int count;
        int sum=0;
        for (int i=2;i<=num;i++){
            count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count<=2){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
