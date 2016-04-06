package ru.home.enumLearning;

/**
 * Created by ����� on 25.03.2016.
 */
/*
enum Apple { // ������������ � Java ����������� � ���� �������
    Jonathan, GoldenDel, ReadDel, Winesap, Cortland
}
*/
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("��������� Apple:");

        // ���������� ������ values()
        Apple allapples[] = Apple.values(); // ���������� ������ �� ������������
        for(Apple a: allapples) {
            System.out.println(a);
        }
        System.out.println();

        // ���������� ������ valuesOf()
        try {
            ap = Apple.valueOf("Winesap1"); // ���������� ��������� ������������ ��������� � ������
            System.out.println("ap �������� " + ap);
        } catch (IllegalArgumentException exc) {
            System.out.println("�������� ��������!");
        }

    }


}
