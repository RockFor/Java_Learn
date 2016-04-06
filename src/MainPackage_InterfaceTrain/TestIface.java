package MainPackage_InterfaceTrain;

/**
 * Created by Гость on 05.03.2016.
 */
import ClientPackage_InterfaceTrain.Client;
import InterfaceTrain.InterfaceCallBack.CallBack;

class TestIface {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(42);
    }
}
