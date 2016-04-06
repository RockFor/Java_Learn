package kitty;

/**
 * Created by Гость on 03.04.2016.
 */

/*Есть условие: посмотреть, какой у кошек вес, попробовать их покормить и посмотреть, что будет с весом,
попробовать перекормить кошку, чтобы она взорвалась, "замяукать" кошку до смерти.*/
import java.util.Random;

interface CatInf {
    void feedCat(float portion); // Покормить кошку
    void meowCat(); // Заставить кошку мяукать
    float getCatWeight(); // Узнать вес кошки
    boolean isCatAlive();
    void getAllInfoAboutCat(); // Вся информация о кошке
}

class Cat implements CatInf {
    Random random = new Random();
    private String nameOfCat; // Имя кошки
    private int ageOfCat; // Возраст кошки
    private float weightOfCat; // Вес кошки
    private boolean wantToEat; // Хочет ли кошка есть
    private boolean catIsAlive = true;
    private final float MAX_WEIGHT_FOR_CAT; // Максимально возможный вес кошки
    private int countOfMeow; // Количество "мяуканий" для кошки
    private final int MAX_MEOW_FOR_CAT; // Максимальное количество "мяуканий" для кошки

    Cat(String nameOfCat) { // Создаем кошку
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
            System.out.println("Кошки " + nameOfCat + " нет в живых!");
            return 0;
        }
        return weightOfCat;
    }

    @Override
    public void feedCat(float portion) {
        if(!catIsAlive) {
            System.out.println("Кошки " + nameOfCat + " нет в живых!");
            return;
        }
        if(wantToEat) {
            weightOfCat+=portion/10;
            System.out.println("Кошка " + nameOfCat + " благодарна вам!");
            System.out.println("Новый вес кошки " + weightOfCat);
        }
        else {
            System.out.println("Кошка " + nameOfCat + " не хочет есть, но ест\nбудьте осторожно она может взорваться");
            System.out.println("Новый вес кошки " + weightOfCat);
            weightOfCat+=portion/10;
            if(weightOfCat > MAX_WEIGHT_FOR_CAT) {
                System.out.println("Вы перекормили кошку " + nameOfCat + " она взорвалась!");
                catIsAlive = false;
            }
        }
    }

    @Override
    public void meowCat() {
        if(!catIsAlive) {
            System.out.println("Кошки " + nameOfCat + " нет в живых!");
            return;
        }
        if(countOfMeow++ < MAX_WEIGHT_FOR_CAT) {
            System.out.println(nameOfCat + ": мяу");
        }
        else {
            System.out.println("Вы замяуками кошку " + nameOfCat + " до смерти!");
            catIsAlive = false;
        }

    }

    @Override
    public void getAllInfoAboutCat() {
        if(!catIsAlive) {
            System.out.println("Кошки " + nameOfCat + " нет в живых!");
            return;
        }
        System.out.println("Информация о кошке " + nameOfCat);
        System.out.println("Вес " + weightOfCat + " кг");
        System.out.println("Макс вес " + MAX_WEIGHT_FOR_CAT + " кг");
        System.out.println("Всего мяуканий " + countOfMeow);
        System.out.println("Макс мяуканий " + MAX_MEOW_FOR_CAT);
        System.out.println("Хочет есть " + (wantToEat ? "Да\n" : "Нет\n"));
    }

    @Override
    public boolean isCatAlive() {
        return catIsAlive;
    }
}

public class CatLife {
    public static void main(String[] args) {
        CatInf Vaska = new Cat("Васька");
        Vaska.getAllInfoAboutCat();
        while(Vaska.isCatAlive()) {
            Vaska.feedCat(10);
            Vaska.meowCat();
        }
        
    }
}
