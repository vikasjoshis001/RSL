class Solution{
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(secMax(arr));
    }

    static int secMax(int arr[]){
        int secMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }
            if(arr[i] > secMax && arr[i] < max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
}