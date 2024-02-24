class Solution{
	public static void main(String []args){
        	int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        	merge(arr, 0, arr.length-1);
        	for(int i=0;i<arr.length;i++){
        		System.out.print(arr[i]+" ");
        	}
        	System.out.println();
	}
	
	static void merge(int []arr, int start, int end){
		if(start < end){
			int mid = (start+end)/2;
			merge(arr, start, mid);
			merge(arr, mid+1, end);
			mergeSort(arr, start, end, mid);
		}
	}
	
	static void mergeSort(int []arr, int start, int end, int mid){
		int n1 = mid-start+1;
		int n2 = end-mid;
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		for(int i=0;i<n1;i++){
			leftArr[i] = arr[start+i];
		}
		for(int j=0;j<n2;j++){
			rightArr[j] = arr[mid+1+j];
		}
		
		int index = start;
		int i=0;
		int j=0;
		while(i < n1 && j < n2){
			if(leftArr[i] <= rightArr[j]){
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
		
		while(j < n2){
			arr[index] = rightArr[j];
			j++;
			index++;
		}
	}
	}
