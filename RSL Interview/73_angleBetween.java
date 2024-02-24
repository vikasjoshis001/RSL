class Solution{
	public static void main(String args[]){
		int h = 12;
		int m = 30;
		System.out.println(angleBetween(h,m));
	}
	
	static int angleBetween(int h, int m){
		if(h>12 && h<=24) h-=12;
		if(h<0 || h>12 || m<0 || m>60) return -1;
		if(m == 60){
			m = 0;
			h+=1;
		}
		int hourAngle = (int)(0.5 * (h*60+m));
		int minAngle = (int)(6*m);
		int angle = Math.abs(hourAngle - minAngle);
		angle = Math.min(angle, 360-angle);
		return angle;
	}
}
