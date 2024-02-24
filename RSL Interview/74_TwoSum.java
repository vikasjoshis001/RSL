import java.util.*;
class Solution{
	public static void main(String []args){
		int arr[] = {2, 3, 4, -2, 6, 8, 9, 11};
		int n = arr.length;
		twoSum(arr, n, 6);
	}
	
	static void twoSum(int []arr, int n, int target){
		int count = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++){
			int temp = target - arr[i];
			if(hm.containsKey(temp)){
				count += hm.get(temp);
			}
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else{
				hm.put(arr[i], 1);
			}
		}
		System.out.println(count);
	}
}
