public class print_decreasing {
    static void solve(int n){
        int ans = 0;
        int i = 1;

        while(n > 0){
            ans += (n % 10) * i;
            n /= 10;
            i *= 10;
            System.out.println(ans);
        }
        
    }
    public static void main(String[] args) {
        
        solve(2345);
        
    }

    
}
