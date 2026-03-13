package org.saaras;

import java.util.Arrays;

public class MultEachEleExceptI {
    int[] output;

    public MultEachEleExceptI(int[] input) {
        int n = input.length;
        output = new int[n];

        // Step 1: Prefix products
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * input[i - 1];
        }

        // Step 2: Suffix products
        int suffixMult = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * suffixMult;
            suffixMult *= input[i];
        }
    }


    public static void main(String[] args){
        int[] input={1,2,3,4,5};
        MultEachEleExceptI obj=new MultEachEleExceptI(input);

        System.out.println(Arrays.toString(obj.output));
    }
}
