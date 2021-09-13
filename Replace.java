package com.company.string;
import java.util.Scanner;
public class Replace{
    public static void replace() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Enter the string to be replaced:");
        String repStr = sc.next();
        System.out.println("Enter the string for replacing:");
        String newStr = sc.next();
        String[] st = str.split(" ");
        String newString = " ";
        for (int i = 0; i < st.length; i++) {
            if (st[i].equalsIgnoreCase(repStr)) {
                st[i] = newStr;
            }
            newString += " " + st[i];
        }
        System.out.print(newString);
    }
}
