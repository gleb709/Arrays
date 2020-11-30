package tasks.epam.sorting;

import tasks.epam.entity.SimpleArray;

import java.util.logging.Logger;

public class PyramidSort {
    private static final Logger logger = Logger.getLogger(PyramidSort.class.getName());

    public void heap(SimpleArray simpleArray, int length, int i) {
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int largest = i;
        // если левый дочерний больше родительского
        if (leftChild < length && simpleArray.getArrayNumber(leftChild) > simpleArray.getArrayNumber(largest)) {
            largest = leftChild;
        }
        // если правый дочерний больше родительского
        if (rightChild < length && simpleArray.getArrayNumber(rightChild) > simpleArray.getArrayNumber(largest)) {
            largest = rightChild;
        }
        // если должна произойти замена
        if (largest != i) {
            int temp = simpleArray.getArrayNumber(i);
            simpleArray.setArrayNumber(i, simpleArray.getArrayNumber(largest));
            simpleArray.setArrayNumber(largest, temp);
            heap(simpleArray, length, largest);
        }
    }

    public SimpleArray heapSort(SimpleArray simpleArray) {
        if (simpleArray.getArraySize() == 0) return simpleArray;
        int length = simpleArray.getArraySize();
        // проходим от первого без ответвлений к корню
        for (int i = length / 2-1; i >= 0; i--) {
            heap(simpleArray, length, i);
        }
        for (int i = length-1; i >= 0; i--) {
            int temp = simpleArray.getArrayNumber(0);
            simpleArray.setArrayNumber(0, simpleArray.getArrayNumber(i));
            simpleArray.setArrayNumber(i, temp);

            heap(simpleArray, i, 0);
        }
        logger.info("Массив отсортирован методом пирамиды");
        return simpleArray;
    }
}
