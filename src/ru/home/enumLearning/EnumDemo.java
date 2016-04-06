package ru.home.enumLearning;

/**
 * Created by ����� on 25.03.2016.
 */
enum Apple { // ������������ � Java ����������� � ���� �������
    Jonathan, GoldenDel, ReadDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap; // �������� ���������� ���� Apple
        ap = Apple.ReadDel; // ���������� ���������� ��������

        // ����� �������� ����������
        System.out.println("�������� ap: " + ap);

        // ��������� ���� ��������
        ap = Apple.GoldenDel;
        if(ap == Apple.GoldenDel) {
            System.out.println("ap �������� GoldenDel");
        }

        // ������������� ����������� switch
        switch(ap) {
            case Jonathan: {
                System.out.println("Jonathan �������");
                break;
            }
            case GoldenDel: {
                System.out.println("GoldenDel ������");
                break;
            }
            case ReadDel: {
                System.out.println("ReadDel �������");
            break;}
            case Winesap: {
                System.out.println("Winesap �������");
            break;}
            case Cortland: {
                System.out.println("Cortland �������");
            break;}
        }

    }
}
