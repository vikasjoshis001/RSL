import java.util.*;
public class max_dis_sameelement {
    static int max(int arr[],int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int dist = 0;
        for(int i = 0;i < n;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],i);

            else
                dist = Math.max(dist,i - map.get(arr[i]));

        }
        return dist;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,6,7,8,4};
    int n = arr.length;
    System.out.println(max(arr,n));
    }
    
}
