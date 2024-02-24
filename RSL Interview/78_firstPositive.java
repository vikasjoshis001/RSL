class Solution{
	public static void main(String []args){
		int arr[] = {0, 10, -2, 3, 1, 2,4, -20, -40}; // 0 -2 -20 -40 -1 -2 4 10 3
		int n = arr.length;
		int index = divide(arr, n);
		int arr2[] = new int[n-index];
		int j = 0; // 1 2 3 4 5
		for(int i=index;i<n;i++){
			System.out.print(arr[i]+" ");
			arr2[j] = arr[i];
			System.out.print(arr2[j]+" ");
			j++;
		}
		System.out.println();
		System.out.println(findMissing(arr2, j));
	}
	
	static int divide(int []arr, int n){
		int index = 0; // 1 2 3 4
		// i:- 0 1 2 3 4 5 6 7 8
		for(int i=0;i<n;i++){
			if(arr[i] <= 0){
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = arr[i];
				index++;
			}
		}
		return index;
	}
	
	static int findMissing(int []arr2, int n){
		
		for(int i=0;i<n;i++){
			System.out.print("arr2 = "+arr2[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++){
			int x = Math.abs(arr2[i]);
			if(x-1 < n && arr2[x-1] > 0){
				arr2[x-1] = -arr2[x-1];
			}
			
		}
					System.out.println();
		
		for(int i=0;i<n;i++){
			if(arr2[i] > 0) return i+1;
		}
		return 0;
	}
}
