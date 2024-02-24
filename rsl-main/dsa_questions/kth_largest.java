import java.util.*;
public class kth_largest {
     static void largest(int[] arr,int k){
        // if(arr.length == 0)
        // return 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(k +1);
        int n = arr.length;
        for(int i = 0;i < n;i++){
        pq.add(arr[i]);
        
        if(pq.size() > k){
            pq.poll();
        }
    }
    System.out.println("largest " + pq.poll());

    }
    

    public static void main(String args[]){
        int arr[] = { 1,2,3,4,5};
        largest(arr, 3);
    }
    
}
