class Solution{
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void selectionSort(int []arr){
        int round = 0;
        while(round < arr.length){
            int min = round;
            for(int i=round;i<arr.length;i++){
                if(arr[i] < arr[min]){
                    min = i;
                }
            }
            int temp = arr[min];
            arr[min] = arr[round];
            arr[round] = temp;
            round++;
        }
    }
}