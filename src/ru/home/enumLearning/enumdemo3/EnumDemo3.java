package ru.home.enumLearning.enumdemo3;

/**
 * Created by Гость on 25.03.2016.
 */
enum Apple { // Перечисление в Java реализованы в виде классов
    // Каждая константа перечисления это объект, который обладает своими копиями переменнных в классе
    // В этом примере, конструктор вызывается 5 раз чтобы создать 5 объектов констант
    Jonathan(10), GoldenDel(9), ReadDel(12), Winesap(15), Cortland(8); // Константы открытые статические финальные

    // Переменная каждого экземпляра перечисления Apple
    private int price; // price per apple

    // Конструктор, конструкторы также можно перегружать
    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {

        // Отобразить цену Winesap
        System.out.println("Цена Winesap: " + Apple.Winesap.getPrice());

        // Отобразить цену всех яблок
        for(Apple a: Apple.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
        }
    }
}
