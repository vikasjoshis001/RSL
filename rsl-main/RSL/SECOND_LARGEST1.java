import java.util.*;;
public class SECOND_LARGEST1 {
    static void largest(int a[],int arr_size){
        int flarge = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;
        int i;

        for(i = 0;i < arr_size;i++){
            if(a[i]>flarge){
            slarge = flarge;
            flarge = a[i];
            }
        
          else if( a[i] > slarge && a[i] != flarge){
            slarge = a[i];
        }
    }
        System.out.print("second largest" + slarge);}

        public static void main(String[] args) {
            {
                int arr[] = { 12, 35, 1, 10, 34, 1 };
                int n = arr.length;
                largest(arr, n);
            }
        }
    
}
