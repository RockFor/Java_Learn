package chapter13;

/**
 * Created by ����� on 05.04.2016.
 */

// ���� � ����������

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException
    {
        char c; // ���������� ����������
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ������ ������ BufferedReader � ����������� �������� ������� ������ ������������ ������ Reader
        // ����������� �������� InputStreamReader ��������� � �������� ��������� ������ ��������� ������
        // InputStream - System.in
        System.out.println("������� �������, 'q' - ��� ������");
        do {
            c =  (char)br.read();
            System.out.println("��������� ������ " + c);
        } while (c != 'q');

    }
}
