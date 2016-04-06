/**
 * Created by Гость on 06.03.2016.
 */
import package_NestedIfDemo.A;
import package_NestedIfDemo.B;

class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.IsNotNegative(10)) System.out.println("The number is not negative");
        else System.out.println("The number is negative");

    }
}