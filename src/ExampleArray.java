/**
 * Created by Гость on 11.03.2016.
 */
public class ExampleArray {
    private static int[][] fillArray(int arrayLenght) {
        int[][] inner_array = createArray(arrayLenght);
        for (int i = 0; i < inner_array.length; i++) {
            for (int j = 0; j < inner_array[i].length; j++) {
                inner_array[i][j] = arrayLenght-j;
            }
            arrayLenght--;
        }
        return inner_array;
    }
    private static int[][] createArray(int arrayLenght) {
        int[][] inner_array = new int[arrayLenght][];
        for (int i = 0; i < arrayLenght; i++) {
            inner_array[i] = new int[arrayLenght - i];
        }
        return inner_array;
    }

    private static void printArray(int [][] array) {
        for (int i = 0; i <  array.length; i++) {
            for (int j = 0; j <  array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }

    }


    public static void main(String[] args) {
        printArray(fillArray(20));
    }
}
