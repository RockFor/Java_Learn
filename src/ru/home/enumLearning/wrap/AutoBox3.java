package ru.home.enumLearning.wrap;

/**
 * Created by ����� on 28.03.2016.
 */
public class AutoBox3 {
    /*static String getRating(int n) {
        switch(n > 4 && n < 21 ? 1 : 0) {
                case 0: {
                    n %= 10;
                    switch(n == 1 ? 1 : 0) {
                        case 0: {
                            switch(n < 5 && n != 0 ? 1 : 0) {
                                case 0: return "������";
                                case 1: return "�������";
                            }
                        }
                        case 1: {
                            return "�������";
                        }
                    }
                }
                case 1: {
                    return "������";
                }
            default: {
                return "������";
            }
        }

    }*/
    public static void main(String[] args) {

        /*for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + getRating(i));
        }*/


        Integer iOb, iOb2; // �������� �������� �����
        Double dOb = 98.6; // �������� � �������� �������� � �������� ����
        int i;
        iOb = 100;
        System.out.println("�������� �������� iOb " + iOb);
        ++iOb; // ��� ��������� ������������� ������������� �������� �������
               // ������ ����������, � ����� ������������ �������.
        System.out.println("����� ++iOb " + iOb);
        iOb2 = iOb + (iOb / 3); // �������� ���������������, ����������� � ������������� �������
        System.out.println("iOb2 ����� ��������� " + iOb2);
        i = iOb + (iOb / 3); // �������� ���������������, ����������� �� �� ������������� �������
        System.out.println("i ����� ��������� " + i);
        System.out.println("��������� ���������� ����� " + (iOb2 + dOb)); // ��� ��������� ��������� ����������
                                                                          // ���� ��������������� ������������ � ���������
        Integer iOb3 = 2;
        switch (iOb3) {
            case 1:
                System.out.println("����");
                break;
            case 2:
                System.out.println("���");
                break;
            default:
                System.out.println("������");
        }
    }
}
