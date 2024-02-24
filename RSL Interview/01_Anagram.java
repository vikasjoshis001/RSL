import java.util.*;

class Solution{
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        System.out.println(isAnagram(s1, s2));
    }

    static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int charArr1[] = new int[27];
        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            charArr1[ch1-'a']++;
            charArr1[ch2 - 'a']--;
        }

        for(int i=0;i<27;i++){
            if(charArr1[i] != 0) return false;
        }
        return true;
    }
}