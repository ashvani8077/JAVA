import java.util.Scanner;

public class LoopQ35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int num=sc.nextInt();
        for (int i=1;i<=num;i++){
            int curr=i;
            int sum=0;
            while (curr>0){
                int fact=1;
                int last=curr%10;
                for (int j=1;j<=last;j++){
                    fact=fact*j;
                }
                sum=sum+fact;
                curr=curr/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
