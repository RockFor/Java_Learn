/**
 * Created by Гость on 10.11.2015.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {-123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                /*-123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3*/};
        long startTime = System.currentTimeMillis();
        for(int q = 0; q < 1000000; q++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        System.out.println("Time op: " + (System.currentTimeMillis() - startTime));
        int[] array2 = {-123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                /*-123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3,
                -123,1,2,3,4,-1,4,6,-5,3*/};
        startTime = System.currentTimeMillis();
        for(int q = 0; q < 1000000; q++) {
            for (int i = array2.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array2[j] > array2[j + 1]) {
                        int tmp = array2[j];
                        array2[j] = array2[j + 1];
                        array2[j + 1] = tmp;
                    }
                }
            }
        }
        System.out.println("Time standart: " + (System.currentTimeMillis() - startTime));


        for (int i = 0; i < array.length; i++) {
            if((i%10) == 0) System.out.println();
            System.out.print(array[i] + "\t");
        }
        System.out.println(array.length&2);
        for (int i = 0; i < array2.length; i++) {
            if((i%10) == 0) System.out.println();
            System.out.print(array2[i] + "\t");
        }
    }
}
