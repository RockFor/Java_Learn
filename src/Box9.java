/**
 * Created by ����� on 21.01.2016.
 */
// � ���� ������ Box9 ��������� ������������� ������ ������� ������
class Box9 {
    double width;
    double height;
    double depth;

    Box9(Box9 ob) { // �������� ������� ������������ ��� ������������� ������ ������� ������
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box9(double w, double h, double d) { // ����������� � ����� �����������
        width = w;
        height = h;
        depth = d;
    }
    Box9() {
        width = height = depth = -1; // �������������������� ��������������
    }
    Box9(double len) {
        width = height = depth = len; // �������� ����
    }
    // ���������� � ������� ������
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo9 {
    public static void main(String[] args) {
        Box9 mybox1 = new Box9(10,20,15); // ����������� � ����� �����������
        Box9 mybox2 = new Box9(); // �������������������� ��������������
        Box9 mycube = new Box9(7); // ������������� ����

        Box9 myclone = new Box9(mybox1); // ������������� ����� ��������
        System.out.println("����� ����� mybox1: " + mybox1.volume());
        System.out.println("����� ����� mybox2: " + mybox2.volume());
        System.out.println("����� ����� mycube: " + mycube.volume());
        System.out.println("����� ����� �����: " + myclone.volume());
    }
}
