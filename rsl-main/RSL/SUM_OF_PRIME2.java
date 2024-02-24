public class SUM_OF_PRIME2 {
    boolean   isPrime(int n){
        for(int i = 0;i * i <= n;i++){
            if(n % i == 0){
                return false;
            }
            


        }
        return true;
    }
    
     int sum1(int arr[],int arr_size){
        int i;
        int sum = 0;
        for(i = 0;i<= arr_size;i++){
            if(isPrime(arr[i]) ){
                sum += arr[i];
            }
            


        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] ={1, 14, 5, 7};
        
        System.out.println(sum1);
    }
    
    
}
