public class PRINT_DECREASING1 {
    static void print(int n){
        int ans = 0;
        int i = 1;

        while(n>0){
            ans += ( n % 10) * i;
            n /= 10;
            i *= 10;
            System.out.println(ans);
        }


    }
    public static void main(String[] args) {
        
        print(2345);
        
    }
    
}
