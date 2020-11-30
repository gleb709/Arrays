package tasks.epam.sorting;

import tasks.epam.entity.SimpleArray;

import java.util.logging.Logger;

public class QuickSort {
    private static final Logger logger = Logger.getLogger(QuickSort.class.getName());

    public SimpleArray startSort(SimpleArray simpleArray){
         return quickSort(simpleArray,0,simpleArray.getArraySize()-1);
    }

    static int partition(SimpleArray simpleArray, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (simpleArray.getArrayNumber(i) < simpleArray.getArrayNumber(pivot)) {
                int temp = simpleArray.getArrayNumber(counter);
                simpleArray.setArrayNumber(counter, simpleArray.getArrayNumber(i));
                simpleArray.setArrayNumber(i, temp);
                counter++;
            }
        }
        int temp = simpleArray.getArrayNumber(pivot);
        simpleArray.setArrayNumber(pivot,simpleArray.getArrayNumber(counter));
        simpleArray.setArrayNumber(counter, temp);

        return counter;
    }

    public SimpleArray quickSort(SimpleArray simpleArray, int begin, int end) {
        if (end <= begin) return simpleArray;
        int pivot = partition(simpleArray, begin, end);
        quickSort(simpleArray, begin, pivot-1);
        quickSort(simpleArray, pivot+1, end);
        logger.info("Массив отсортирован методом быстрой сортировки");
        return simpleArray;
    }
}
