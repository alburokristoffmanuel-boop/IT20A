
package sortingalgorithm;

import java.util.Arrays;

public class SortingAlgorithm {






    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
           
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
           
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) {

        int[] originalArray = { 42, 15, 8, 23, 4, 99, 16, 50, 27, 4, 11 };

  
        
       
        System.out.println("\nOriginal Array:");
        System.out.println(Arrays.toString(originalArray));
       

        int[] bubbleArray = Arrays.copyOf(originalArray, originalArray.length);
        bubbleSort(bubbleArray);
        System.out.println("1. Bubble Sort Result:");
        System.out.println(Arrays.toString(bubbleArray));

        int[] selectionArray = Arrays.copyOf(originalArray, originalArray.length);
        selectionSort(selectionArray);
        System.out.println("\n2. Selection Sort Result:");
        System.out.println(Arrays.toString(selectionArray));

        int[] insertionArray = Arrays.copyOf(originalArray, originalArray.length);
        insertionSort(insertionArray);
        System.out.println("\n3. Insertion Sort Result:");
        System.out.println(Arrays.toString(insertionArray));

    }
}

