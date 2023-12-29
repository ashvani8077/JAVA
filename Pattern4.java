import java.util.Scanner;

public class Pattern4 {
    public static void pattern(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Row:");
        int n1= sc.nextInt();
        pattern(n1);
    }
}
