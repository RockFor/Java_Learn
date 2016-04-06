package ru.home.enumLearning;

/**
 * Created by Гость on 25.03.2016.
 */
enum Apple { // Перечисление в Java реализованы в виде классов
    Jonathan, GoldenDel, ReadDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap; // Создание переменной типа Apple
        ap = Apple.ReadDel; // Присвоение переменной значения

        // Вывод значения переменной
        System.out.println("Значение ap: " + ap);

        // Сравнение двух значений
        ap = Apple.GoldenDel;
        if(ap == Apple.GoldenDel) {
            System.out.println("ap содержит GoldenDel");
        }

        // Использование конструкции switch
        switch(ap) {
            case Jonathan: {
                System.out.println("Jonathan красный");
                break;
            }
            case GoldenDel: {
                System.out.println("GoldenDel желтый");
                break;
            }
            case ReadDel: {
                System.out.println("ReadDel красный");
            break;}
            case Winesap: {
                System.out.println("Winesap красный");
            break;}
            case Cortland: {
                System.out.println("Cortland красный");
            break;}
        }

    }
}
