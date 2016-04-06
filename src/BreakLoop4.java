/**
 * Created by Гость on 11.12.2015.
 */
// Использование оператора break для выхода из вложенных циклов
public class BreakLoop4 {
    public static void main(String[] args) {
        outer:for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if(j == 10) break outer; // Выход из вложенного цикла
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены!");
    }
}
