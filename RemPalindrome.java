package com.company.string;

import java.util.Scanner;

public class RemPalindrome {
    public static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)){
                return false;
            }
        }
        return true;
    }
    public static String remPali() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String finalStr="",word="";
        str=str+" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                word=word+str.charAt(i);
            }
            else{
                if(!(isPalindrome(word))){
                    finalStr+=word+" ";
                }
                word="";
            }
        }
        return finalStr;
    }
}
