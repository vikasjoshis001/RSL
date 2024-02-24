import java.util.ArrayList;
import java.util.Collection;
public class MERGE_ARRAY1 {
    public static void main(String[] args) {
        Collection merged = new ArrayList<>();

        int a[] = {1,2,3,4,5};
        char c[] = {'a','v','c'};

        int ai=0;
        int ci=0;
        while(ai!=a.length || ci!=c.length){
            if(ai<a.length){
                merged.add(a[ai++]);
            }
            if(ci<c.length){
                merged.add(c[ci++]);
            }
        }

        for (Object ob : merged) {
            System.out.print(ob+" ");
        }
    }   
    
}
