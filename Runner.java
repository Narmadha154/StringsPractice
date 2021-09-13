package com.company.string;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the program number:");
        int number=sc.nextInt();
        switch(number){
            case 1:
               Replace rp=new Replace();
               rp.replace();
               break;
            case 2:
                Palindrome pali=new Palindrome();
                pali.largestPalindrome();
                break;
            case 3:
                Frequent freq=new Frequent();
                freq.findFreq();
                break;
            case 4:
                NonRepeating not=new NonRepeating();
                char ch=not.nonRepeat();
                System.out.println(ch);
                break;
            case 5:
                ConvertCase letter=new ConvertCase();
                letter.convert();
                break;
            case 6:
                Swap words=new Swap();
                words.swap();
                break;
            default:
                System.out.println("no program");
        }
    }
}
