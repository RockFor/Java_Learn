/**
 * Created by Гость on 07.02.2016.
 */
class Box11 {
    private double width,height,depth;
    // Клонирование объекта
    Box11(Box11 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // Указание всех измерений
    Box11(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    // Инициализация по умолчанию
    Box11() {
        width = height = depth = -1;
    }
    // Инициализация куба
    Box11(double len) {
        width = height = depth = len;
    }

    // Вычисление и возврат объема
    double volume() {
        return width*height*depth;
    }
}

class BoxWeight11 extends Box11 {
    private double weight;
    // Клонирование объекта
    BoxWeight11(BoxWeight11 ob) {
        super(ob);
        weight = ob.weight;
    }
    // Указание всех измерений
    BoxWeight11(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }
    // Инициализация по умолчанию
    BoxWeight11() {
        super();
        weight = -1;
    }
    // Инициализация куба
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
    // Клонирование объекта
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    // Указание всех измерений
    Shipment(double w, double h, double d, double m, double c) {
        super(w,h,d,m);
        cost = c;
    }
    // Инициализация по умолчанию
    Shipment() {
        super();
        cost = -1;
    }
    // Инициализация куба
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

        System.out.println("Объем mybox1 равен " + mybox1.volume());
        System.out.println("Вес mybox1 равен " + mybox1.GetWeight());
        System.out.println("Доставка mybox1 равна " + mybox1.GetCost());
        System.out.println();
        System.out.println("Объем mybox2 равен " + mybox2.volume());
        System.out.println("Вес mybox2 равен " + mybox2.GetWeight());
        System.out.println("Доставка mybox2 равна " + mybox2.GetCost());
        System.out.println();
        System.out.println("Объем mybox3 равен " + mybox3.volume());
        System.out.println("Вес mybox3 равен " + mybox3.GetWeight());
        System.out.println("Доставка mybox3 равна " + mybox3.GetCost());
        System.out.println();
        System.out.println("Объем myclone равен " + myclone.volume());
        System.out.println("Вес myclone равен " + myclone.GetWeight());
        System.out.println("Доставка myclone равна " + myclone.GetCost());
        System.out.println();
        System.out.println("Объем mycube равен " + mycube.volume());
        System.out.println("Вес mycube равен " + mycube.GetWeight());
        System.out.println("Доставка mycube равна " + mycube.GetCost());



    }
}
