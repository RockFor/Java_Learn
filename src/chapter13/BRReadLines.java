package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ����� on 05.04.2016.
 */
// ������ ��������� ������������� ���������� ���� � �������������� ������ readLines() ��������� BufferReader ������ Reader

public class BRReadLines {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // ������ ������ BufferedReader � ����������� �������� ������� ������ ������������ ������ Reader
        // ����������� �������� InputStreamReader ��������� � �������� ��������� ������ ��������� ������
        // InputStream - System.in
        String s; // ������
        try {
            do {
                s = bf.readLine();
                System.out.println(s);
            } while (!s.equals("����"));
        } catch (IOException exc) {
            System.out.println(exc);
        }

    }
}
