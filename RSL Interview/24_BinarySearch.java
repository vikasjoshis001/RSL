class Solution{
    public static void main(String[] args) {
        int arr[] = {39, 38, 38, 36, 34, 31, 28};
        int num = 36;
        binarySearch(arr, num);
    }

    static void binarySearch(int []arr, int num){
        int left = 0;
        int right = arr.length -1;
        int mid = 0;
        while(left <= right){
            mid = (left+right)/2;
            if(arr[mid] == num){
                break;
            }
            else if(arr[mid] > num){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        System.out.println(mid);
    }
}