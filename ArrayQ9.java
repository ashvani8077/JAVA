import java.util.Scanner;

//Write a Java program to insert an element in an array.
public class ArrayQ9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size: ");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for (int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int newarr[]=new int[s+1];
        System.out.print("Element: ");
        int e= sc.nextInt();
        System.out.print("Position: ");
        int p= sc.nextInt();
        for(int i=0;i<p;i++){
            newarr[i]=arr[i];
        }
        newarr[p]=e;
    }
}
