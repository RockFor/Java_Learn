/**
 * Created by ����� on 21.01.2016.
 */
// ������������� ������������� ������� public � private
class Test2 {
    int a; // ������ ��������� �� ��������� �.�. public
    public int b; // ������� ������
    private int c; // �������� ������

    void setc(int i) {
        c = i;
    }
    int getc() {
        return c;
    }
}
class AccessTest {
    public static void main(String[] args) {
        Test2 ob = new Test2();
        ob.a = 10;
        ob.b = 20;

        //ob.c = 30;
        ob.setc(30);
        System.out.println("ob.a: " + ob.a);
        System.out.println("ob.b: " + ob.b);
        System.out.println("ob.c: " + ob.getc());
    }





}
