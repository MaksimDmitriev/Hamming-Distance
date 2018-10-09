package com.app;

public class Solution {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int res = 0;
        int bit = 1;
        for (int i = 0; i < 32; i++) {
            if ((bit & xor) != 0) {
                res++;
            }
            bit <<= 1;
        }

        return res;
    }
}
