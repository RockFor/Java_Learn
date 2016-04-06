/**
 * Created by Гость on 11.12.2015.
 */
// break - производит выход из самого внутреннего цикла
public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if(j == 10) break; // Выход из вложенного цикла
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены!");
    }
}
