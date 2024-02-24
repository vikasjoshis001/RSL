class Solution{
    public static void main(String[] args) {
        int h = 9;
        int m = 30;
        System.out.println(angleBet(h, m));
    }

    static int angleBet(int h, int m){
        if(h > 12) h -= 12;
        if(h > 24 || h < 1 || m < 1 || m > 60) return 0;
        if(m == 60){
            m = 0;
            h++;
        }

        float hourAngle = (float) 0.5*(h*60+m);
        float minAngle = (float) 6*m;
        float angle = Math.abs(hourAngle - minAngle);
        return (int) angle;
    }
}