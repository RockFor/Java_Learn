package chapter13;

/**
 * Created by Гость on 05.04.2016.
 */

// Ввод с клавиатуры

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException
    {
        char c; // Символьная переменная
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Объект класса BufferedReader в конструктор которого передан объект абстрактного класса Reader
        // конструктор которого InputStreamReader принимает в качестве параметра объект байтового класса
        // InputStream - System.in
        System.out.println("Вводите символы, 'q' - для выхода");
        do {
            c =  (char)br.read();
            System.out.println("Введенный символ " + c);
        } while (c != 'q');

    }
}
