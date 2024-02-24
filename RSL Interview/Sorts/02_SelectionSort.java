class Sort{
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr);
    }

    static void selectionSort(int []arr){
        int n = arr.length;
        int round = 0;
        while(round < arr.length){
            int min = round;
            for(int i=round;i<arr.length;i++){
                if(arr[i] < arr[min]){
                    min = i;
                }
            }

            // Unstable
            int temp = arr[round];
            arr[round] = arr[min];
            arr[min] = temp;
            round++;

            //  Stable 
            int key = arr[min];
            while (min > min) {
                arr[min] = arr[min - 1];
                min--;
            }
            arr[min] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}