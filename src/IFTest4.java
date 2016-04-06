/**
 * Created by Гость on 26.03.2016.
 */
interface Shower {
    boolean pasport();
    int setAge(int i);
}

class Person implements Shower {
    private int age;
    private boolean pasport;
    Person(boolean pasport, int age) {
        this.pasport = pasport;
        this.age = age;
    }
    public boolean pasport() {
        return pasport;
    }
    public int setAge(int age) {
        this.age = age;
        return age;
    }
}

public class IFTest4 {
    public static void main(String[] args) {
        Shower showInfo = new Person(true,20);
        System.out.println(showInfo.pasport());
        System.out.println(showInfo.setAge(21));
    }
}

