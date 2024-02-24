import java.util.*;

class Solution{
    public static void main(String[] args) {
        int arr[] = {10, 4, 5, 7, 9};
        consecutiveSum(arr);
    }

    static void consecutiveSum(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length-1;i++){
            sum = arr[i] + arr[i+1];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}