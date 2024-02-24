import java.util.*;

class Solution{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String roman = sc.next();
		System.out.println(romanToInteger(roman));
	}
	
	static int romanToInteger(String roman){
		int ans = 0;
		for(int i=0;i<roman.length();i++){
			int s1 = intValues(roman.charAt(i));
			if( (i+1) < roman.length()){
				int s2 = intValues(roman.charAt(i+1));
				
				if(s1 >= s2){
					ans += s1;
				}
				else{
					ans+=s2-s1;
					i++;
				}
			}
			else{
				ans+=s1;
			}
		}
		return ans;
	}
	
	static int intValues(char ch){
		if(ch == 'I') return 1;
		if(ch == 'V') return 5;
		if(ch == 'X') return 10;
		if(ch == 'L') return 50;
		if(ch == 'C') return 100;
		if(ch == 'D') return 500;
		if(ch == 'M') return 1000;
		return 0;
	}
}
