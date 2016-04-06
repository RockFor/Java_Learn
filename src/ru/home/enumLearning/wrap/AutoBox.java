package ru.home.enumLearning.wrap;

/**
 * Created by Гость on 28.03.2016.
 */
// Автоупаковка и автораспаковка оболочки типов
public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100; // Автоматически упаковывает 100 в объект
        int i = iOb; // Автоматически распаковывает 100 из объекта в переменную элементарного типа
        System.out.println(i + " " + iOb);
    }
}
