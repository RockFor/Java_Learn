/**
 * Created by Гость on 21.01.2016.
 */
class RecTest {
    int values[];
    RecTest(int i) {
        values = new int[i];
    }
    // Рекурсивное отображение элементов массива
    void printArray(int i) {
        if(i == 0) return;
        else printArray(i - 1);
        System.out.println("["+(i-1)+"] " + values[i - 1]);
    }
}
public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        for (int i = 0; i < 10; i++) {
            ob.values[i] = i*2;
        }
        ob.printArray(10);
    }
}
