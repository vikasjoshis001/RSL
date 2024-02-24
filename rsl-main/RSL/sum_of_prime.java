import java.util.*;

class sum_of_prime {
    static int prime_till_n(int arr[],int n)
    {
        // Create a boolean array "prime[0..n]" and
        // initialize all entries it as true. A value in
        // prime[i] will finally be false if i is Not a
        // prime, else true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
            prime[0] = false;
    prime[1] = false;
 
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true) {
                // Update all multiples of p greater than or
                // equal to the square of it numbers which
                // are multiple of p and are less than p^2
                // are already been marked.
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
 
        int sum = 0;
           for (int i = 0; i < n; i++)
        if (prime[arr[i]])
            sum += arr[i];
 
            return sum;
        }
    
    
    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    int n = arr.length;
    System.out.print(prime_till_n(arr, 7));
    }
}