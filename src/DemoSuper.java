/**
 * Created by ����� on 07.02.2016.
 */
class Box11 {
    private double width,height,depth;
    // ������������ �������
    Box11(Box11 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // �������� ���� ���������
    Box11(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    // ������������� �� ���������
    Box11() {
        width = height = depth = -1;
    }
    // ������������� ����
    Box11(double len) {
        width = height = depth = len;
    }

    // ���������� � ������� ������
    double volume() {
        return width*height*depth;
    }
}

class BoxWeight11 extends Box11 {
    private double weight;
    // ������������ �������
    BoxWeight11(BoxWeight11 ob) {
        super(ob);
        weight = ob.weight;
    }
    // �������� ���� ���������
    BoxWeight11(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }
    // ������������� �� ���������
    BoxWeight11() {
        super();
        weight = -1;
    }
    // ������������� ����
    BoxWeight11(double len, double m) {
        super(len);
        weight = m;
    }

    double GetWeight() {
        return weight;
    }
}

class Shipment extends BoxWeight11 {
    private double cost;
    // ������������ �������
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    // �������� ���� ���������
    Shipment(double w, double h, double d, double m, double c) {
        super(w,h,d,m);
        cost = c;
    }
    // ������������� �� ���������
    Shipment() {
        super();
        cost = -1;
    }
    // ������������� ����
    Shipment(double len, double m, double c) {
        super(len,m);
        cost = c;
    }
    double GetCost() {
        return cost;
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        Shipment mybox1 = new Shipment(10,20,15,34.3,30.1);
        Shipment mybox2 = new Shipment(2,3,4,0.076,1.24);
        Shipment mybox3 = new Shipment();
        Shipment mycube = new Shipment(3,2,15.5);
        Shipment myclone = new Shipment(mybox1);

        System.out.println("����� mybox1 ����� " + mybox1.volume());
        System.out.println("��� mybox1 ����� " + mybox1.GetWeight());
        System.out.println("�������� mybox1 ����� " + mybox1.GetCost());
        System.out.println();
        System.out.println("����� mybox2 ����� " + mybox2.volume());
        System.out.println("��� mybox2 ����� " + mybox2.GetWeight());
        System.out.println("�������� mybox2 ����� " + mybox2.GetCost());
        System.out.println();
        System.out.println("����� mybox3 ����� " + mybox3.volume());
        System.out.println("��� mybox3 ����� " + mybox3.GetWeight());
        System.out.println("�������� mybox3 ����� " + mybox3.GetCost());
        System.out.println();
        System.out.println("����� myclone ����� " + myclone.volume());
        System.out.println("��� myclone ����� " + myclone.GetWeight());
        System.out.println("�������� myclone ����� " + myclone.GetCost());
        System.out.println();
        System.out.println("����� mycube ����� " + mycube.volume());
        System.out.println("��� mycube ����� " + mycube.GetWeight());
        System.out.println("�������� mycube ����� " + mycube.GetCost());



    }
}
