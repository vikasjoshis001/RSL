import java.util.*;
public class PRIME_BET_TWO {
    static boolean prime(int n){
        int i;
        if(n == 0 || n == 1)
        return false;
        if( n == 2)
        return true;

        for(i = 2; i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }


        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter lower : ");
        int lower = sc.nextInt();
        System.out.print("\nEnter upper bound of the interval: ");
        int upper = sc.nextInt();
        System.out.printf("\nPrime numbers between %d and %d are: ", lower, upper);

        for(int i = lower; i <= upper;i++){
            if(prime(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();

    }

}
