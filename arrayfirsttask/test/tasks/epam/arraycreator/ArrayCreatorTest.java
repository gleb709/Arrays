package tasks.epam.arraycreator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tasks.epam.entity.SimpleArray;

import static org.testng.Assert.assertEquals;

public class ArrayCreatorTest {
    final private String FILE_NAME = "inputfiles/array.txt";
    SimpleArray arrayExpected;

    @BeforeMethod
    public void setInfo(){
        int[] array = new int[]{12, 15, 300, 400, 873, 4531, 124, 54, 2, 4123, 43};
        arrayExpected = new SimpleArray(array);
    }

    @Test
    public void testArrayLoaderFromFile() {
        ArrayCreator arrayCreator = new ArrayCreator();
        SimpleArray arrayActual = arrayCreator.arrayLoaderFromFile();
        assertEquals(arrayActual,arrayExpected);
    }

    @AfterMethod
    public void deleteInfo(){
        arrayExpected = null;
    }

}