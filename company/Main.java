package com.company;

import java.util.Arrays;

public class Main {
    void insertionSort(int[] list) {

        for (int i = 1; i < list.length; i++){
            int number = list[i];
            int j = i - 1;
            while(j >= 0 && list[j] > number){
                list[j+1] = list[j];
                j -= 1;
            }
            list[j+1] = number;

        }
    }

    public static void main(String[] args) {
        Main insertion = new Main();
        int numbers[] = {11, 16, 8, 7, 20, 4, 14};
        System.out.println("*** Insertion Sort ***");
        insertion.insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}