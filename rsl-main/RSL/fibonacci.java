public class fibonacci {
    static int fib(int n){
        int f[] = new int[n + 2];

        
        f[0] = 0;
        f[1] = 1;

        for(int i = 2 ;i<= n;i++){
            f[i]= f[i - 1] + f [i -2];
        }
        return f[n];
        // int f[] = new int[2 * n + 1];

        
        // f[0] = 0;
        // f[1] = 1;

        // for(int i = 2 ;i<= n;i++){
        //     f[i]= f[i - 1] + f [i -2];
        // }
        // return f[n];

        
    }
    
    public static void main(String args[])
    {
        // Given Number N
        int N = 10;
  
        // Print first 10 term
        for (int i = 0; i < N; i++)
            System.out.print(fib(i) + " ");
    }
}
    

