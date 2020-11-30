package tasks.epam.searchalgorithm;

import tasks.epam.entity.SimpleArray;

import java.util.logging.Logger;

public class SearchThreeDigitNumbers {
    private static final Logger logger = Logger.getLogger(SearchThreeDigitNumbers.class.getName());

    public String startSearchThreeDigitNumbers(SimpleArray simpleArray){
        String threeDigitNumbers = "Искомые числа: ";
        for (int i = 0; i < simpleArray.getArraySize(); i++) {
            if( simpleArray.getArrayNumber(i) > 123 && simpleArray.getArrayNumber(i) < 987){
                if(simpleArray.getArrayNumber(i)/100 != simpleArray.getArrayNumber(i) % 10
                        && simpleArray.getArrayNumber(i)/100 != simpleArray.getArrayNumber(i)/10%10
                        && simpleArray.getArrayNumber(i) %10 != simpleArray.getArrayNumber(i)/10%10){
                    threeDigitNumbers += simpleArray.getArrayNumber(i) + " ";
                }
            }
        }
        logger.info("Поиск чисел выполнен: " + threeDigitNumbers);
        return threeDigitNumbers;
    }
}
