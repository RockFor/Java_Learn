package ru.home.enumLearning.wrap;

/**
 * Created by Гость on 28.03.2016.
 */
// Оболочки элементарных типов
public class Wrap {
    public static void main(String[] args) {
        Integer iOb = new Integer(100);
        int i = iOb.intValue();
        System.out.println(i + " " + iOb);

    }
}


