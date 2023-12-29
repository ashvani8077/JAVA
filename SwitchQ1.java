import java.util.Scanner;

//Write a Program to print day of week name using switch case.
public class SwitchQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Day Number Between 1-7 only:");
        int num= sc.nextInt();
        String re;
        switch (num){
            case 1:
                re="SUNDAY";
                break;
            case 2:
                re="MONDAY";
                break;
            case 3:
                re="TUESDAY";
                break;
            case 4:
                re="WEDMESDAY";
                break;
            case 5:
                re="THURSDAY";
                break;
            case 6:
                re="FRIDAY";
                break;
            case 7:
                re="SATURDAY";
                break;
            default:
                re="Please enter number only between 1-7.";
        }
        System.out.println(re);
    }
}
