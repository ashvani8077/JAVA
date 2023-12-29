//wap to print 1 to n natural number using do while loop.
import java.util.Scanner;
public class NaturalNumberUsingDoWhile{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Last Number=");
        int num=sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;

        } while(i<num+1);
    }
}


//Ashvani Sharma
//G1-14