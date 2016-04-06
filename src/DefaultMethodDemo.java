/**
 * Created by Гость on 06.03.2016.
 */
// Java 8 реализация в интерфейсах методов по умолчанию
interface MyIF {
    int getNumber(); // Обычный метод без тела, который необходимо реализовать в классе
    default String getString() { // Метод по умолчанию с телом, его необязательно реализовывать в классе
        return "Объект типа String по умолчанию!";
    }
    static int getDefaultNumber() { // Статический метод
        return 0;
    }
}

class MyIFImp implements MyIF {
    public int getNumber() {
        return 100;
    }
    public String getString() {
        return "Объект типа String!";
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}
