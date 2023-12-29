//wap to check year is leap year or not.
import java.util.Scanner;
public class LeapYear{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Year=");
        int l=sc.nextInt();
        if(l%400==0 || l%4==0 && l%100!=0){
            System.out.println("Yes it is a leap year");
        }
        else{
            System.out.println("No it is not a leap year");
        }
    }
}


//Ashvani Sharma
//G1-14