// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();  //Array Size
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){      //Array Input
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }

        for(int i:arr){
            System.out.print(i+"  ");
        }
    }
}