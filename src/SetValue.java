import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by Михаил on 30.12.2016.
 */
public class SetValue {

    // arguments: none
// return value: boolean
// description: let user enter double value twice.
// If user entered double - set variable D and return true
// if user did not enter double in two tries - return false
// catch wrong input with exception (InputMismatchException)

    public static double user_gave_double() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            try {
                System.out.print("Input data: ");
                return sc.nextDouble();
            } catch (InputMismatchException exception) {
                sc.next();
            }
        }
        throw new NumberFormatException("");
    }

    public static void main(String[] args) {
        double sum = 0;
        while (true) {
            try {
                sum += user_gave_double();
            }
            catch(NumberFormatException ex)
            {
                System.out.println(sum);
                break;
            }
        }
    }
}


