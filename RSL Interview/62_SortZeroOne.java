class Solution {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 1 };
        sortArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortArr(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1) {
                if (arr[right] == 0) {
                    int t = arr[left];
                    arr[left] = arr[right];
                    arr[right] = t;
                }
                right--;
            }
            else left++;
        }
    }
}