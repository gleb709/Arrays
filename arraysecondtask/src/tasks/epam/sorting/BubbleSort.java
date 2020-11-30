package tasks.epam.sorting;

import tasks.epam.entity.SimpleArray;

import java.util.logging.Logger;

public class BubbleSort {
    private static final Logger logger = Logger.getLogger(BubbleSort.class.getName());
    public void startBubbleSort(SimpleArray array, int arraySizeX, int arraySizeY){
        setArrayInfo(array, arraySizeX, arraySizeY);
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for(int x = 0; x < arraySizeX; x++) {
                for (int y = 0; y < arraySizeY - 1; y++) {
                    if (array.getArrayNumber(x, y) > array.getArrayNumber(x, y + 1)) {
                        temp = array.getArrayNumber(x, y);
                        array.setArrayNumber(x, y, array.getArrayNumber(x, y + 1));
                        array.setArrayNumber(x, y, temp);
                        sorted = false;
                    }
                }
            }
        }
        logger.info("Массив отсортировон методом пузырька ");
    }

    public void setArrayInfo(SimpleArray array, int arraySizeX, int arraySizeY){
        int[] arraySumStrings = new int[arraySizeX];
        int[] arrayMaxElements = new int[arraySizeX];
        int[] arrayMinElements = new int[arraySizeX];
        for(int i = 0; i < arraySizeX; i++){
            arrayMaxElements[i] = array.getArrayNumber(i,0);
            arrayMinElements[i] = array.getArrayNumber(i, 0);
        }
        for(int x = 0; x < arraySizeX; x++){
            for(int y = 0; y < arraySizeY; y++){
                arraySumStrings[x] += array.getArrayNumber(x, y);
                if(arrayMaxElements[x] < array.getArrayNumber(x, y)){
                    arrayMaxElements[x] = array.getArrayNumber(x, y);
                }
                if(arrayMinElements[x] > array.getArrayNumber(x, y)){
                    arrayMaxElements[x] = array.getArrayNumber(x, y);
                }
            }
        }
        for(int i = 0; i < arraySizeX; i++){
            array.setArraySumStrings(i, arraySumStrings[i]);
            array.setArrayMaxElements(i, arrayMaxElements[i]);
            array.setArrayMinElements(i, arrayMinElements[i]);
        }
        logger.info("Вспомогательные данные переданны в объкту класса SimpleArray");
    }
}
