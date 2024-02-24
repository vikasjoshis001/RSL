public class sum_of_prime1 {
    
    static boolean isprime(int n){
        int i;
        if( n == 1)
        return false;
        for(i = 2 ; i * i <= n ;i++){
            if(n % i == 0)
                return false;
             
        }
        return true;

    }
    static void sum(int arr[],int a){
        int ans =0;
        int i;

        for( i = 0 ; i <a;i++){
            if(isprime(arr[i])){
                ans +=  arr[i];

            }


            
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        sum(arr,5);

    }
    
    
}
