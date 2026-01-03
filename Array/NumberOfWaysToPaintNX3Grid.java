class Solution {
    public int numOfWays(int n) {
        long a=6,b=6;
        for(int i=2;i<=n;i++) {
            long temp=b;
            b=(2*a+2*b)%1000000007;
            a=(3*a+2*temp)%1000000007;
        }
        return (int)(a+b)%1000000007;
    }
}