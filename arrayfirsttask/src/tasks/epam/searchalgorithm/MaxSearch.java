package tasks.epam.searchalgorithm;

import tasks.epam.entity.SimpleArray;

import java.util.logging.Logger;

public class MaxSearch {
    private static final Logger logger = Logger.getLogger(MaxSearch.class.getName());

    public int startMaxSearch(SimpleArray simpleArray){
        int maxElement = simpleArray.getArrayNumber(0);
        for (int i = 0; i < simpleArray.getArraySize(); i++) {
            if(simpleArray.getArrayNumber(i) > maxElement){
                maxElement = simpleArray.getArrayNumber(i);
            }
        }
        logger.info("Наибольшее число массива: " + maxElement);
        return maxElement;
    }
}