import java.util.Scanner;

//Write a Java program to find maximum and minimum element in an array.
public class ArrayQ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("SIze of Array: ");
        int size= sc.nextInt();
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        int num[]=new int [size];
        System.out.println("Values of Array: ");
        for (int i=0;i< num.length;i++){
            num[i]= sc.nextInt();
        }
        //For Large Number
        for (int i:num){
            if (i>large){
                large=i;
            }
        }

        //For Small Number
        for (int i:num){
            if (i<small){
                small=i;
            }
        }
        System.out.println("Large Number: "+large);
        System.out.println("Small Number: "+small);
    }
}
