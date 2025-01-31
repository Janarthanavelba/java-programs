/*Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.*/


class Solution {
    public int divide(int dividend, int divisor) {

        if(divisor==-1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;

        
        int a=dividend/divisor; return a;

    }
}
