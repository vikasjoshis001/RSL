import java.util.*;

class Solution {
    public static void main(String[] args) {
        String str = "vvikkkasssj";
        encodeString(str);
    }

    static void encodeString(String str) {
        int n = str.length();
        if (n == 0)
            System.out.println("");
        for(int i=0;i<n;i++){
            int count = 1;
            while(i < n-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            System.out.print(str.charAt(i)+""+count);
        }
    }

}