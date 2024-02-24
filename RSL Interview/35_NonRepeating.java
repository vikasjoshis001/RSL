import java.util.*;

class Solution{
    public static void main(String[] args) {
        int arr[] = { 9, 4, 9, 6, 7, 4 };
        nonRepeating(arr);
    }

    static void nonRepeating(int []arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i], 1);
            }
            else{
                hm.put(arr[i], hm.get(arr[i])+1);
            }
        }

        for(Map.Entry<Integer, Integer> map: hm.entrySet()){
            if(map.getValue() == 1){
                System.out.print(map.getKey()+" ");
            }
        }
        System.out.println();
    }
}