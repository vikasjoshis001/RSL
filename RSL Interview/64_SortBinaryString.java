import java.nio.channels.SelectableChannel;

class Solution{
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,0,1,1,1,0,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void insertionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]>key){
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1] = key;
        }
    }

    static void selectionSort(int []arr){
        int round = 0;
        while(round < arr.length){
            int min = round;
            for(int i=round; i< arr.length;i++){
                if(arr[i] < arr[min]){
                    min = i;
                }
            }

            int temp = arr[round];
            arr[round] = arr[min];
            arr[min] = temp;
            round++;
        }
    }

    static void bubbleSort(int []arr){
        int round = 0;
        while(round < arr.length){
            for(int i=0;i<arr.length-round-1;i++){
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