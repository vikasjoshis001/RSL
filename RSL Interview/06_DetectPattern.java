import java.util.*;

class Solution{
    public static void main(String[] args) {
        String str = "1101001";
        detectPattern(str);
    }

    static void detectPattern(String str){
        int count = 0;
        char last = str.charAt(0);
        int n = str.length();
        int i=1;
        while(i<n){
            if(str.charAt(i) == '0' && last == '1'){
                while(str.charAt(i) == '0'){
                    i++;
                }
                if(str.charAt(i) == '1'){
                    count++;
                }
            }
            last = str.charAt(i);
            i++;
        }
        System.out.println(count);
    }
}