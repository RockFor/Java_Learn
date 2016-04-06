/**
 * Created by Гость on 09.02.2016.
 */
// Даны квадратные матрицы А и В порядка n. Найти матрицу А (В-Е), где Е - единичная матрица порядка n.
public class MatrixResult {
    private static final int N = 3;
    private static int[][] newArray = new int[N][N];
    private static int[][] a = new int[N][N];
    private static int[][] b = new int[N][N];

    private static int[] e = new int[N];

    private static void fillArrays() {
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = (i+1)*2;
                b[i][j] = (j+2)*2;
            }
            e[i] = (i+1) * 3;
        }
    }

    private static void printArrays() {
        System.out.println("a[] = ");
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("b[] = ");
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("e[] = ");
        for(int i = 0; i < N; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println();
    }

    private static void getNewArray() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] -= e[i];
            }
        }
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                newArray[k][i] = 0;
                for (int j = 0; j < N; j++) {
                    newArray[k][i]+=a[k][j]*b[j][i];
                }
            }
        }
    }

    public static void main(String[] args) {
        fillArrays();
        printArrays();
        getNewArray();
        System.out.println("---------------------------------");
        printArrays();
        System.out.println("Got new array");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
