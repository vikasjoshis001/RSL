import java.util.*;
public class anagram {
    static boolean isAnagram(String a,String b){
        if(a.length() != b.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i <a.length();i++){
            if(map.containsKey(a.charAt(i))){
                map.put(a.charAt(i),map.get(a.charAt(i)) + 1);
            }
            else{
                map.put(a.charAt(i),1);
            }
        }
        for(int i = 0; i <b.length();i++){
            if(map.containsKey(b.charAt(i))){
                map.put(b.charAt(i),map.get(b.charAt(i)) - 1);
            }
            
        }

        Set<Character> keys = map.keySet();
        for(Character key : keys){
            if(map.get(key) != 0){
                return false;
            }
            
        }
        return true;




    }
    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksdsdgeeks";

        if(isAnagram(str1, str2))
        System.out.print("anagram");
        else
        System.out.println("not");
    }
    
}
