import java.util.ArrayList;

class Solution{
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3,};
        Character arr2[] = {'a', 'b' , 'c'};
        int n1 = arr1.length;
        int n2 = arr2.length;
        mergeArr(arr1,arr2,n1,n2);
    }

    static void mergeArr(int []arr1, Character []arr2, int n1, int n2){
        int arr3[] = new int[n1+n2];
        ArrayList arr = new ArrayList();
        
        int i=0, j=0, index = 0;
        while(i < n1 && j < n2){
            if(index % 2 == 0){
                arr.add(arr1[i]);
                i++;
            }
            else{
                arr.add(arr1[j]);
                j++;
            }
            index++;
        }

        while(i < n1){
            arr.add(arr1[i]);
            i++;
        }

        while(j < n2){
            arr.add(arr1[j]);
            j++;
        }

        for (int k = 0; k < arr.size(); k++) {
            System.out.print(arr.get(i));
        }
        System.out.println();
    }
}