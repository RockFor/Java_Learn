/**
 * Created by ֳמסעü on 16.12.2015.
 */
class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        System.out.println("־בתול נאגום: " + mybox.width * mybox.height * mybox.depth);
    }
}
