package ru.home.enumLearning.wrap;

/**
 * Created by Гость on 28.03.2016.
 */
public class AutoBox2 {
    // Принять параметр Integer и вернуть значение int
    static int m(Integer v) {
        return v; // Автораспаковка int
    }

    public static void main(String[] args) {
        // Передаваемое значение упаковывается в Integer
        // Возвращаемое распакованное значение int
        // Опять упаковывается в Integer
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
