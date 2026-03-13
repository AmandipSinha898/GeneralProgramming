package org.saaras;

public class MaximumSubArraySum {
    public int maxSubArray(int[] nums) {
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int current=0;
        int MaxSum=Integer.MIN_VALUE;

        for(int i=0; i < input.length; i++)
        {
            current += input[i];

            MaxSum = Math.max(current,MaxSum);

            if(current <0)
            {
                current = 0;
            }
        }
        System.out.println(MaxSum);


        return MaxSum;
    }
}
