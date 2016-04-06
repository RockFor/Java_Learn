/**
 * Created by Гость on 01.03.2016.
 */
abstract class FigureAbstract {
    double dim1,dim2;
    FigureAbstract(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area(); // абстрактный метод, теперь area() является обязательным переопределяемым методом в подклассах
}
class Rectangle1 extends FigureAbstract {
    Rectangle1(double a, double b) {
        super(a,b);
    }
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}

class Triangle1 extends FigureAbstract {
    Triangle1(double a, double b) {
        super(a,b);
    }
    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2/2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {

        FigureAbstract f[] = new FigureAbstract[3];
        f[0] = new Rectangle1(9,5);
        f[1] = new Triangle1(10,8);

        for(FigureAbstract ob: f) {
            System.out.println("Площадь равна " + ob.area());
        }

    }
}
