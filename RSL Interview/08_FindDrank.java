class Solution{
    public static void main(String[] args) {
        int arr[] = { 10,20,15,3,4,4,1 };
        int target = 4;
        findRank(arr, target);
    }

    static void findRank(int []arr, int target){
        int rank = 1;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i] > target){
                if(arr[i] != arr[i+1]){
                    rank++;
                }
            }
            else{
                break;
            }
        }
        System.out.println(rank);
    }
}