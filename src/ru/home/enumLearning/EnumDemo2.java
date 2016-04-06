package ru.home.enumLearning;

/**
 * Created by Гость on 25.03.2016.
 */
/*
enum Apple { // Перечисление в Java реализованы в виде классов
    Jonathan, GoldenDel, ReadDel, Winesap, Cortland
}
*/
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Константы Apple:");

        // Применение метода values()
        Apple allapples[] = Apple.values(); // Возвращает массив из перечисления
        for(Apple a: allapples) {
            System.out.println(a);
        }
        System.out.println();

        // Применение метода valuesOf()
        try {
            ap = Apple.valueOf("Winesap1"); // Возвращает константу перечисления указанную в строке
            System.out.println("ap содержит " + ap);
        } catch (IllegalArgumentException exc) {
            System.out.println("Неверный аргумент!");
        }

    }


}
