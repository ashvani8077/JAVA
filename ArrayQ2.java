import java.util.Scanner;

//Write a Java program to print all negative elements in an array.
public class ArrayQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("SIze of Array: ");
        int size= sc.nextInt();
        int num[]=new int [size];
        System.out.println("Values of Array: ");
        for (int i=0;i< num.length;i++){
            num[i]= sc.nextInt();
        }
        for (int i:num){
            if (i<0){
                System.out.print(i+" ");
            }
        }
    }
}
