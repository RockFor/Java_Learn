/**
 * Created by Гость on 30.10.2015.
 */
/**
 * Created by Гость on 30.10.2015.
 */
// Инициализация массива
public class Matix {
    public static void main(String[] args) {
        int twoD[][] = {
                // Инициализатор массива
                {0},
                {0,1},
                {0,1,2},
                {0*2,1*2,2*2,3*2}
                //
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

