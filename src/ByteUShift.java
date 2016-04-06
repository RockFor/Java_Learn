/**
 * Created by Гость on 27.11.2015.
 */
// Сдвиг без учета знака значения типа byte
public class ByteUShift {
    public static  void main(String args[]) {
        char hex[] = {
                '0','1','2','3','4','5','6','7',
                '8','9','a','b','c','d','e','f'
        };
        byte b = (byte) 0xf1; // -15
        byte c = (byte) (b >> 4); // сдвиг с учетом знака
        byte d = (byte) (b >>> 4); // сдвиг без учета знака
        byte e = (byte) ((b & 0xff) >> 4);
        System.out.println(" b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println(" b >> 4 = 0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println(" b >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println(" (b & 0xff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);


    }
}
