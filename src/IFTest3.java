/**
 * Created by Гость on 06.03.2016.
 */
import stackInterface.*;

// Версия программы с динамическим поиском нужного метода.

public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(10,"Ds");
        FixedStack fs = new FixedStack(15);
        mystack = ds;
        System.out.println("Dynamic stack push:");
        for (int i = 0; i < 15; i++) {
            mystack.push(i);
        }
        System.out.println("Dynamic stack pop:");
        for (int i = 0; i < 15; i++) {
            System.out.print(mystack.pop() + ", ");
        }
        mystack = fs;
        System.out.println("Static stack push:");
        for (int i = 0; i < 15; i++) {
            mystack.push(i);
        }
        System.out.println("Static stack pop:");
        for (int i = 0; i < 15; i++) {
            System.out.print(mystack.pop() + ", ");
        }
    }

}