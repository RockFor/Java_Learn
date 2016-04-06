/**
 * Created by √ость on 11.12.2015.
 */
// »спользование break в качестве оператора безуслового перехода goto
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("ѕредшествует оператору break.");
                    if(t) break second;
                    System.out.println("Ётот оператор не будет выполн€тс€!");
                }
                System.out.println("Ётот оператор не будет выполн€тс€!");
            }
            System.out.println("Ётот оператор следует за блоком second!");
        }
    }
}
