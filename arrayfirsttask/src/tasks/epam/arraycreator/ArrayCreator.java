package tasks.epam.arraycreator;

import tasks.epam.entity.SimpleArray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class ArrayCreator {
    private final String FILE_NAME = "inputfiles/array.txt";
    private static final Logger logger = Logger.getLogger(ArrayCreator.class.getName());

    public SimpleArray arrayLoaderFromConsole() {
        List<Integer> array = new ArrayList<>(); // Неизвестно конечное число элементов массива, поэтому воспользовался ArrayList
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                array.add(scanner.nextInt());
            } catch (Exception e) {
                if (scanner.nextLine().equals("done")) {
                    break;
                } else {
                    System.out.println("Ошибка ввода");
                }
            }
        }
        int[] newArray = new int[array.size()];
        SimpleArray simpleArray = new SimpleArray(newArray);
        for (Integer i : array) {
            simpleArray.setArrayNumber(number++, i);
        }
        logger.info("Массив создан с помощью консоли");
        return simpleArray;
    }

    public SimpleArray arrayLoaderFromFile() {
        List<Integer> array = new ArrayList<>();
        SimpleArray simpleArray = new SimpleArray();
        int number = 0;
        Scanner scanner;
        try {
            scanner = new Scanner(new FileInputStream(FILE_NAME));
            while(scanner.hasNextInt()){
                array.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (Integer i: array) {
            simpleArray.setArrayNumber(number++, i);
        }
        logger.info("Массив создан с помощью файл: " + FILE_NAME);
        return simpleArray;
    }

    public SimpleArray arrayRandomLoader(){
        final int MIN_NUMBER_ARRAY_SIZE = 8;
        final int MAX_NUMBER_ARRAY_SIZE = 40;
        final int MAX_NUMBER_ARRAY = 5000;
        SimpleArray simpleArray = new SimpleArray();
        int arraySize = (int)(MIN_NUMBER_ARRAY_SIZE + Math.random()*MAX_NUMBER_ARRAY_SIZE);
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            array[i] = (int)(Math.random()*MAX_NUMBER_ARRAY);
        }
        logger.info("Массив создан случайно");
        return simpleArray;
    }
}
