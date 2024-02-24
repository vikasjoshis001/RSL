class Solution{
	public static void main(String []args){
		int d1 = 1;
		int m1 = 7;
		int y1 = 2022;
		int d2 = 5;
		int m2 = 10;
		int y2 = 2022;
		daysBetweenTwoDates(d1,m1,y1,d2,m2,y2);
	}
	
	static void daysBetweenTwoDates(int d1, int m1,int y1,int d2,int m2,int y2){
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int n1 = (y1*365) + d1 + numberOfLeapYears(m1,y1);
		for(int i=0;i<m1;i++){
			n1 += months[i];
		}
		
		int n2 = (y2*365) + d2 + numberOfLeapYears(m2,y2);
		for(int i=0;i<m2;i++){
			n2 += months[i];
		}
		System.out.println(n2-n1);
	}
	
	static int numberOfLeapYears(int m,int y){
		if(m <= 2){
			y--;
		}
		return y/4-y/100+y/400;
	}
}
