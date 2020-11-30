package tasks.epam.sorting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tasks.epam.entity.SimpleArray;

import static org.testng.Assert.assertEquals;

public class PyramidSortTest {
    SimpleArray arrayExpected;

    @BeforeMethod
    public void setInfo(){
        int[] array = new int[]{2, 12, 15, 43, 54, 124, 300, 400, 873, 4123, 4531};
        arrayExpected = new SimpleArray(array);
    }

    @Test
    public void heapSort() {
        int[] array = new int[]{12, 15, 300, 400, 873, 4531, 124, 54, 2, 4123, 43};
        SimpleArray simpleArray = new SimpleArray(array);
        PyramidSort arrayActual = new PyramidSort();
        arrayActual.heapSort(simpleArray);
        assertEquals(arrayActual.hashCode(), arrayExpected.hashCode());
    }

    @AfterMethod
    public void deleteInfo(){
        arrayExpected = null;
    }
}