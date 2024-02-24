import java.util.*;
public class vowel_consonents {
    String str = "Geeks for Geeks.";
    void words( ){
        int wCount = 0,uCount = 0,vCount = 0;

        for(int i = 0 ; i < str.length();i++){
            char c = str.charAt(i);
            switch(c){
            case ' ':
            case '.':
                wCount++;
        }

            switch(c){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vCount++;
                
            }

            if (c >= 65 && c <= 90){
                uCount++;
            }


        
        }
        System.out.println(wCount);
        System.out.println(vCount);
        System.out.println(uCount);
    }

    void frequency( ){
        TreeMap<Character,Integer> hmap = new TreeMap<Character,Integer>();
        
        for(int i = 0; i < str.length();i++){
            Integer c = hmap.get(str.charAt(i));
            if(hmap.get(str.charAt(i)) == null)
               hmap.put(str.charAt(i),1);
            
            else
                hmap.put(str.charAt(i),++c);
        }
        for(Map.Entry m:hmap.entrySet())
        System.out.println("Character = " + m.getKey() + " Frequency =" + m.getValue());

    }
    public static void main(String[] args) {
        
        vowel_consonents obj = new vowel_consonents();
            obj.words();
            obj.frequency();
        
     
           
            
            
        
    }
}
