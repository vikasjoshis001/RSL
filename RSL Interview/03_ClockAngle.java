import java.util.*;

class Solution{
    public static void main(String[] args) {
        int h = 3;
        int m = 30;
        calAngle(h, m);
    }

    static void calAngle(int h, int m){
        if(h >= 12 && h <= 24 ) h-=12;
        if(h<0 || m>60 || h>12 || m<0){
            System.out.println("Wrong Input");
        }

        if(m == 60){
            m = 0;
            h+=1;
        }

        int hourAngle = (int) (0.5 * (h*60+m));
        int minAngle = 6*m;
        int angle = Math.abs(hourAngle - minAngle);
        angle = Math.min(angle, 360-angle);
        System.out.println(angle);
    }
}