package tasks.epam.searchalgorithm;

import tasks.epam.entity.SimpleArray;

import java.util.logging.Logger;

public class SearchPrimeNumbers {
    private static final Logger logger = Logger.getLogger(SearchPrimeNumbers.class.getName());

     public String startSearchPrimeNumbers(SimpleArray simpleArray){
        String primeNumbers = "Простые числа массива: ";
        for (int i = 0; i < simpleArray.getArraySize(); i++) {
            boolean flag = true;
            for(int del = 2; del < simpleArray.getArrayNumber(i); del++){
                if(simpleArray.getArrayNumber(i) / del == 0){
                    flag = false;
                }
            }
            if(flag == true){
                primeNumbers += simpleArray.getArrayNumber(i) + " ";
            }
        }
        logger.info(primeNumbers);
        return primeNumbers;
    }
}
