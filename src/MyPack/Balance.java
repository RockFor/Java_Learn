package MyPack;

/**
 * Created by Гость on 02.03.2016.
 */
public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if(bal < 0) {
            System.out.println("--> ");
            System.out.println(name + ": $" + bal);
        }
    }
}
