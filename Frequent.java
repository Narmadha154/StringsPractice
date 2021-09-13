package com.company.string;
import java.util.Scanner;
public class Frequent {
   public void findFreq() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string:");
       String str = sc.nextLine();
       int [] count=new int[256];
       for(int i=0;i<str.length();i++) {
           (count[str.charAt(i)])++;
       }
       int first=0,second=0;
       for(int i=0;i<256;i++){
           if(count[i]>count[first]){
               second=first;
               first=i;
           }
           else if((count[i]>count[second])&&count[i]!=count[first]){
               second=i;
           }
       }
       System.out.println((char)second);
   }
}
