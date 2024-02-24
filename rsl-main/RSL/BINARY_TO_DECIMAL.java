public class BINARY_TO_DECIMAL {
    static int binary(int n){
        if(n == 0)
        return 0;
        else
        return (n % 10 + 2* binary(n/10));
    }
    public static void main(String[] args) {
        int n =111 ;
        System.out.print( "value " + binary(n));
    }

    
}