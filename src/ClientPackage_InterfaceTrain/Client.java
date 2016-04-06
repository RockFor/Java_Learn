package ClientPackage_InterfaceTrain;

import InterfaceTrain.InterfaceCallBack.*;

/**
 * Created by Гость on 03.03.2016.
 */
public class Client implements CallBack {
    // Реализация метода callback() интерфейса CallBack
    public void callback(int num) {
        System.out.println("Метод callback() вызываемый со значением " + num);
    }
    //
    void nonIfacemeth() {
        System.out.println("В классах реализующих интерфейсы\nмогут определятся и другие члены.");
    }
}
