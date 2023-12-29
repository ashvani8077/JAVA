import java.util.Scanner;

//Write a program to print total numeber of days in a month using switch case.
public class SwitchQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Month Number Between 1-12 only:");
        int num= sc.nextInt();
        String re;
        switch (num){
            case 1:
                re="31";
                break;
            case 2:
                re="28 or 29";
                break;
            case 3:
                re="31";
                break;
            case 4:
                re="30";
                break;
            case 5:
                re="31";
                break;
            case 6:
                re="30";
                break;
            case 7:
                re="31";
                break;
            case 8:
                re="31";
                break;
            case 9:
                re="30";
                break;
            case 10:
                re="31";
                break;
            case 11:
                re="30";
                break;
            case 12:
                re="31";
                break;
            default:
                re="Enter Only between 1-12.";
        }
        System.out.println(re);
    }
}
