public class patter_2 {
    static void pattern(int n){
        for(int i = 1;i <= n;i++){
            for(int j = n;j >=0 j--){

                System.out.print(" ");

                
            }
            for(int k = 1; k<i;k++){
            System.out.print("* ");

        }  
        System.out.println();

    }}
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    
}
 