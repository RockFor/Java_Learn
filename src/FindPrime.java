/**
 * Created by ����� on 10.12.2015.
 */
// �������� �� ����� �������
public class FindPrime  {
    public static void main(String[] args) {
        int num = 11;
        boolean isPrime;
        if(num < 2) isPrime = false;
        else isPrime = true;
        for(int i = 2; i <= num/i; i++) {
            System.out.println("Hello!");
            if((num % i) == 0) {
                isPrime = false;
                break;
            }

        }
        System.out.println((isPrime) ? "�������":"�� �������");
    }
}
