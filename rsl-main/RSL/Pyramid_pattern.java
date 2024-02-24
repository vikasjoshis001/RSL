// * 
// * * 
// * * * 
// * * * * 
// * * * * *
import java.util.*;
public class Pyramid_pattern {
    public static void pyramid(int n)
        {
            int i, j;
            
     
            // outer loop to handle number of rows
            //  n in this case
            for(i=1; i<=n; i++)
            {
     
                //  inner loop to handle number of columns
                //  values changing acc. to outer loop   
                for(j=1; j<=i; j++)
                {
                    // printing stars
                    System.out.print("* ");
                    
                }
     
                // ending line after each row
                System.out.println();
            }
            for(i=n - 1; i>= 0; i--)
            {
     
                //  inner loop to handle number of columns
                //  values changing acc. to outer loop   
                for(j=1; j<=i; j++)
                {
                    // printing stars
                    System.out.print("* ");
                    
                }
     
                // ending line after each row
                System.out.println();
            }
       
        }
        // Driver Function
        public static void main(String args[])
        {
            int n = 5;
            pyramid(n);
        }
    }
    