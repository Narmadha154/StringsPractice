import java.util.Scanner;

public class MinDeletion {
    public static void findPali() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int i=0,j=str.length()-1,count=0;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)){
                count++;
            }
        }
        System.out.println();
    }
}
