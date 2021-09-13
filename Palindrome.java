package com.company.string;

import java.util.Scanner;

public class Palindrome {
    public static void largestPalindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int j=str.length()-1,i=0,k=0;
        char [] arr=new char[20];
        String paliStr="";
        while(i<j) {
            if (str.charAt(i) == str.charAt(j)) {
                    while (i < j && str.charAt(i + 1) == str.charAt(j-1)) {
                        arr[k++] = str.charAt(i);
                        i++;
                        j--;
                    }
                    i++;
                    j--;
            }
            else{
                i++;
                j--;
            }
        }

        paliStr=String.copyValueOf(arr,0,k);
        for(int l=k;l>0;l++){
            paliStr+=arr[l];
        }
        System.out.println(paliStr);
    }
}
