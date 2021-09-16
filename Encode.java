import java.util.Scanner;

public class Encode {
    public static void encode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
                char temp;
                int res = 0;
                for (int i = 0; i < str.length(); i++) {

                  /*  if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                        temp = str.charAt(i - 1);
                        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                            res = res * 10 + (str.charAt(i) - 48);
                            i++;
                        }
                        for (int k = 0; k < res; k++) {
                            System.out.print(temp);
                        }
                    }

                    res = 0;
                }*/
                    while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
                        res=res*10+(str.charAt(i)-48);
                        i++;
                    }
                    for(int k=0;k<res;k++){
                       if(str.charAt(i)=='['||str.charAt(i)==']') {
                           System.out.print(str.charAt(i+1));
                       }
                    }
                    res=0;
                }
            }
}
