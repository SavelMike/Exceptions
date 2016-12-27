import java.util.Scanner;
import java.io.*;

public class Column {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double d;
        String s;

        System.out.println("enter something");

        if (sc.hasNextDouble()) {
            d = sc.nextDouble();
            System.out.println("you entered double: " + d);
        } else {
            s = sc.next();
            System.out.println("you entered NOT double: " + s);
        }
    }
}