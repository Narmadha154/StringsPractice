import java.util.Scanner;

public class ReturnLast {
    public static int findLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        String newS = arr[arr.length - 1];
        return newS.length();
    }
}
