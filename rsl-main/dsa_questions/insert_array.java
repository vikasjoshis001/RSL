import java.io.*;
import java.lang.*;
import java.util.*;
public class insert_array{
    public static int[] insert(int arr[],int n,int x){
        int i;
        int newarr[] = new int[n + 1];

        for( i = 0;i < n;i++)
            newarr[i] = arr[i];

            newarr[i] = x;
            return newarr;
        

    }
    public static void main(String[] args){
        int n = 5;
        int arr[] = {1,2,3,4,5};

        System.out.println("initial array:\n" + Arrays.toString(arr));

        int x = 50;
        arr = insert(arr,n,x);

        System.out.println("\nArray with " + x
                           + " added:\n"
                           + Arrays.toString(arr));
    }
}
