/**
 * Created by Гость on 11.12.2015.
 */
// Вложенный цикл for
public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        // Array
        int nums[][] = new int[3][5];

        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (i+1)*(j+1);
            }
        }

        for(int x[]: nums) {
            for(int y: x) {
                System.out.print(y + " ");
                sum += y;
            }
            System.out.println();
        }
        System.out.println("Сумма: " + sum);
    }
}
