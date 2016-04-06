package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by ����� on 05.04.2016.
 */
// ��������� ��������� �������

public class TinyEdit {
    public static void main(String[] args) {
        final int MAX_NOTES = 100;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] note = new String[MAX_NOTES];
        System.out.println("������� ������ � ������� Enter");
        System.out.println("���� ������ ��������� ����, ������� '����'");
        try {
            for (int i = 0; i < MAX_NOTES; i++) {
                note[i] = br.readLine();
                if(note[i].equals("����")) break;
            }
            System.out.println("������ � ����� ��������:");
            for (int i = 0; i < MAX_NOTES; i++) {
                if(note[i].equals("����")) break;
                System.out.println(note[i]);

            }
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }
}
