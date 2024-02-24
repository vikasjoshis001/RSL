class Sorts{
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(arr);
    }

    static void bubbleSort(int []arr){
        boolean flag = true;
        int round = 0;
        while(round < arr.length){
            flag = true;
            for(int i=0;i<arr.length-round-1;i++ ){
                if(arr[i+1] < arr[i]){
                    flag = false;
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            if(flag) break;
            round++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}