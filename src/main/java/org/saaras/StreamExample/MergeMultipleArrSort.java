package org.saaras.StreamExample;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeMultipleArrSort {

    public int[] resultArr;

    public int[] mergeMultiArrAndSort(int[] arr1, int[] arr2, int[] arr3, int[] arr4){
        resultArr= Stream.of(arr1, arr2, arr3, arr4)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString((resultArr)));

        return resultArr;
    }

    public static void main(String[] args){
        MergeMultipleArrSort obj=new MergeMultipleArrSort();
        int[] arr1={10,4,7,14};
        int[] arr2={9,3,6,13};
        int[] arr3={8,2,5,12};
        int[] arr4={7,1,15,11};
        int[] resultArr=obj.mergeMultiArrAndSort(arr1, arr2, arr3, arr4);
    }
}
