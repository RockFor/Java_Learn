/**
 * Created by Гость on 16.12.2015.
 */
// Создание конструктора с параметрами

class Box7 {
    double width;
    double height;
    double depth;

    Box7(double w, double h, double d) { // Конструктор с параметрами
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        System.out.println(this);
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 mybox = new Box7(10,20,15); // Конструктор с параметрами
        System.out.println(mybox );
        System.out.println("Объем равен: " + mybox.volume());
    }
}
