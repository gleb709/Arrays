package tasks.epam.searchalgorithm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tasks.epam.entity.SimpleArray;

import static org.testng.Assert.assertEquals;

public class MinSearchTest {
    private int numberExpected;
    private SimpleArray simpleArray;

    @BeforeMethod
    public void setInfo(){
        int[] array = new int[]{12, 15, 300, 400, 873, 4531, 124, 54, 2, 4123, 43};
        simpleArray = new SimpleArray(array);
        numberExpected = 2;
    }
    @Test
    public void testStartMinSearch() {
        MinSearch minSearch = new MinSearch();
        int numberActual = minSearch.startMinSearch(simpleArray);
        assertEquals(numberActual, numberExpected);
    }
    @AfterMethod
    public void deleteInfo(){
        simpleArray = null;
    }
}