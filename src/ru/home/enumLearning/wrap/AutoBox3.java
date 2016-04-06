package ru.home.enumLearning.wrap;

/**
 * Created by Гость on 28.03.2016.
 */
public class AutoBox3 {
    /*static String getRating(int n) {
        switch(n > 4 && n < 21 ? 1 : 0) {
                case 0: {
                    n %= 10;
                    switch(n == 1 ? 1 : 0) {
                        case 0: {
                            switch(n < 5 && n != 0 ? 1 : 0) {
                                case 0: return "копеек";
                                case 1: return "копейки";
                            }
                        }
                        case 1: {
                            return "копейка";
                        }
                    }
                }
                case 1: {
                    return "копеек";
                }
            default: {
                return "Ошибка";
            }
        }

    }*/
    public static void main(String[] args) {

        /*for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + getRating(i));
        }*/


        Integer iOb, iOb2; // Создание оболочек типов
        Double dOb = 98.6; // Создание и упаковка значения в оболочку типа
        int i;
        iOb = 100;
        System.out.println("Исходное значение iOb " + iOb);
        ++iOb; // Это выражение автоматически распаковывает значение объекта
               // делает приращение, и затем запаковывает обратно.
        System.out.println("После ++iOb " + iOb);
        iOb2 = iOb + (iOb / 3); // Значение распаковывается, вычисляется и упаковывается обратно
        System.out.println("iOb2 после выражения " + iOb2);
        i = iOb + (iOb / 3); // Значение распаковывается, вычисляется но не упаковывается обратно
        System.out.println("i после выражения " + i);
        System.out.println("Смешанное содержимое типов " + (iOb2 + dOb)); // Тут выводится смешанное содержимое
                                                                          // Типы распаковываются складываются и выводятся
        Integer iOb3 = 2;
        switch (iOb3) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
