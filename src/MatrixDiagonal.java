/**
 * Created by Гость on 16.03.2016.
 */
import java.util.Random;

class Matrixal {
    private final int SIZE_OF_ARRAY;
    private int[][] array;
    Matrixal(int n) {
        SIZE_OF_ARRAY = n;
        array = new int[SIZE_OF_ARRAY][SIZE_OF_ARRAY];
        fillArray();
        System.out.println("Массив успешно создан и заполнен случайными значениями.");
    }

    private void fillArray() {
        Random rand = new Random();
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            for (int j = 0; j < SIZE_OF_ARRAY; j++) {
                array[i][j] = rand.nextInt(100);
            }
        }
    }

    private void printArray() {
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            for (int j = 0; j < SIZE_OF_ARRAY; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private int foldElements() {
        int sumOfElements = 0;
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
                sumOfElements += array[SIZE_OF_ARRAY-i-1][i];
        }
        return sumOfElements;
    }

    private int findMaxElement() {
        int maxOfElements = array[SIZE_OF_ARRAY - 1][0];
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            if (array[SIZE_OF_ARRAY-i-1][i] > maxOfElements) {
                maxOfElements = array[SIZE_OF_ARRAY-i-1][i];
            }
        }
        return maxOfElements;
    }

    void run() {
        System.out.println("Массив:");
        printArray();
        System.out.println("Сумма элементов побочной диагонали массива " + foldElements());
        System.out.println("Максимальный элемент в побочной диагонали массива " + findMaxElement());
    }
}

public class MatrixDiagonal {
    public static void main(String[] args) {
        Matrixal matrixal = new Matrixal(3);
        matrixal.run();
    }
}
