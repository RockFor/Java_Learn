/**
 * Created by ����� on 16.12.2015.
 */
class Stack {
    int stck[] = new int[10];
    int tos = -1;

    void push(int i) {
        if (tos == 9) {
            System.out.println("���� ��������!");
        }
        else {
            stck[++tos] = i;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("���� ����!");
            return tos;
        }
        else {
            return stck[tos--];
        }
    }

}

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(mystack1.pop());
        }
    }
}
