package p1;

/**
 * Created by Гость on 02.03.2016.
 */
class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор класса SamePackage");
        System.out.println("n = " + p.n);                 // Модификатор отсутствует - имеет доступ в пределах текущего пакета
        //System.out.println("n private = " + p.n_pri);   // Имеет доступ в пределах класса Protection
        System.out.println("n protected = " + p.n_pro);   // Имеет доступ за пределами пакета, но только подклассам данного класса
        System.out.println("n public = " + p.n_pub);      // Имеет доступ во всем коде
    }
}
