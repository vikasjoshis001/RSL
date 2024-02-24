class Solution{
    public static void main(String[] args) {
        int arr[] = {12,14,70,95,65,22,30};
        secondMaxDiff(arr);
    }

    static void secondMaxDiff(int []arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secMin=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                secMin = min;
                min = arr[i];
            }
            if(arr[i] < secMin && arr[i] != min){
                secMin = arr[i];
            }
        }
        System.out.println(max-secMin);
    }
}