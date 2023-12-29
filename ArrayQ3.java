import java.util.Scanner;

//Write a Java program to find sum of all array elements.
public class ArrayQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("SIze of Array: ");
        int size= sc.nextInt();
        int num[]=new int [size];
        int sum=0;
        System.out.println("Values of Array: ");
        for (int i=0;i< num.length;i++){
            num[i]= sc.nextInt();
        }
        for (int i:num){
            sum=sum+i;
        }
        System.out.println("SUM: "+sum);
    }
}
