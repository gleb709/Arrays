package tasks.epam.report;

import tasks.epam.entity.SimpleArray;
import tasks.epam.sorting.BubbleSort;
import tasks.epam.sorting.Sort;

public class Report {

    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray();
        simpleArray.setArray();
        System.out.println("==========");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.startBubbleSort(simpleArray, simpleArray.getArraySizeX(), simpleArray.getArraySizeY());
        Sort sort = new Sort();
        sort.startSort(true, simpleArray);
        Report report = new Report();
        report.startReport(simpleArray);
        System.out.println();
        Sort sort1 = new Sort();
        sort1.startSort(false, simpleArray);
        Report report1 = new Report();
        report1.startReport(simpleArray);
    }

    public void startReport(SimpleArray array){
        String report = "";
        for(int x = 0; x < array.getArraySizeX(); x++){
            for(int y = 0; y < array.getArraySizeY(); y++){
                report += array.getArrayNumber(x, y) + " ";
            }
            System.out.println(report);
            report = "";
        }
    }
}
