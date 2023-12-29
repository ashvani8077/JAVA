import java.util.Scanner;

public class ArrayQ10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter position to remove element: ");
        int in= sc.nextInt();
        int narr[]=new int[n-1];
            for(int i=0;i<in;i++){
                narr[i]=arr[i];
            }
            for(int i=in+1;i< arr.length;i++){
                narr[i-1]=arr[i];
            }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int j:narr){
            System.out.print(j+" ");
        }
    }
}
