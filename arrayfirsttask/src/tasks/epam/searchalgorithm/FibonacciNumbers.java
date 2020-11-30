package tasks.epam.searchalgorithm;

import tasks.epam.entity.SimpleArray;

import java.util.logging.Logger;

public class FibonacciNumbers {
    private static final Logger logger = Logger.getLogger(FibonacciNumbers.class.getName());

    public SimpleArray startSearchFibonacciNumbers(SimpleArray simpleArray){
        int counter = 0;
        int previousNumber;
        int presentNumber;
        int bufferNumber;
        String fibonacciNumbers = "Числа Фибоначчи в массиве: ";
        for(int i = 0; i < simpleArray.getArraySize(); i++){
            presentNumber = 1;
            previousNumber = 1;
            while(true){
                if (simpleArray.getArrayNumber(i) == presentNumber) {
                    fibonacciNumbers += "ID: " + counter + " Число: " + simpleArray.getArrayNumber(i) + " ";
                    break;
                }else if(presentNumber > simpleArray.getArrayNumber(i)){
                    break;
                }
                bufferNumber = presentNumber;
                presentNumber = presentNumber + previousNumber;
                previousNumber = bufferNumber;

            }
            counter++;
        }
        logger.info("Строка проверена на числа Фибоначчи, найденные числа: " + fibonacciNumbers);
        return simpleArray;
    }
}
