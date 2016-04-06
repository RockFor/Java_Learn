/**
 * Created by Гость on 06.03.2016.
 */
/**
 * Created by Гость on 06.03.2016.
 */
import stackInterface.*;

// Динамический стек с автоматический увеличение размера массива при необходимости

class DynStack implements IntStack {
    private int[] stck; // Массив для хранения стека
    private int tos; // Переменная счетчик для перемещения по стеку
    private final int INIT_VALUE = -1;
    private String nameOfStack;
    private boolean IsNotNegativeNum(int x) {
        return x <= 0 ? false : true;
    }
    DynStack(int size, String nameOfStack) { // Инициализация
        if(IsNotNegativeNum(size)) {
            stck = new int[size];
            tos = INIT_VALUE;
        }
        else System.out.println("Error #001");
        this.nameOfStack = nameOfStack;
    }
    // Сохранить элемент в стеке
    public void push(int item) {
        if(tos != stck.length-1) {
            stck[++tos] = item;
        }
        else {
            // Увеличение размера стека в случае переполнения
            int[] temp = new int[stck.length << 1];
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;
            System.out.println("Размер стека " + nameOfStack + " увеличен в двое!");
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

public class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5,"MyStack1");
        DynStack mystack2 = new DynStack(8,"MyStack2");
        for(int i = 0; i < 12; i++) mystack1.push(i);
        for(int i = 0; i < 20; i++) mystack2.push(i);
        for(int i = 0; i < 12; i++)
            System.out.print(mystack1.pop() + ", ");
        System.out.println();
        for(int i = 0; i < 20; i++)
            System.out.print(mystack2.pop() + ", ");

    }
}

