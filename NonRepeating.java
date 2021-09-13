package com.company.string;

import java.util.Scanner;

public class NonRepeating {
    public static char nonRepeat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        char [] st=str.toCharArray();
        int [] freq=new int[256];
        for(int i=0;i<str.length();i++) {
            (freq[str.charAt(i)])++;
        }
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(freq[ch]==1){
                return ch;
            }
        }
        return (char) -1;
    }
}
