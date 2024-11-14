package com.code.rai;

import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int i =0, j = 0, k =0;
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                result [k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            result[k++] = arr1[i++];
        }
        while(j < arr2.length){
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr1 = {1, 4, 6, 7, 8};
        int[] arr2 = {2,4, 5,9, 12};
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
