class Solution{
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        secondLargest(arr);
    }

    static void secondLargest(int []arr){
        int secondLarge = Integer.MIN_VALUE;
        int firstLarge = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > firstLarge){
                secondLarge = firstLarge;
                firstLarge = arr[i];
            }
            else if(arr[i] > secondLarge && arr[i] != firstLarge){
                secondLarge = arr[i];
            }
        }

        System.out.println(secondLarge);
    }
}