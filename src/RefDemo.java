/**
 * Created by ����� on 04.02.2016.
 */
// ��������� ���������� ����������� ����� ��������� �� ������ ���������
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box10 plainbox;
        System.out.println("����� weightbox ����� " + weightbox.volume());
        System.out.println("��� weightbox ����� " + weightbox.weight + '\n');
        plainbox = weightbox;
        System.out.println("����� plainbox ����� " + plainbox.volume());
    }
}
