package p2;

/**
 * Created by Гость on 02.03.2016.
 */
public class Protection2 extends p1.Protection {
    public Protection2() {
        System.out.println("Конструктор подкласса Protection2 суперкласса p1.Protection");
        //System.out.println("n = " + n);                 // Модификатор отсутствует - имеет доступ в пределах текущего пакета p1
        //System.out.println("n private = " + n_pri);   // Имеет доступ в пределах класса Protection
        System.out.println("n protected = " + n_pro);   // Имеет доступ за пределами пакета, но только подклассам данного класса
        System.out.println("n public = " + n_pub);      // Имеет доступ во всем коде
    }
}

class OtherPackage {
    OtherPackage() {
       Protection2 p = new Protection2();
        System.out.println("Конструктор класса OtherPackage");
        //System.out.println("n = " + p.n);                 // Модификатор отсутствует - имеет доступ в пределах текущего пакета p1
        //System.out.println("n private = " + n_pri);   // Имеет доступ в пределах класса Protection
        //System.out.println("n protected = " + p.n_pro);   // Имеет доступ за пределами пакета, но только подклассам данного класса
        System.out.println("n public = " + p.n_pub);      // Имеет доступ во всем коде
    }
}