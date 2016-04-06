package stackInterface;

/**
 * Created by Гость on 06.03.2016.
 */
public interface IntStack {
    void push(int item); // Сохранить элемент в стеке
    int pop(); // Извлечь элемент из стека
    default void clear() {
        System.out.println("Метод clear() не реализован!");
    }
}
