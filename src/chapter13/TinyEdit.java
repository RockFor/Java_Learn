package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Гость on 05.04.2016.
 */
// Крошечный текстовый блокнот

public class TinyEdit {
    public static void main(String[] args) {
        final int MAX_NOTES = 100;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] note = new String[MAX_NOTES];
        System.out.println("Введите строку и нажмите Enter");
        System.out.println("Если хотите завершить ввод, введите 'стоп'");
        try {
            for (int i = 0; i < MAX_NOTES; i++) {
                note[i] = br.readLine();
                if(note[i].equals("стоп")) break;
            }
            System.out.println("ДАННЫЕ В ВАШЕМ БЛОКНОТЕ:");
            for (int i = 0; i < MAX_NOTES; i++) {
                if(note[i].equals("стоп")) break;
                System.out.println(note[i]);

            }
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }
}
