package ru.home.enumLearning.wrap;

/**
 * Created by ����� on 28.03.2016.
 */
public class AutoBox2 {
    // ������� �������� Integer � ������� �������� int
    static int m(Integer v) {
        return v; // �������������� int
    }

    public static void main(String[] args) {
        // ������������ �������� ������������� � Integer
        // ������������ ������������� �������� int
        // ����� ������������� � Integer
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
