import java.util.Scanner;

public class Pattern5 {
    public static void pattern(int num){
        for (int i=num;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
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
