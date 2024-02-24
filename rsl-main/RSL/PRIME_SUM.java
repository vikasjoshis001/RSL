public class PRIME_SUM {
    static int check(int n,int a,int b){
        int sum = 0;
        int c;
        if(n == 1)return 1;
        if(n == 0)return 0;
        c = a + b;
        while(c <= n){
            if(c == n) return n;
            if(c % 2 == 0){
                sum += c;
            }
            c = a + b;
            a = b;
            b = c;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n;
        
        int ans = check(21,0,1);
        System.out.print(ans);
    }
    
}
