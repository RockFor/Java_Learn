/**
 * Created by ����� on 06.03.2016.
 */
/**
 * Created by ����� on 06.03.2016.
 */
import stackInterface.*;

// ������������ ���� � �������������� ���������� ������� ������� ��� �������������

class DynStack implements IntStack {
    private int[] stck; // ������ ��� �������� �����
    private int tos; // ���������� ������� ��� ����������� �� �����
    private final int INIT_VALUE = -1;
    private String nameOfStack;
    private boolean IsNotNegativeNum(int x) {
        return x <= 0 ? false : true;
    }
    DynStack(int size, String nameOfStack) { // �������������
        if(IsNotNegativeNum(size)) {
            stck = new int[size];
            tos = INIT_VALUE;
        }
        else System.out.println("Error #001");
        this.nameOfStack = nameOfStack;
    }
    // ��������� ������� � �����
    public void push(int item) {
        if(tos != stck.length-1) {
            stck[++tos] = item;
        }
        else {
            // ���������� ������� ����� � ������ ������������
            int[] temp = new int[stck.length << 1];
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;
            System.out.println("������ ����� " + nameOfStack + " �������� � ����!");
        }
    }
    public int pop() {
        if(tos > INIT_VALUE) {
            return stck[tos--];
        }
        else {
            System.out.println("���� ����!");
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

