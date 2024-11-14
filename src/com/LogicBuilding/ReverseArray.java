package com.LogicBuilding;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};

        System.out.println("Original array: ");
        for (int i : arr){
            System.out.println(i + " ");
        }

        //Reversing the array
        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length -i - 1] = temp;
        }

        System.out.println("\n Reversed array: ");
        for (int i : arr){
            System.out.println(i + " ");
        }
    }
}
