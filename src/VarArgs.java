/**
 * Created by Гость on 22.01.2016.
 */
// Демонстрация использования списка аргументов переменной длины
public class VarArgs {
    // Перегрузка методов
        static void vaTest(int ... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for(int x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest(boolean ... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for(boolean x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

        public static void main(String[] args) {
            vaTest(10);
            vaTest(1,2,3);
            // vaTest(); неоднозначность из за перегрузки метода
        }
}
