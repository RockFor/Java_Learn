/**
 * Created by Гость on 16.12.2015.
 */
public class BoxDemo4 {
    public static void main(String args[]) {
        /*Box mybox = new Box();
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        System.out.println("Объем равен: " + mybox.volume());*/
        double x = 1150.0, y = 505.0; // Точка A
        double x1 = 1200, y1 = 510; // Точка B
        double objectSpeed = 1.5357;	// Скорость объекта
        double distance = Math.sqrt(((x1 - x) * (x1 - x)) + ((y1 - y) * (y1 - y))); // Расстояние от точки A до точки B
        int divNum = (int)(distance/objectSpeed); // Количество координат в движении
        double[] motionVector_X = new double[divNum]; // Массив координат X
        double[] motionVector_Y = new double[divNum]; // Массив координат X
        System.out.println(x + " " + y);
        double temp_x = 0,temp_y = 0;
        for (int i = 0; i < divNum; i++) {

            temp_x+= (x1 - x)/divNum;
            temp_y+= (y1 - y)/divNum;
            motionVector_X[i] = temp_x;
            motionVector_Y[i] = temp_y;
        }

        for (int i = 0; i < divNum; i++) {
            System.out.println(motionVector_X[i] + " " + motionVector_Y[i]);
        }
        System.out.println(x1 + " " + y1);

    }
}
