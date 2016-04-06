/**
 * Created by Гость on 10.12.2015.
 */
// использование цикла do-while для выбора пункта меню
class Menu {
    public static void main(String[] args) throws java.io.IOException {
        char choice;
        do {
            System.out.println("Справка по:");
            System.out.println("1. asd:");
            System.out.println("2. asd123:");
            System.out.println("3. asd111:");
            choice = (char) System.in.read();
        }
        while(choice < '1' || choice > '5');
    }
}