package tasks.epam.searchalgorithm;

import tasks.epam.entity.SimpleArray;

import java.util.logging.Logger;

public class MinSearch {
    private static final Logger logger = Logger.getLogger(MinSearch.class.getName());

    public int startMinSearch(SimpleArray simpleArray){
        int minNumber = simpleArray.getArrayNumber(0);
        for (int i = 0; i < simpleArray.getArraySize(); i++) {
            if(minNumber > simpleArray.getArrayNumber(i)){
                minNumber = simpleArray.getArrayNumber(i);
            }
        }
        logger.info("Минимальное число массива: " + minNumber);
        return minNumber;
    }
}
