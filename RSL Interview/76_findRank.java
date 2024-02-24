class Solution{
	public static void main(String []main){
		int arr[] = {40,39,38,38,38,37,36,34,33};
		System.out.println(findRank(arr, 20));
	}
	
	static int findRank(int []arr, int target){
		int rank = 1; // 2 3 4 5 
		if(arr[0] == target) return 1;
		for(int i=1;i<arr.length;i++){
			if(arr[i] != arr[i-1] && arr[i] > target) rank++;
			else if(arr[i] <= target) return rank+1;
		}
		return rank+1;
	}
}
