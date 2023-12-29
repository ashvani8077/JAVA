import java.util.Scanner;

//Write a Java program to count total number of negative elements in an array.
public class ArrayQ7 {
    public static int negative(int arr[]){
        int counting=0;
        for (int i:arr){
            if (i<0){
                counting++;
            }
        }
        return counting;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size: ");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Values:");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Negative Number: "+negative(arr));
    }
}
