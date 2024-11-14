package com.LogicBuilding;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = { 3,4, 2, 1, 6, 8, 9,5};

        System.out.println("Original array");
        for(int i : array){
            System.out.println(i + " ");
        }

        //Bubble sort algorithm
        for(int i = 0; i < array.length -1; i++){
            for(int j = 0; j < array.length -1 -i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("\n Sorted Array :");
        for (int i : array){
            System.out.println(i + " ");
        }
    }
}
