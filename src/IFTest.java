/**
 * Created by Гость on 06.03.2016.
 */
import stackInterface.*;

class FixedStack implements IntStack {
    private int stck[]; // Массив для хранения стека
    private int tos; // Переменная счетчик для перемещения по стеку
    private final int INIT_VALUE = -1;
    private boolean IsNotNegativeNum(int x) {
        return x <= 0 ? false : true;
    }
    FixedStack(int size) {
        if(IsNotNegativeNum(size)) {
            stck = new int[size];
            tos = INIT_VALUE;
        }
        else System.out.println("Error #001");
    }
    // Сохранить элемент в стеке
    public void push(int item) {
        if(tos != stck.length-1) {
            stck[++tos] = item;
        }
        else {
            System.out.println("Стек заполнен!");
        }
    }
    public int pop() {
        if(tos > INIT_VALUE) {
            return stck[tos--];
        }
        else {
            System.out.println("Стек пуст!");
            return 0;
        }
    }
}

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
        for(int i = 0; i < 5; i++) mystack1.push(i);
        for(int i = 0; i < 8; i++) mystack2.push(i);
        for(int i = 0; i < 5; i++)
            System.out.print(mystack1.pop() + ", ");
        System.out.println();
        for(int i = 0; i < 8; i++)
            System.out.print(mystack2.pop() + ", ");

    }
}
