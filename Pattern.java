import java.util.Scanner;

public class Pattern {
    public static void findPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern:");
        String pattern = sc.nextLine();
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        if (pattern.length() == arr.length) {
            int j = pattern.length() - 1;
            for (int i = 0; i < pattern.length() - 2; i++) {
                if (pattern.charAt(i) == pattern.charAt(j)) {
                    if (arr[i] == arr[j]) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
                j--;
            }
        }
        else{
            System.out.println("false");
        }
    }
}
