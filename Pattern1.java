import java.util.Scanner;

public class Pattern1 {
    public static void pattern(int row, int col){
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Row:");
        int n1= sc.nextInt();
        System.out.print("Column: ");
        int n2= sc.nextInt();
        pattern(n1,n2);
    }
}
