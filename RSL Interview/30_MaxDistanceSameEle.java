import java.util.*;
class Solution{
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 6, 7, 8, 4 };
        maxDist(arr);
    }

    static void maxDist(int []arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int distance = 0;
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i], i);
            }
            else{
                distance = Math.max(distance, i - hm.get(arr[i]));
            }
        }
        System.out.println(distance);
    }
}