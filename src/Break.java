/**
 * Created by ����� on 11.12.2015.
 */
// ������������� break � �������� ��������� ����������� �������� goto
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("������������ ��������� break.");
                    if(t) break second;
                    System.out.println("���� �������� �� ����� ����������!");
                }
                System.out.println("���� �������� �� ����� ����������!");
            }
            System.out.println("���� �������� ������� �� ������ second!");
        }
    }
}
