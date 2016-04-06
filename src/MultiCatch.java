/**
 * Created by Гость on 08.03.2016.
 */
// Многократный перехват

public class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char chrs[] = {'A','B','C'};
        for (int i = 0; i < 3; i++) {
            try {
                switch(i) {
                    case 0: {
                        a = a/b;
                    }
                    case 1: {
                        chrs[5] = 'X';
                    }
                }
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException exc) {
                System.out.println("Перехвачено исключение: " + exc);
            }

        }

    }
}
