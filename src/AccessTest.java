/**
 * Created by Гость on 21.01.2016.
 */
// Использование модификаторов доступа public и private
class Test2 {
    int a; // Доступ определен по умолчанию т.е. public
    public int b; // Отрытый доступ
    private int c; // Закрытый доступ

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
