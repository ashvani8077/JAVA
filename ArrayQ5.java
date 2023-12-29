import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

//Write a program to find second largest element in array.
public class ArrayQ5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of Array: ");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Value of Array: ");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[size-2]);
    }
}
