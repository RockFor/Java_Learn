package package_NestedIfDemo;

/**
 * Created by Гость on 06.03.2016.
 */
public class B implements A.NestedIF {
    public boolean IsNotNegative(int x) {
        return x > 0 ? true : false;
    }
}