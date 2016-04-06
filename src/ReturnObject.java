/**
 * Created by Гость on 21.01.2016.
 */
// Возвращение объекта

class Test1 {
    int a;
    Test1(int init) {
        a = init;
    }
    Test1 incrByTen() {
        Test1 temp = new Test1(a + 10);
        return temp;
    }
}
public class ReturnObject {
    public static void main(String[] args) {
        Test1 ob1 = new Test1(2);
        Test1 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);
    }
}
