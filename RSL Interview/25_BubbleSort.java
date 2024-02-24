class Solution{
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void bubbleSort(int arr[]){
        int n = arr.length;
        int round = 0;
        while(round < n){
            for(int i=0;i<n-round-1;i++){
                if(arr[i+1] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            round++;
        }
    }
}