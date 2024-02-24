import java.util.*;
public class roman_to_integer {
    public static final Map<String,Integer> romanVsInt = new HashMap<>();

    static{
        romanVsInt.put("I", 1);
    romanVsInt.put("V", 5);
    romanVsInt.put("X", 10);
    romanVsInt.put("L", 50);
    romanVsInt.put("C", 100);
    romanVsInt.put("D", 500);
    romanVsInt.put("M", 1000);
    romanVsInt.put("IV", 4);
    romanVsInt.put("IX", 9);
    romanVsInt.put("XL", 40);
    romanVsInt.put("XC", 90);
    romanVsInt.put("CD", 400);
    romanVsInt.put("CM", 900);
    
    public static int  ans(String s){
        int result = 0;
        int i = s.length() - 1;
        while(i >= 0){

            if( i - 1 >= 0 && romanVsInt.containsKey(s.substring(i-1,i+1)) ){
                result += romanVsInt.get(s.substring(i-1,i+1));
                i = i - 2;

            }
            else {
                result += romanVsInt.get(s.charAt(i) + "");
                i--;
            }
        }
        
        System.out.println(result);
    }
}

    public static void main(String[] args){
        String input = "MCMIV";
     
    System.out.print("Integer form of Roman Numeral is " +
                     ans(input));
    }

    
}
