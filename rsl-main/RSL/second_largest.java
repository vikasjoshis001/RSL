import java.util.*;
import java.lang.*;
public class second_largest {
    static void largest(int arr[],int arr_size){
        int first , i;
        int second;

        if(arr_size < 2){
            System.out.print("invalid");
            return;
        }
        first = second = Integer.MIN_VALUE;
        for( i = 0; i< arr_size;i++){
            if(arr[i] > first){
            second = first;
            first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first)
                second = arr[i];
            
        }
            System.out.print("second largest" + second);}

    
    
        public static void main(String[] args)
        {
            int arr[] = { 12, 35, 1, 10, 34, 1 };
            int n = arr.length;
            largest(arr, n);
        }
    

    
}
