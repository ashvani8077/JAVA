import java.util.Scanner;

//Write a Java program to count total number of even and odd elements in an array.
public class ArrayQ6 {
    public static int even(int arr[]){
        int evenno=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                evenno=evenno+1;
            }
        }
        return evenno;
    }
    public static int odd(int arr[]){
        int oddno=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2!=0){
                oddno=oddno+1;
            }
        }
        return oddno;
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
        System.out.println("Even: "+even(arr));
        System.out.println("Odd: "+odd(arr));
    }
}
