import java.util.*;
public class non_repeating {
    static void firstNonRepeating(int arr[], int n)
    {
        
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i],m.get(arr[i]) + 1);
            }
            else {
                m.put(arr[i], 1);
            }
        }
 
        
        for (Map.Entry<Integer, Integer> x : m.entrySet())
            if (x.getValue() > 1)
                System.out.print(x.getKey() + " ");
    }
 
    
    public static void main(String[] args)
    {
        int arr[] = { 9, 4, 9, 6, 7, 4, 5 , 5 };
        int n = arr.length;
        firstNonRepeating(arr, n);
    }
}
