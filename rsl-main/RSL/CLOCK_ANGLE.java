import java.util.*;
import java.io.*;
public class CLOCK_ANGLE {
    static int angle(double h,double m){
        if(h < 0 || m < 0 || h > 24 || m > 60)
            System.out.println("wrong input");
            if( h == 24)
            h = 0;
            if(m == 60)
            {
                m = 0;
                h += 1;
                if(h + 12 > 24)
                h = h - 12;
            }

            int hourangle = (int)(0.5 * (h*60 + m));
            int minuteangle = (int)(6*m);

            int angle = Math.abs(hourangle - minuteangle);
            angle = Math.min(360 - angle,angle);
            return angle;
    }
    public static void main (String[] args)
    {
        System.out.println(angle(21, 60)+" degree");
        System.out.println(angle(15, 30)+" degree");
    }
    
}
