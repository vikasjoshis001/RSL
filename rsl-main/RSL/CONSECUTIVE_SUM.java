public class CONSECUTIVE_SUM {
    static int[] sum(int arr[],int n){
        int sum = 0;
        int max = 0;
        

        for(int i  = 0;i<n - 1;i++){
            int a = arr[i];
            int b = arr[i+1];
            sum = arr[i] + arr[i+1];
            if(max < sum)
            max  = sum;
        }

//         public static int[] something(){
//         int number1 = 1;
//         int number2 = 2;
//         return new int[] {number1, number2};
// }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = { 10,5,7,9,6};
        int n = arr.length;
        sum(arr,n);
        

    }
}

