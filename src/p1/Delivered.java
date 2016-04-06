package p1;

/**
 * Created by Гость on 02.03.2016.
 */
class Delivered extends Protection {
    Delivered() {
        System.out.println("Конструктор подкласса Delivered суперкласса Protection");
        System.out.println("n = " + n);                 // Модификатор отсутствует - имеет доступ в пределах текущего пакета
        //System.out.println("n private = " + n_pri);   // Имеет доступ в пределах класса Protection
        System.out.println("n protected = " + n_pro);   // Имеет доступ за пределами пакета, но только подклассам данного класса
        System.out.println("n public = " + n_pub);      // Имеет доступ во всем коде
    }
}
