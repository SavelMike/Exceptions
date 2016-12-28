import java.io.File;

/**
 * Created by Михаил on 28.12.2016.
 */
public class Find {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Not enough arguments.");
            System.exit(1);
        }

        String word = args[0];
        for (int i = 1; i < args.length; i++ ) {
            System.out.println(args[i]);
        }
        
    }
}
