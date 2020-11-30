package tasks.epam.searchalgorithm;

import tasks.epam.entity.SimpleArray;

import java.util.logging.Logger;

public class BinarySearch {
    private static final Logger logger= Logger.getLogger(BinarySearch.class.getName());

    public String startBinarySearch(SimpleArray array, int elementToFind){
        int element = 0;
        int firstElement = 0;
        int lastElement = array.getArraySize()-1;
        String answer = "";
        while(true){
            element =(firstElement + lastElement)/2;
            if(array.getArrayNumber(element) == elementToFind){
                answer += "Номер числа в массиве: " + element;
                logger.info("Искомое числло найдено: " + element);
                break;
            }else if(firstElement >= lastElement){
                answer += "Такого числа в массиве нет";
                break;
            }
            if(elementToFind < array.getArrayNumber(element)){
                lastElement = element-1;
            }else{
                firstElement = element+1;
            }
        }
       return answer;
    }
}
