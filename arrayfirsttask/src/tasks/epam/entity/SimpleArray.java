package tasks.epam.entity;

public class SimpleArray {
    private int arraySize;
    private int[] array;

    public SimpleArray() {}

    public SimpleArray(int[] array){
        this.array = array;
        arraySize = array.length;
    }

    public void remove(int elementId){
        if(elementId < arraySize){
            int newArray[] = new int[--arraySize];
            int arrayElement = 0;
            int newArrayElement = 0;
            for(int i : array) {
                if(arrayElement != elementId) {
                    newArray[newArrayElement++] = i;
                    arrayElement++;
                }else{
                    arrayElement++;
                }
            }
            array = newArray;
            newArray = null;
        }else{
            System.out.println("Введено некорректное число");
        }
    }

    public void add(int element) {
        int newArray[] = new int[++arraySize];
        for(int i = 0; i < arraySize-1; i++) {
            newArray[i] = array[i];
        }
        newArray[arraySize-1] = element;
        array = newArray;
        newArray = null;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public void setArrayNumber(int i, int number) { array[i] = number; }

    public int getArrayNumber(int i) {
        return array[i];
    }

    public void setArray(int[] array) {
        this.array = array;
        this.arraySize = array.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < arraySize; i++){
            builder.append(array[i]);
            builder.append(" ");
        }
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
        for(int i = 0; i < arraySize; i++) {
            Integer arrayNumber = array[i];
            if (!arrayNumber.equals(newSimpleArray.getArrayNumber(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hCode = array[0];
        for (int i = 1; i < arraySize; i++){
             hCode += hCode * 31 + array[i];
        }
        hCode += hCode * 31 + arraySize;
        return hCode;
    }
}
