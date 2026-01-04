class Solution {
    private int sumOfDivisor(int num) {
        int divisor = 0,sum = 1 + num;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                divisor++;
                sum += i;
                if (i != (num / i)) {
                    divisor++;
                    sum += num / i;
                }
                if (divisor > 2)
                    return 0;
            }
        }
        return divisor==2?sum:0;
    }
    public int sumFourDivisors(int[] nums) {
    int sum=0;
    for (int num : nums) {
        sum+=sumOfDivisor(num);
    }
    return sum;
}
}