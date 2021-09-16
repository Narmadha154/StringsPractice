//package com.company.string;

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
            case 8:
                Roman rom=new Roman();
                rom.convertRoman();
                break;
            case 9:
                RemoveDup rem= new RemoveDup();
                rem.removeDuplicates();
                break;
            case 10:
                Pattern pat= new Pattern();
                pat.findPattern();
                break;
            case 11:
                Encode code= new Encode();
                code.encode();
                break;
            case 14:
                ReturnLast last= new ReturnLast();
                int length=last.findLength();
                System.out.println(length);
                break;
            case 16:
                Anagram ana= new Anagram();
                ana.findAnagram();
                break;
            case 18:
                MinOperation min= new MinOperation();
                min.findMinOperation();
                break;
            default:
                System.out.println("no program");
        }
    }
}
