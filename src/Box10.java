/**
 * Created by Гость on 29.01.2016.
 */
// В этой версии Box10 наследование используется для расширения класса Box10
class Box10 {
    double width;
    double height;
    double depth;

    Box10(Box10 ob) { // Передача объекта конструктору для инициализации одного объекта другим
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box10(double w, double h, double d) { // Конструктор с тремя параметрами
        width = w;
        height = h;
        depth = d;
    }
    Box10() {
        width = height = depth = -1; // Неинициализированный параллелипипед
    }
    Box10(double len) {
        width = height = depth = len; // Создание куба
    }
    // Вычисление и возврат объема
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box10 {
    double weight; // Вес параллелипипеда
    // Конструктор
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
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        vol = mybox2.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox2.weight);
        System.out.println("Цвет mybox1 равен " + mybox2.color);
    }
}
