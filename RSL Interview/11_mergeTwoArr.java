class Solution{
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5};
        int arr2[] = { 2,4,6,8};
        mergeTwoArr(arr1, arr2);
    }

    static void mergeTwoArr(int []arr1, int []arr2){
        int mergedArr[] = new int[arr1.length+arr2.length];
        int index = 0;
        int i=0, j=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                mergedArr[index] = arr1[i];
                i++;
            }
            else{
                mergedArr[index] = arr2[j];
                j++;
            }
            index++;
        }

        while(i < arr1.length){
            mergedArr[index] = arr1[i];
            index++;
            i++;
        }

        while (j < arr2.length) {
            mergedArr[index] = arr1[j];
            index++;
            j++;
        }
    }
}