/**
 * Created by Гость on 08.02.2016.
 */
class A1 {
    int i;
}
class B1 extends A1 {
    int i;
    B1(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("super.i " + super.i);
        System.out.println("i       " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B1 ob = new B1(2,3);
        ob.show();
    }
}
