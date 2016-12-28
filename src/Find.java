import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Михаил on 28.12.2016.
 */
public class Find {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length < 2) {
            System.out.println("Not enough arguments.");
            System.exit(1);
        }

        String word = args[0];
        for (int i = 1; i < args.length; i++ ) {
            System.out.println(args[i]);
            File input = new File(args[i]);
            Scanner in = new Scanner(input);
            while (in.hasNextLine()) {
                String next = in.nextLine();
                if (next.contains(word)) {
                    System.out.println(input + ": " + next);
                }
            }
        }
    }
}
