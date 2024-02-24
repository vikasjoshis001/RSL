import java .io.*;
import java.util.*;
public class maximumelement {
    public static int max(int[] arr , int n){
        Arrays.sort(arr);
        return arr[n - 1];
        

    }

    static public void main(String[] args){
        int []arr = {10,20};
        int n = arr.length;
        System.out.println(max(arr,n));
    }
}