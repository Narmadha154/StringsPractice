package com.company.string;

import java.util.Scanner;

public class Swap {
    public static void swap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String [] arr=str.split(" ");
      /*  int len1=arr[0].length();
        int len2=arr[arr.length-1].length();
        for(int i=arr.length-1;i>0;i--){
            if(i==arr.length){
               String temp=arr[i];
                arr[i]=arr[0];
                arr[0]=temp;
                newStr+=" "+arr[i];
            }
            else{
                newStr+=" "+arr[i];
            }
        }
        newStr+=" "+arr[0];
            System.out.print(newStr);
       /* String newS="";
        String [] newArr=newStr.split("",len1);
        for(int i=newArr.length-1;i>0;i--){
                newS+=""+arr[i];
        }
        System.out.println(newS);*/
        String temp=arr[arr.length-1];
        arr[arr.length-1]=arr[0];
        arr[0]=temp;
        String mid="";
        for(int i=arr.length-2;i>=1;i--){
            String tempS=arr[i];
            for(int j=tempS.length()-1;j>=0;j--){
               mid+=tempS.charAt(j);
            }
            mid+=" ";
        }
        System.out.println(arr[0]+" "+mid+" "+arr[arr.length-1]);
    }
}
