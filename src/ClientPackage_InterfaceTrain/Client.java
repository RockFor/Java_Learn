package ClientPackage_InterfaceTrain;

import InterfaceTrain.InterfaceCallBack.*;

/**
 * Created by ����� on 03.03.2016.
 */
public class Client implements CallBack {
    // ���������� ������ callback() ���������� CallBack
    public void callback(int num) {
        System.out.println("����� callback() ���������� �� ��������� " + num);
    }
    //
    void nonIfacemeth() {
        System.out.println("� ������� ����������� ����������\n����� ����������� � ������ �����.");
    }
}
