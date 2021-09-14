package com.company.string;

import java.util.Scanner;

public class RemConsecutive {
    public static void remConsChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Enter the integer:");
        int k=sc.nextInt();
        int n=str.length();
        String newStr="";
        int count=0;
        for(int i=0;i<n-1;i++){
            while(str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            if(count!=k) {
                newStr += str.charAt(i);
            }
            count=0;
        }
        System.out.println(newStr);
    }
}
