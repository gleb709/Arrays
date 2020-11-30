package tasks.epam.menu;

import tasks.epam.arraycreator.ArrayCreator;
import tasks.epam.entity.SimpleArray;
import tasks.epam.searchalgorithm.FibonacciNumbers;
import tasks.epam.searchalgorithm.MaxSearch;
import tasks.epam.searchalgorithm.MinSearch;
import tasks.epam.searchalgorithm.SearchPrimeNumbers;
import tasks.epam.searchalgorithm.SearchThreeDigitNumbers;
import tasks.epam.searchalgorithm.BinarySearch;
import tasks.epam.sorting.BubbleSort;
import tasks.epam.sorting.PyramidSort;
import tasks.epam.sorting.QuickSort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleArray simpleArray = new SimpleArray();
        int key = 0;
        int number;
        boolean flag = false;
        while(key != 9){
            System.out.println("1.Создать массив");
            System.out.println("2.Сортировки");
            System.out.println("3.Найти числа Фибоначи");
            System.out.println("4.Найти максимальное число массива");
            System.out.println("5.Найти минимальное число массива");
            System.out.println("6.Найти простые числа массива");
            System.out.println("7.Трехзначные числа массива без повторов цифр");
            System.out.println("8.Найти номер элемента массива");
            System.out.println("9.Выход");

            try {
                key = scanner.nextInt();
            }catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Ошибка ввода");
                continue;
            }
            switch (key){
                case 1: {
                    simpleArray = createArrayMenu();
                    if(simpleArray != null) {
                        flag = true;
                    }
                    break;
                }
                case 2:{
                    if(flag == true){
                        sortArrayMenu(simpleArray);
                    }
                    break;
                }
                case 3:{
                    if(flag == true){
                        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
                        simpleArray = fibonacciNumbers.startSearchFibonacciNumbers(simpleArray);
                    }
                    break;
                }
                case 4:{
                    if(flag == true){
                        MaxSearch maxSearch = new MaxSearch();
                        System.out.println("Наибольшее число массива: " + maxSearch.startMaxSearch(simpleArray));
                    }
                    break;
                }
                case 5:{
                    if(flag == true){
                        MinSearch minSearch = new MinSearch();
                        System.out.println("Наименьшее число массива: " + minSearch.startMinSearch(simpleArray));
                    }
                    break;
                }
                case 6:{
                    if(flag == true){
                        SearchPrimeNumbers searchPrimeNumbers = new SearchPrimeNumbers();
                        System.out.println(searchPrimeNumbers.startSearchPrimeNumbers(simpleArray));
                    }
                    break;
                }
                case 7:{
                    if(flag == true){
                        SearchThreeDigitNumbers searchThreeDigitNumbers = new SearchThreeDigitNumbers();
                        System.out.println(searchThreeDigitNumbers);
                    }
                    break;
                }
                case 8:{
                    if(flag == true){
                        BinarySearch binarySearch = new BinarySearch();
                        System.out.println("Введите число, которое хотите найти: ");
                        try {
                            number = scanner.nextInt();
                        }catch (InputMismatchException e){
                            scanner.nextLine();
                            System.out.println("Ошибка ввода");
                            break;
                        }
                        System.out.println(binarySearch.startBinarySearch(simpleArray, number));
                    }
                    break;
                }
                case 9:
                    break;
                default:{
                    System.out.println("Ошибка ввода");
                    break;
                }

            }
        }
        scanner.close();
    }

    public static SimpleArray sortArrayMenu(SimpleArray simpleArray){
        Scanner scanner1 = new Scanner(System.in);
        int key = 0;
        try {
            key = scanner1.nextInt();
        } catch (InputMismatchException e) {
            scanner1.nextLine();
            System.out.println("Ошибка ввода");
        }
        System.out.println("1.Пузырьковая сортировка");
        System.out.println("2.Пирамидальная сортировка");
        System.out.println("3.Быстрая сортировка");
        switch (key) {
            case 1: {
                BubbleSort bubbleSort = new BubbleSort();
                simpleArray = bubbleSort.bubbleSort(simpleArray);
                break;
            }
            case 2: {
                PyramidSort pyramidSort = new PyramidSort();
                simpleArray = pyramidSort.heapSort(simpleArray);
                break;
            }
            case 3: {
                QuickSort quickSort = new QuickSort();
                simpleArray = quickSort.startSort(simpleArray);
                break;
            }
            default: {
                System.out.println("Ошибка ввода");
                break;
            }
        }
        scanner1.close();
        return simpleArray;
    }

    public static SimpleArray createArrayMenu(){
        SimpleArray simpleArray = new SimpleArray();
        Scanner scanner2 = new Scanner(System.in);
        int key = 0;
        System.out.println("1.Ввод с клавиатуры");
        System.out.println("2.Ввод из файла");
        System.out.println("3.Случайный массив");

        try {
            key = scanner2.nextInt();
        } catch (InputMismatchException e) {
            scanner2.nextLine();
            System.out.println("Ошибка ввода");
        }
        switch (key) {
            case 1: {
                ArrayCreator arrayCreator = new ArrayCreator();
                simpleArray = arrayCreator.arrayLoaderFromConsole();
                break;
            }
            case 2: {
                ArrayCreator arrayCreator = new ArrayCreator();
                simpleArray = arrayCreator.arrayLoaderFromFile();
                break;
            }
            case 3: {
                ArrayCreator arrayRandomCreator = new ArrayCreator();
                simpleArray = arrayRandomCreator.arrayRandomLoader();
                break;
            }
            default: {
                System.out.println("Ошибка ввода");
                break;
            }
        }
        scanner2.close();
        return simpleArray;

    }
}
