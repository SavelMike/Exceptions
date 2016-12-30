import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by Михаил on 30.12.2016.
 */
public class SetValue {
    public static double D;

    public static boolean user_gave_double() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            try {
                System.out.print("Input data: ");
                D = sc.nextDouble();
                return true;
            } catch (InputMismatchException exception) {

            }
        }
        return false;
    }

    public static void main(String[] args) {
        double sum = 0;
        while (user_gave_double()) {
            sum += D;
        }
        System.out.println(sum);
    }
}
