class Solution {
    static void print(int low,int high){
        for(int i = low;i <= high;i++){
            if ( i % 7 == 0){
                System.out.println("raja ");
            }
            else if( i % 11 == 0){
                System.out.println("software ");
            }
            else 
            System.out.println( i );
        }
    }
    public static void main(String[] args) {
        int low = 6;
        int high = 12;
        print(low,high);
    }
    
}