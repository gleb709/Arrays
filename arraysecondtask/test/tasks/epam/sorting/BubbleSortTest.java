package tasks.epam.sorting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tasks.epam.entity.SimpleArray;

import static org.testng.Assert.assertEquals;

public class BubbleSortTest {
    private SimpleArray arrayExpected;

    @BeforeMethod
    public void setInfo(){
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        arrayExpected = new SimpleArray(array);
    }

    @Test
    public void testStartBubbleSort() {
        int sizeX = 3;
        int sizeY = 3;
        int[][] array = new int[sizeX][sizeY];
        array[0][0] = 9;
        array[0][1] = 8;
        array[0][2] = 7;
        array[1][0] = 6;
        array[1][1] = 5;
        array[1][2] = 4;
        array[2][0] = 3;
        array[2][1] = 2;
        array[2][2] = 1;
        SimpleArray arrayActual = new SimpleArray(array);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.startBubbleSort(arrayActual, sizeX, sizeY);
        assertEquals(arrayActual.hashCode(),arrayExpected.hashCode());
    }

    @AfterMethod
    public void deleteInfo(){
        arrayExpected = null;
    }
}
