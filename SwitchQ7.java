import java.util.Scanner;

//Write a Java program to create Simple Calculator using switch case .
public class SwitchQ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Calculator");
        System.out.print("Enter first number=");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number= ");
        int num2 = scanner.nextInt();
        System.out.println("Please Choose an Operation:");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtract");
        System.out.println("3 for Multiply");
        System.out.println("4 for Divide");
        int operation=scanner.nextInt();
        int result = 0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Wrong Operation.");
                return;
        }
        System.out.println("Result: " + result);
    }
}
