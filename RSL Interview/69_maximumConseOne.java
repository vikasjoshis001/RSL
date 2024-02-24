import java.util.*;

class Solution{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<10;i++){
			arr[i] = Integer.parseInt(sc.next());
		}
		
		System.out.println(maxConsOnes(arr));
	}
	
	static int maxConsOnes(int []arr){
		int count = 0;
		int max = 0;
		for(int i=0;i<10;i++){
			if(arr[i] == 1){
				count++;
			}
			else{
				max = Math.max(count, max);
				count = 0;
			}
		}
		max = Math.max(count, max);
		return max;
	}
}
