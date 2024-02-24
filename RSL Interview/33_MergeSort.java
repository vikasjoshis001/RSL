class Solution{
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        merge(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void merge(int []arr, int left, int right){
        if(left < right){
            int mid = (left+right)/2;
            merge(arr, left, mid);
            merge(arr, mid+1, right);
            mergeSort(arr, left, right, mid);
        }
    }

    static void mergeSort(int []arr, int left, int right, int mid){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for(int i=0;i<n1;i++){
            leftArr[i] = arr[left+i];
        }
        for(int j=0;j<n2;j++){
            rightArr[j] = arr[mid+1+j];
        }

        int i=0,j=0,index = left;
        while(i < n1 && j < n2){
            if(leftArr[i] < rightArr[j]){
                arr[index] = leftArr[i];
                i++;
            }
            else{
                arr[index] = rightArr[j];
                j++;
            }
            index++;
        }

        while(i < n1){
            arr[index] = leftArr[i];
            i++;
            index++;
        }

        while(i < n2){
            arr[index] = rightArr[j];
            j++;
            index++;
        }
    }
}