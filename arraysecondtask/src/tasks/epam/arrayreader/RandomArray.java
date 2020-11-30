package tasks.epam.arrayreader;

import java.util.logging.Logger;

public class RandomArray {
    private static final Logger logger = Logger.getLogger(RandomArray.class.getName());
    public int[][] setRandomArray(int x, int y){
        int[][] array = new int[x][y];
        for(int x1 = 0; x1 < x; x1++){
            for(int y1 = 0; y1 < y; y1++){
                array[x1][y1] = (int)(1 + Math.random()*98);
            }
        }
        logger.info("Create random array: x=" + x + ", y=" + y);
        return array;
    }
}
