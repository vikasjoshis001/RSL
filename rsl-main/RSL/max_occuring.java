import java.util.*;
public class max_occuring {
    static char max(String str){
        int count[] = new int[256];

        int len = str.length();
        for(int i = 0 ;i<len;i++)
                count[str.charAt(i)]++;

        int max= -1;
        char result= ' ';
        for(int i = 0; i < len ;i++){
            if(max < count[str.charAt(i)]){
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;


    }
    public static void main(String[] args) {
        String str = "sample string";
        System.out.println("max  " + max(str));
    }
    
}
