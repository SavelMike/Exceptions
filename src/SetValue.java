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
                sc.next();
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

import java.util.InputMismatchException;
        import java.util.Scanner;

/**
 * Created by Михаил on 22.12.2016.
 */
    public class SetNum {
        public double inputNum() throws InputMismatchException {
            System.out.println("Enter the next value: ");
            Scanner sc = new Scanner(System.in);
            double num = sc.nextDouble();
            return num;
        }
        public static void main(String[] args) {
            double[] arr = new double[5];
            int counter = 0;
            int chance = 0;
            try {
                while (counter < arr.length) {
                    new SetNum().inputNum();
                    Scanner sc = new Scanner(System.in);
                    counter++;
                }
            for (double arrs:arr){
                System.out.println(arrs);
            }
        } catch (InputMismatchException ime) {
            System.out.println("I am giving you one more chance");
            try {
                String[] str = {};
                main(str);
                new SetNum().inputNum();
            } catch (InputMismatchException ime2) {
                System.out.println("Now you loose");
            }
        }
    }
}

