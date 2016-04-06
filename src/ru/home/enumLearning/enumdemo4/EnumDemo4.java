package ru.home.enumLearning.enumdemo4;

/**
 * Created by ����� on 25.03.2016.
 */
// ������������� ���� ������� �� ������ java.lang.Enum
// ordinal(), compareTo(), equals()
enum Apple { // ������������ � Java ����������� � ���� �������
    Jonathan, GoldenDel, ReadDel, Winesap, Cortland
}

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple[] ap = {
                Apple.ReadDel,
                Apple.GoldenDel,
                Apple.ReadDel
        };

        // ���������� ����������� �������� ������������
        for(Apple a: Apple.values()) {
            System.out.println("���������� �������� " + a + " " + a.ordinal());
        }
        // ���������� ������� compareTo() equals()
        if(ap[0].compareTo(ap[1]) < 0) {
            System.out.println(ap[0] + " ���� �� " + ap[1] + " ");
        }
        if(ap[0].compareTo(ap[1]) > 0) {
            System.out.println(ap[0] + " ���� ����� " + ap[1] + " ");
        }
        if(ap[0].compareTo(ap[2]) == 0) {
            System.out.println(ap[0] + " ������������ " + ap[2] + " ");
        }
        System.out.println();

        if(ap[0].equals(ap[1])) {
            System.out.println("Error!");
        }
        if(ap[0].equals(ap[2])) {
            System.out.println(ap[0] + " equals " + ap[2]);
        }
        if(ap[0] == ap[2]) {
            System.out.println(ap[0] + " == " + ap[2]);
        }

    }
}
