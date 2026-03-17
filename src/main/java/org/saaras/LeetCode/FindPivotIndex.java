package org.saaras.LeetCode;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int rightSum=0;
        int leftSum=0;
        int length=nums.length;
        if(length == 0) {
            return 0;
        }

        for(int i=1; i<length; i++) {
            rightSum += nums[i];
        }

        if(rightSum == leftSum) {
            return 0;
        }

        for(int i=1; i<length; i++) {
            rightSum -= nums[i];
            leftSum += nums[i-1];

            if(rightSum == leftSum) {
                return i;
            }
        }

        return -1;

    }
}
