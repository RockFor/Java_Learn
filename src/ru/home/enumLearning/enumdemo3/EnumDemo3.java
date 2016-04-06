package ru.home.enumLearning.enumdemo3;

/**
 * Created by ����� on 25.03.2016.
 */
enum Apple { // ������������ � Java ����������� � ���� �������
    // ������ ��������� ������������ ��� ������, ������� �������� ������ ������� ����������� � ������
    // � ���� �������, ����������� ���������� 5 ��� ����� ������� 5 �������� ��������
    Jonathan(10), GoldenDel(9), ReadDel(12), Winesap(15), Cortland(8); // ��������� �������� ����������� ���������

    // ���������� ������� ���������� ������������ Apple
    private int price; // price per apple

    // �����������, ������������ ����� ����� �����������
    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {

        // ���������� ���� Winesap
        System.out.println("���� Winesap: " + Apple.Winesap.getPrice());

        // ���������� ���� ���� �����
        for(Apple a: Apple.values()) {
            System.out.println(a + " ����� " + a.getPrice() + " ������.");
        }
    }
}
