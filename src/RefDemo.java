/**
 * Created by Гость on 04.02.2016.
 */
// Ссылочная переменная суперкласса может ссылаться на объект подкласса
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box10 plainbox;
        System.out.println("Объем weightbox равен " + weightbox.volume());
        System.out.println("Вес weightbox равен " + weightbox.weight + '\n');
        plainbox = weightbox;
        System.out.println("Объем plainbox равен " + plainbox.volume());
    }
}
