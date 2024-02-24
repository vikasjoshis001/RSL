// class Solution{
//     public static void main(String[] args) {
//         int coin1 = 5;
//         int coin2 = 2;
//         int total = 41;
//         System.out.println(minCoin(coin1, coin2, total));
//     }

//     static void minCoin(int coin1, int coin2, int total){
//         if(coin1 < coin2){
//             int temp  = coin1;
//             coin1 = coin2;
//             coin2 = temp;
//         }

//         int val = total%coin1;
//         if(val == 0) return (total/coin1);
//         if(val < coin2)
//     }
// }