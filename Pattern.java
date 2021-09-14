import java.util.HashMap;
import java.util.Scanner;

public class Pattern {
    public static boolean findPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern:");
        String pattern = sc.nextLine();
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
       /* if (pattern.length() == arr.length) {
            int j = pattern.length() - 1;
            for (int i = 0; i < pattern.length() - 2; i++) {
                if (pattern.charAt(i) == pattern.charAt(j)) {
                    if (arr[i] == arr[j]) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
                j--;
            }
        }
        else{
            System.out.println("false");
        }*/
        if(pattern==null || pattern.length()==0||str==null||str.length()==0){
            return false;
        }
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String s=arr[i];
            if(!map.containsKey(c)){
                if(map.containsValue(s)){
                    return false;
                }
                map.put(c,s);
            }
            else if(!map.get(c).equals(s)){
                return false;
            }
        }
        return true;
    }
}
