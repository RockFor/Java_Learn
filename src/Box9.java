/**
 * Created by Гость on 21.01.2016.
 */
// В этой версии Box9 допускает инициализацию одного объекта другим
class Box9 {
    double width;
    double height;
    double depth;

    Box9(Box9 ob) { // Передача объекта конструктору для инициализации одного объекта другим
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box9(double w, double h, double d) { // Конструктор с тремя параметрами
        width = w;
        height = h;
        depth = d;
    }
    Box9() {
        width = height = depth = -1; // Неинициализированный параллелипипед
    }
    Box9(double len) {
        width = height = depth = len; // Создание куба
    }
    // Вычисление и возврат объема
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo9 {
    public static void main(String[] args) {
        Box9 mybox1 = new Box9(10,20,15); // Конструктор с тремя параметрами
        Box9 mybox2 = new Box9(); // Неинициализированный параллелипипед
        Box9 mycube = new Box9(7); // Инициализация куба

        Box9 myclone = new Box9(mybox1); // Инициализация клона объектом
        System.out.println("Объем равен mybox1: " + mybox1.volume());
        System.out.println("Объем равен mybox2: " + mybox2.volume());
        System.out.println("Объем равен mycube: " + mycube.volume());
        System.out.println("Объем клона равен: " + myclone.volume());
    }
}
