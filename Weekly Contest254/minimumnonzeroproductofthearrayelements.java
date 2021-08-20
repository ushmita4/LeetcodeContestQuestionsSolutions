class Solution {
    long MOD = 1000000007;
    public int minNonZeroProduct(int p) {
        long  val = (long)Math.pow(2, p) - 1;
        long  k = val/2;
        long  num = val - 1;
        long  ans = exp(num, k);
        return (int)(ans*((val)%MOD)%MOD);
    }
    public long exp(long num, long k) {
        if( k == 0){
            return 1;
        } else if(k == 1) {
            return num;
        }else {
            long temp = exp(num, k/2);
            temp = temp%MOD;
            if(k%2 != 0) {
                temp = (temp*temp)%MOD;
            }
            return (temp*(num%MOD))%MOD;
        }
    }
}
