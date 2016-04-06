package kitty;

/**
 * Created by ����� on 03.04.2016.
 */

/*���� �������: ����������, ����� � ����� ���, ����������� �� ��������� � ����������, ��� ����� � �����,
����������� ����������� �����, ����� ��� ����������, "���������" ����� �� ������.*/
import java.util.Random;

interface CatInf {
    void feedCat(float portion); // ��������� �����
    void meowCat(); // ��������� ����� �������
    float getCatWeight(); // ������ ��� �����
    boolean isCatAlive();
    void getAllInfoAboutCat(); // ��� ���������� � �����
}

class Cat implements CatInf {
    Random random = new Random();
    private String nameOfCat; // ��� �����
    private int ageOfCat; // ������� �����
    private float weightOfCat; // ��� �����
    private boolean wantToEat; // ����� �� ����� ����
    private boolean catIsAlive = true;
    private final float MAX_WEIGHT_FOR_CAT; // ����������� ��������� ��� �����
    private int countOfMeow; // ���������� "��������" ��� �����
    private final int MAX_MEOW_FOR_CAT; // ������������ ���������� "��������" ��� �����

    Cat(String nameOfCat) { // ������� �����
        this.nameOfCat = nameOfCat;
        countOfMeow = 0;
        MAX_MEOW_FOR_CAT = (int) (random.nextDouble() * 100);
        weightOfCat = random.nextFloat() * 10;
        MAX_WEIGHT_FOR_CAT = weightOfCat * 2;
        wantToEat = random.nextBoolean();
    }

    @Override
    public float getCatWeight() {
        if(!catIsAlive) {
            System.out.println("����� " + nameOfCat + " ��� � �����!");
            return 0;
        }
        return weightOfCat;
    }

    @Override
    public void feedCat(float portion) {
        if(!catIsAlive) {
            System.out.println("����� " + nameOfCat + " ��� � �����!");
            return;
        }
        if(wantToEat) {
            weightOfCat+=portion/10;
            System.out.println("����� " + nameOfCat + " ���������� ���!");
            System.out.println("����� ��� ����� " + weightOfCat);
        }
        else {
            System.out.println("����� " + nameOfCat + " �� ����� ����, �� ���\n������ ��������� ��� ����� ����������");
            System.out.println("����� ��� ����� " + weightOfCat);
            weightOfCat+=portion/10;
            if(weightOfCat > MAX_WEIGHT_FOR_CAT) {
                System.out.println("�� ����������� ����� " + nameOfCat + " ��� ����������!");
                catIsAlive = false;
            }
        }
    }

    @Override
    public void meowCat() {
        if(!catIsAlive) {
            System.out.println("����� " + nameOfCat + " ��� � �����!");
            return;
        }
        if(countOfMeow++ < MAX_WEIGHT_FOR_CAT) {
            System.out.println(nameOfCat + ": ���");
        }
        else {
            System.out.println("�� ��������� ����� " + nameOfCat + " �� ������!");
            catIsAlive = false;
        }

    }

    @Override
    public void getAllInfoAboutCat() {
        if(!catIsAlive) {
            System.out.println("����� " + nameOfCat + " ��� � �����!");
            return;
        }
        System.out.println("���������� � ����� " + nameOfCat);
        System.out.println("��� " + weightOfCat + " ��");
        System.out.println("���� ��� " + MAX_WEIGHT_FOR_CAT + " ��");
        System.out.println("����� �������� " + countOfMeow);
        System.out.println("���� �������� " + MAX_MEOW_FOR_CAT);
        System.out.println("����� ���� " + (wantToEat ? "��\n" : "���\n"));
    }

    @Override
    public boolean isCatAlive() {
        return catIsAlive;
    }
}

public class CatLife {
    public static void main(String[] args) {
        CatInf Vaska = new Cat("������");
        Vaska.getAllInfoAboutCat();
        while(Vaska.isCatAlive()) {
            Vaska.feedCat(10);
            Vaska.meowCat();
        }
        
    }
}
