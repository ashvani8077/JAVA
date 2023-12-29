import java.util.Scanner;

public class ArrayQ8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of Array: ");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Value of Array: ");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int le=arr.length;
        int arr2[]=new int[le];
        for (int i=0;i<le;i++){
            arr2[i]=arr[i];
        }
        for (int i:arr2){
            System.out.println(i);
        }
    }
}
