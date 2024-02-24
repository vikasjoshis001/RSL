import java.util.*;
public class VOWEL_CONSO {
    public static void main(String[] args) {
        // System.out.println(
        frequencyOfNonVowels("aeio  uax  zy");
        // );
      }
    
      static void frequencyOfNonVowels(String s) {
        int fre[] = new int[256];
        int vowel = 0;
    
        for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
          if (c != 'a' && c != 'e'&&  c != 'i' &&  c != 'o' &&  c != 'u' && c!= ' ') {
            fre[c ]++;
          }else if(c !=' ') vowel++;
            
          

          
        }
    
        // print the frequency
        for (int i = 0; i < 26; i++) {
          if (fre[i] > 0) {
            
            System.out.println((char) (i + 'a') + ": " + fre[i]);
            
            
          }
         
        }
        System.out.println("vowel: " + vowel);
      }
    
}
