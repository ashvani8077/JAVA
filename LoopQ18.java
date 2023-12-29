//Write a Java program to find frequency of each digit in a given integer.
import java.util.*;
public class LoopQ18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int cout=0;
        while(n!=0){
            int r=n%10;
            if(r==m)
                cout++;
            n=n/10;
        }
        System.out.print(cout);

    }
}
