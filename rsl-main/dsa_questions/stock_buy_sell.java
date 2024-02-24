import java.io.*;
import java.lang.*;
import java.util.*;


    public static int maxprofit(int[] a,int size){
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;

        for(int i = 0;i < a.length;i++){
        if(a[i] < minprice);
            minprice = a[i];
        
 
         if (a[i]- minprice > maxprofit)
            maxprofit = a[i] - minprice;
            
        }
        return maxprofit;
    }

    static public main(String[] args) {
        int a[] = { 100, 180, 260, 310, 40, 535, 695 };
        
        System.out.println(maxprofit(a, 7));
    }


