/**
 * Created by ����� on 11.12.2015.
 */
// ������������� ��������� continue � ������
public class ContinueLabel {
    public static void main(String[] args) {
        outer:for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i < j) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
    }
}
