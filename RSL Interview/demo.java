class Solution {

    static boolean[] primeArray() {
        int last = 10005;
        boolean[] primeNumbers = new boolean[last];
        for (int i = 0; i < primeNumbers.length; i++) {
            primeNumbers[i] = true;
        }
        primeNumbers[0] = false;
        primeNumbers[1] = false;
        for (int i = 2; i * i < last; i++) {
            if (primeNumbers[i]) {
                for (int j = i * i; j < last; j += i) {
                    primeNumbers[j] = false;
                }
            }
        }
        return primeNumbers;
    }

    static int[] nearestPrimeNumbers(int n) {
        boolean primeNums[] = primeArray();
        if (primeNums[n])
            return new int[] { n };
        boolean botharePrime = false;
        int ans = 0;
        int l = n - 1, r = n + 1;
        while (l > 0) {
            if (primeNums[l] && primeNums[r]) {
                botharePrime = true;
                break;
            }
            if (primeNums[l] == true) {
                ans = l;
                break;
            } else if (primeNums[r] == true) {
                ans = r;
                break;
            }
            l--;
            r++;
        }

        if (botharePrime) {
            return new int[] { l, r };
        } else
            return new int[] { ans };
    }

    public static void main(String[] args) {
        int[] lowL = nearestPrimeNumbers(7);
        for (int i = 0; i < lowL.length; i++) {
            System.out.print(lowL[i] + " ");
        }
    }
}