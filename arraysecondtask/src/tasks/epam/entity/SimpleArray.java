package tasks.epam.entity;

import tasks.epam.arrayreader.RandomArray;

public class SimpleArray {
    private int[][] array;
    private int arraySizeX;
    private int arraySizeY;
    private int[] arraySumStrings;
    private int[] arrayMaxElements;
    private int[] arrayMinElements;

    public SimpleArray(SimpleArray simpleArray){
        this.array = simpleArray.array;
        this.arraySizeX = simpleArray.getArraySizeX();
        this.arraySizeY = simpleArray.getArraySizeY();
    }

    public SimpleArray(int[][] array){
        this.array = array;
    }

    public int getArraySumStrings(int i) {
        return arraySumStrings[i];
    }

    public void setArraySumStrings(int x, int number) {
        arraySumStrings[x] = number;
    }

    public int getArrayMaxElements(int i) {
        return arrayMaxElements[i];
    }

    public void setArrayMaxElements(int x, int number) {
        arrayMaxElements[x] = number;
    }

    public int getArrayMinElements(int i) {
        return arrayMinElements[i];
    }

    public void setArrayMinElements(int x, int number) {
        arrayMinElements[x] = number;
    }

    public SimpleArray(){
        arraySizeX = (int)(1 + Math.random()*7);
        arraySizeY = (int)(1 + Math.random()*7);
        arraySumStrings = new int[arraySizeX];
        arrayMaxElements = new int[arraySizeX];
        arrayMinElements = new int[arraySizeX];
    }

    public void setArray(){
        RandomArray randomArray = new RandomArray();
        array = randomArray.setRandomArray(arraySizeX,arraySizeY);
    }

    public void setArrayNumber(int x, int y, int number){
        array[x][y] = number;
    }

    public int getArraySizeX() {
        return arraySizeX;
    }

    public void setArraySizeX(int arraySizeX) {
        this.arraySizeX = arraySizeX;
    }

    public int getArraySizeY() {
        return arraySizeY;
    }

    public void setArraySizeY(int arraySizeY) {
        this.arraySizeY = arraySizeY;
    }

    public int getArrayNumber(int x, int y){
        return array[x][y];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int x = 0 ; x < arraySizeX; x++) {
            for (int y = 0; y < arraySizeY; y++) {
                builder.append(array[x][y]);
                builder.append(" ");
            }
        }
            builder.append(arraySizeX);
            builder.append(" ");
            builder.append(arraySizeY);
            builder.append(" ");
            for(int x = 0; x < arraySizeX; x++) {
                builder.append(arrayMaxElements);
                builder.append(" ");
            }
        for(int x = 0; x < arraySizeX; x++) {
            builder.append(arrayMinElements);
            builder.append(" ");
        }
        for(int x = 0; x < arraySizeX; x++) {
            builder.append(arraySumStrings);
            builder.append(" ");
        }
        builder.append(arraySizeX);
        builder.append(" ");
        builder.append(arraySizeY);
        builder.append(" ");
        builder.append(super.toString());
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        SimpleArray newSimpleArray = (SimpleArray) o;
        for(int x = 0; x < arraySizeX; x++) {
            for( int y = 0; y < arraySizeY; y++){
                Integer arrayNumber = array[x][y];
                if (!arrayNumber.equals(newSimpleArray.getArrayNumber(x, y))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hCode = array[0][0];
        for (int x = 1; x < arraySizeX; x++){
            for(int y = 0; y < arraySizeY; y++){
                hCode += hCode * 31 + array[x][y];
            }
        }
        return hCode;
    }
}
