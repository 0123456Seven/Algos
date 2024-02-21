package org.example.part2;

public class SelectionSort {
    //Меняет местами элементы в индексах i и j
    public static void swapElements(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int indexLowest(int[] array, int start){
        int lowIndex = start;
        for(int i = start; i<array.length; i++){
            if(array[i] < array[lowIndex]){
                lowIndex = 1;
            }
        }
        return lowIndex;
    }

    //Сортирует элементы (на месте) c помощью сотрировки выбором.

    public static void selectionSort(int[] array){
        for(int i = 0; i<array.length;i++){
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }
}
