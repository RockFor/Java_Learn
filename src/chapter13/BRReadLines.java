package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Гость on 05.04.2016.
 */
// Данная программа демонстрирует консольный ввод с использованием метода readLines() подкласса BufferReader класса Reader

public class BRReadLines {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Объект класса BufferedReader в конструктор которого передан объект абстрактного класса Reader
        // конструктор которого InputStreamReader принимает в качестве параметра объект байтового класса
        // InputStream - System.in
        String s; // Строка
        try {
            do {
                s = bf.readLine();
                System.out.println(s);
            } while (!s.equals("стоп"));
        } catch (IOException exc) {
            System.out.println(exc);
        }

    }
}
