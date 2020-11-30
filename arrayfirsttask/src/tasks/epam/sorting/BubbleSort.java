package tasks.epam.sorting;

import tasks.epam.entity.SimpleArray;

import java.util.logging.Logger;

public class BubbleSort {
    private static final Logger logger = Logger.getLogger(BubbleSort.class.getName());

    public SimpleArray bubbleSort(SimpleArray simpleArray){
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < simpleArray.getArraySize() - 1; i++) {
                if (simpleArray.getArrayNumber(i) > simpleArray.getArrayNumber(i + 1)) {
                    temp = simpleArray.getArrayNumber(i);
                    simpleArray.setArrayNumber(i,simpleArray.getArrayNumber(i + 1));
                    simpleArray.setArrayNumber(i + 1,temp);
                    sorted = false;
                }
            }
        }
        logger.info("массив отсортирован методом пузырька");
        return simpleArray;
    }
}
