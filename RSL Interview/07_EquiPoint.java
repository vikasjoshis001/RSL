class Solution{
    public static void main(String[] args) {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        equiPoint(arr);
    }

    static void equiPoint(int []arr){
        if(arr.length <= 2) System.out.println(0);
        for(int i=1;i<arr.length-1;i++){
            int left = 0;
            int right = 0;
            int j = 0;
            while(j<i){
                left+=arr[j];
            }
            j = i+1;
            while(j<arr.length){
                right+=arr[j];
            }
            if(left == right){
                System.out.println(arr[i]);
            }
        }

    }
}