package stackInterface;

/**
 * Created by ����� on 06.03.2016.
 */
public interface IntStack {
    void push(int item); // ��������� ������� � �����
    int pop(); // ������� ������� �� �����
    default void clear() {
        System.out.println("����� clear() �� ����������!");
    }
}
