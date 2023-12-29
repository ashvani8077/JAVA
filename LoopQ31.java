import java.util.Scanner;

//Write a Java program to print all Armstrong numbers between 1 to n.
public class LoopQ31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
       // int count=0;
        for(int i=1;i<=num;i++){
            int sum=0;
            int count=0;
            int c=i;
            while(c!=0){
                c=c/10;
                count++;
               // c++;
            }
            int j=i;
            while(j!=0){
                int r=j%10;
                sum=sum+(int)Math.pow(r,count);
                j=j/10;
            }
            if (sum==i){
                System.out.println(i);
            }

        }
    }
}
