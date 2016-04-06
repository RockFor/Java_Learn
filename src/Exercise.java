/**
 * Created by Гость on 09.03.2016.
 */
public class Exercise {
    private static final int MAX_ARRAY_SIZE = 100;
    private static int[] arrayOne = new int[MAX_ARRAY_SIZE/2],
                         arrayTwo = new int[MAX_ARRAY_SIZE/2];
    private static int firstIndex = 0,
                       secondIndex = 0;

    public static void main(String[] args) {
        try {
            for (int i = 1; i <= MAX_ARRAY_SIZE; i++) {
                if (((i / 10) & 1) == 0) {
                    arrayOne[firstIndex++] = i;
                } else {
                    arrayTwo[secondIndex++] = i;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc);
            return;
        }
        System.out.println("First array's elements:");
        for (int firstArray: arrayOne) {
            System.out.print(firstArray + ", ");
        }
        System.out.println();
        System.out.println("Second array's elements:");
        for (int secondArray: arrayTwo) {
            System.out.print(secondArray + ", ");
        }
    }
}
