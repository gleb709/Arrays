package tasks.epam.sorting;

import tasks.epam.entity.SimpleArray;

import java.util.logging.Logger;

public class Sort {
private static final Logger logger = Logger.getLogger(Sort.class.getName());

    public void startSort(boolean flag, SimpleArray array){
        boolean sorted = false;
        int temp;
        if(flag == true) {
            while (!sorted) {
                sorted = true;
                for (int x = 0; x < array.getArraySizeX() - 1; x++) {
                    if (array.getArraySumStrings(x) < array.getArraySumStrings(x + 1)) {
                        temp = array.getArraySumStrings(x);
                        array.setArraySumStrings(x, array.getArraySumStrings(x + 1));
                        array.setArraySumStrings(x + 1, temp);
                        for (int y = 0; y < array.getArraySizeY(); y++) {
                            temp = array.getArrayNumber(x, y);
                            array.setArrayNumber(x, y, array.getArrayNumber(x+1, y));
                            array.setArrayNumber(x+1, y, temp);
                        }
                        sorted = false;
                    }
                }
            }
        }else{
            while (!sorted) {
                sorted = true;
                for (int x = 0; x < array.getArraySizeX() - 1; x++) {
                    if (array.getArraySumStrings(x) > array.getArraySumStrings(x + 1)) {
                        temp = array.getArraySumStrings(x);
                        array.setArraySumStrings(x, array.getArraySumStrings(x + 1));
                        array.setArraySumStrings(x + 1, temp);
                        for (int y = 0; y < array.getArraySizeY(); y++) {
                            temp = array.getArrayNumber(x, y);
                            array.setArrayNumber(x, y, array.getArrayNumber(x+1, y));
                            array.setArrayNumber(x+1, y, temp);
                        }
                        sorted = false;
                    }
                }
            }
        }
        logger.info("Строки массива отсортированны");
    }
}
