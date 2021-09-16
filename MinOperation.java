import java.util.Scanner;

public class MinOperation {
    public static void findMinOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1:");
        String str1 = sc.nextLine();
        System.out.println("Enter the string2:");
        String str2 = sc.nextLine();
        int count=0;
        int j=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(j)){
                count++;
                j++;
                i--;
            }
            j++;
        }
        System.out.println(count);
    }
}
