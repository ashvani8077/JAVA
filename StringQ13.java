import java.util.Scanner;

//Write a java program to reverse order of words in a
//given string.
public class StringQ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        String result="";
        String [] re=str.split(" ");
        for(int i= re.length-1;i>=0;i--){
            System.out.print(re[i]+" ");
        }

    }
}
