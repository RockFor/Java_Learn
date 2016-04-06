/**
 * Created by Гость on 21.01.2016.
 */
// Перегрузка конструкторов класса Box8

class Box8 {
    double width;
    double height;
    double depth;

    Box8(double w, double h, double d) { // Конструктор с тремя параметрами
        width = w;
        height = h;
        depth = d;
    }
    Box8() {
        width = height = depth = -1; // Неинициализированный параллелипипед
    }
    Box8(double len) {
        width = height = depth = len; // Создание куба
    }
    // Вычисление и возврат объема
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo8 {
    public static void main(String[] args) {
        Box8 mybox1 = new Box8(10,20,15); // Конструктор с тремя параметрами
        Box8 mybox2 = new Box8(); // Неинициализированный параллелипипед
        Box8 mycube = new Box8(7); // Инициализация куба
        System.out.println("Объем равен mybox1: " + mybox1.volume());
        System.out.println("Объем равен mybox2: " + mybox2.volume());
        System.out.println("Объем равен mycube: " + mycube.volume());
    }
}
