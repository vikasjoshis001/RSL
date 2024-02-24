import java.util.*;
public class LEAP {
    static int leap(int n){
        if(n % 400 == 0 || n % 100 != 0 && n % 4 ==0 ){
            return 1;
            
        }
        else return 0;
    }
    public static void main(String[] args) {
        int y = 400;
        System.out.println(leap(y));
    }
    
}
