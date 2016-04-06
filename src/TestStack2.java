/**
 * Created by Гость on 21.01.2016.
 */

// Версия программы стек с использованием модификаторов доступа

class Stack1 {
    private int stck[];
    private int tos = -1;

    Stack1(int size) {
        stck = new int[size];
    }

    void push(int i) {
        if (tos == stck.length-1) {
            System.out.println("Стек загружен!");
        }
        else {
            stck[++tos] = i;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек пуст!");
            return tos;
        }
        else {
            return stck[tos--];
        }
    }

}

class TestStack1 {
    public static void main(String[] args) {
        final int SIZE_OF_STACK = 15;
        Stack1 myStack1 = new Stack1(SIZE_OF_STACK);
        for (int i = 0; i < SIZE_OF_STACK; i++) {
            myStack1.push(i<<1);
        }
        for (int i = 0; i < SIZE_OF_STACK+5; i++) {
            System.out.println(myStack1.pop());
        }
    }
}