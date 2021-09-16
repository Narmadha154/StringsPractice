import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static boolean find(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < str1.length(); i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void findAnagram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the strings:");
        String[] words = new String[size];
        boolean val = false;
        Map<String,String> map=new HashMap<>();
        for (int i = 0; i < size; i++) {
            words[i] = sc.next();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (words[i].length() == words[j].length()) {
                    val = find(words[i], words[j]);
                }
                if (val) {
                    if(map.containsKey(words[i])){
                        map.put(words[i],map.get(words[i])+" "+words[j]);
                    }
                    else if(!map.containsValue(words[i])){
                        map.put(words[i],words[j]);
                    }
                }
            }
        }
        System.out.println(map);
    }
}
