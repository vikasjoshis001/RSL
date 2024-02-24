public class strong_number {
    static int f[] =  new int[10];
    static void preCompute(){
        f[0] = f[1] = 1;
        for(int i = 2;i < 10;++i)
        f[i] = f[i-1] * i;
    }
    static boolean isStrong(int x){
        int factSum = 0;
        int temp = x;
        while(temp>0){
            factSum += f[temp % 10];
            temp /= 10;
        }
        return (factSum == x);
    } 
    public static void main(String[] args) {
        preCompute();
        int x = 543;
        if(isStrong(x)){
            System.out.println("yes");
        }
        else
        System.out.println("no");
    }


}
