/**
 * Created by ����� on 16.03.2016.
 */
/*
* �������: ������� ����� ������ �������(n*m). ����: ����������� � �������� �������.
* ����������� ������ ����������� �������� � ��������� �������. � ������ ���������� ������������
 * � ������ ������� � �����, ���� ������ ���� Private.
����� � ��������� ������ �������� ������� ������, �� ��������� �� ��������. ����������, ����������,
 ��� ���� �������� � ���� � ��� ����������� ������ �������� � ��������� ������?
*
*
*
* */
import java.util.Random;


class Matrix {
    private int n,m;
    private boolean[][] firstMatrix, secondMatrix;

    Matrix(int nSize, int mSize) {
        n = nSize;
        m = mSize;
        firstMatrix = new boolean[n][m];
        secondMatrix = new boolean[n][m];
    }

    private void fillMatrixByRandom(boolean[][] matrix) { // ���������� �������
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextBoolean();
            }
        }
    }

    private void printMatrix(boolean[][] matrix, String name) { // ������ �������
        System.out.println(name);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print((matrix[i][j] ? 1 : 0) + "\t");
            }
            System.out.println();
        }
    }

    private void inverseMatrix(boolean[][] matrix) { // �������� ������� (���������)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = !matrix[i][j];
            }
        }
        System.out.println();
    }

    private boolean[][] foldMatrix(boolean[][] matrix ,boolean[][] foldedMatrix) { // �������� �������
          boolean[][] foldResult = new boolean[n][m];
          for (int i = 0; i < matrix.length; i++) {
              for (int j = 0; j < matrix[i].length; j++) {
                  foldResult[i][j] = matrix[i][j] | foldedMatrix[i][j];
              }
          }
        System.out.println();
        return foldResult;
    }
    private void odinMatrix(boolean[][] matrix, String name) {
        System.out.println(name);
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j]) count++;
            }
        }
        System.out.print(count);
    }

    void run() {
        fillMatrixByRandom(firstMatrix);
        printMatrix(firstMatrix, "������ �������");
        fillMatrixByRandom(secondMatrix);
        printMatrix(secondMatrix, "������ �������");
        inverseMatrix(firstMatrix);
        printMatrix(firstMatrix, "������ ������� ����� ��������");
        inverseMatrix(secondMatrix);
        printMatrix(secondMatrix, "������ ������� ����� ��������");
        printMatrix(foldMatrix(firstMatrix,secondMatrix), "��������� �������� ���� ��������������� ������");
        inverseMatrix(firstMatrix);
        odinMatrix(firstMatrix, "���������� ����");
    }

}

public class BooleanMatrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,3);
        matrix.run();
    }

}
