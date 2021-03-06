package ru.home.enumLearning.meta;

/**
 * Created by ����� on 31.03.2016.
 */
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

public class Meta {
    // ������������ �����
    @MyAnno(str = "������ ���������",val = 100)
    public static void myMeth() {
        Meta ob = new Meta();
        // �������� ��������� �� ������ � ���������� �������� ������
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());

        } catch(NoSuchMethodException exc) {
            System.out.println("����� �� ������!");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
