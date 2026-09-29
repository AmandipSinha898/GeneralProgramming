package org.saaras.LeetCode;

import java.util.Arrays;

public class ArrayPartition {
    private int pairSum;
    private int totalPair;
    private int size;

    ArrayPartition() {
        this.pairSum=0;
        this.totalPair=0;
        this.size=0;
    }

    int arrayPairSum(int[] nums) {
        this.size=nums.length;
        this.totalPair=nums.length/2;
        Arrays.sort(nums);

        for(int i=0; i<size; i=i+2) {
            this.pairSum=Math.min(nums[i], nums[i+1]);
        }
        return this.pairSum;
    }
}
