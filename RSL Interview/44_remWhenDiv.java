class Solution{
    public static void main(String[] args) {
        int arr[] = {19,10,44,3,11,129};
        remWhenDiv(arr);
    }

    static void remWhenDiv(int []arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 5 == 4){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}