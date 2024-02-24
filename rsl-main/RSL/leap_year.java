// Given an input year then the print year is either
//  leap year or not leap year

// import java.util.*;
// public class leap_year {
//     static boolean checkleap(int n){
//         return ((n % 4 == 0) && (n % 100 == 0) || (n % 400 == 0));

//     }
//     public static void main(String[] args) {
//         int n = 201;
//         System.out.println(checkleap(201)? "Leap Year" : "Not");
//     }
// }

import java.util.*;
public class leap_year {
    static int checkleap(int y){
        if((y % 400 == 0) ||
       (y % 100 != 0) &&
       (y % 4 == 0))
    {
      return 1;
    }
    else
    {
      return 0;
    }
    }
    public static void main(String[] args) {
        int y = 400;
        System.out.println(checkleap(y));
    }
}
