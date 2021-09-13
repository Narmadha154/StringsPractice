package com.company.string;

import java.util.Scanner;

public class ConvertCase {
    public static void convert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        char [] arr=new char[str.length()];
        int k=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                arr[k++]=Character.toUpperCase(str.charAt(i));
            }
            else{
                arr[k++]=Character.toLowerCase(str.charAt(i));
            }
        }
        String newStr=String.copyValueOf(arr);
        System.out.println(newStr);
        System.out.println(str.length());
    }
}
