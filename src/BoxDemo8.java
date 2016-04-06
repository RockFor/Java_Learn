/**
 * Created by ����� on 21.01.2016.
 */
// ���������� ������������� ������ Box8

class Box8 {
    double width;
    double height;
    double depth;

    Box8(double w, double h, double d) { // ����������� � ����� �����������
        width = w;
        height = h;
        depth = d;
    }
    Box8() {
        width = height = depth = -1; // �������������������� ��������������
    }
    Box8(double len) {
        width = height = depth = len; // �������� ����
    }
    // ���������� � ������� ������
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo8 {
    public static void main(String[] args) {
        Box8 mybox1 = new Box8(10,20,15); // ����������� � ����� �����������
        Box8 mybox2 = new Box8(); // �������������������� ��������������
        Box8 mycube = new Box8(7); // ������������� ����
        System.out.println("����� ����� mybox1: " + mybox1.volume());
        System.out.println("����� ����� mybox2: " + mybox2.volume());
        System.out.println("����� ����� mycube: " + mycube.volume());
    }
}
