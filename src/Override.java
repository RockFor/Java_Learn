/**
 * Created by ����� on 08.02.2016.
 */
// ��������������� �������
class A2 {
    private int i,j;
    A2() {
        i = 2;
        j = 3;
    }
    A2(int i, int j) {
        this.i = i;
        this.j = j;
    }
    void show() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}

class B2 extends A2 {
    int k;
    B2() {
        k = 0;
    }
    void show() { // ������ ����� �������� ����� � ����� ������ - �.�. �������������� ���
        super.show(); // �� ���� ������� ����� ����������� � ������ ��������� �� ��� ���������
        System.out.println("k: " + k);
    }

}

public class Override {
    public static void main(String[] args) {
        B2 ob = new B2();
        ob.show();

    }
}
