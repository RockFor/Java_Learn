/**
 * Created by ����� on 21.01.2016.
 */
// �������� ������� �������� � �������� ����������
class Test {
    int a, b;
    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // ������� �������� true ���� �������� o ����� ����������� �������
    boolean equals(Test o) {
        System.out.println("o.a: " + o.a);
        System.out.println("o.b: " + o.b);
        return ((o.a == a) && (o.b == b)) ? true : false;
    }
}


public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("ob1 == ob2" + " " + ob1.equals(ob2));
        System.out.println("ob1 == ob3" + " " + ob1.equals(ob3));

    }
}
