/**
 * Created by ����� on 28.03.2016.
 */
import java.util.Scanner;
import java.util.Random;
class RandomNumbers {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int N = 0;
    private int[] myArray;
    public void setN(){
        System.out.print("������� ���������� ��������� �����: ");
        try {
            N = scanner.nextInt();
            myArray = new int[N];
        } catch (NegativeArraySizeException exc) {
            System.out.println("�������� ���������� ��������� " + N);
            N = Math.abs(N);
            myArray = new int[N];
            System.out.println("���������� �� " + N);
        }
    }
    public int getN(){
        return N;
    }
    public void setMyArray(int N){
        for (int i = 0; i<N; i++){
            myArray[i] = random.nextInt();
        }

    }
    public void showMyArray(){
        System.out.print("������ ��������� ����� ��� �������� �� ����� ������: ");
        for (int i = 0; i<myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
    public void showLnMyArray(){
        System.out.println("������ ��������� ������ � ��������� �� ����� ������: ");
        for (int i = 0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

}
public class Main {
    public static void main(String[] args){
        int n = 10000;
        int a = 1, b = 1;
        //System.out.print(a + " " + b + " ");
        int fib = 0;
        while((a + b) < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(fib + " ");
        }
    }
}

