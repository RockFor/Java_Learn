/**
 * Created by Гость on 06.03.2016.
 */
// Обработка исключений

public class Ex2 {
    public static void main(String[] args) {
        int d, a;
        try { // Проконтролировать блок кода
            d = 0;
            a = 42 / d;
        }
        catch (ArithmeticException e) { // Перехватить ошибку деления на нуль
            System.out.println("Деление на нуль!");
        }
        System.out.println("После оператора catch.");
    }
}
