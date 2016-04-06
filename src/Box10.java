/**
 * Created by ����� on 29.01.2016.
 */
// � ���� ������ Box10 ������������ ������������ ��� ���������� ������ Box10
class Box10 {
    double width;
    double height;
    double depth;

    Box10(Box10 ob) { // �������� ������� ������������ ��� ������������� ������ ������� ������
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box10(double w, double h, double d) { // ����������� � ����� �����������
        width = w;
        height = h;
        depth = d;
    }
    Box10() {
        width = height = depth = -1; // �������������������� ��������������
    }
    Box10(double len) {
        width = height = depth = len; // �������� ����
    }
    // ���������� � ������� ������
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box10 {
    double weight; // ��� ���������������
    // �����������
    BoxWeight() {}
    BoxWeight(double width, double height, double depth, double weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}
class BoxColor extends BoxWeight {
    int color;
    BoxColor(double width, double height, double depth, double weight, int color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.color = color;
    }
}

class BoxDemo10 {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxColor mybox2 = new BoxColor(10,20,15,34.3,0xFF);
        //BoxColor mybox1Color = new BoxColor(10,20,15,34.3,0xFF);
        double vol;
        vol = mybox1.volume();
        System.out.println("����� mybox1 ����� " + vol);
        System.out.println("��� mybox1 ����� " + mybox1.weight);
        vol = mybox2.volume();
        System.out.println("����� mybox1 ����� " + vol);
        System.out.println("��� mybox1 ����� " + mybox2.weight);
        System.out.println("���� mybox1 ����� " + mybox2.color);
    }
}
