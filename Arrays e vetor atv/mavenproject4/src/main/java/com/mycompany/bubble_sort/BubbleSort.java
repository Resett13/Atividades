package com.mycompany.bubble_sort;

public class BubbleSort {
    public static void main(String[] args) {
        // Seu código do algoritmo Bubble Sort aqui
        int[] array = {5, 3, 8, 4, 2};
        bubbleSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
