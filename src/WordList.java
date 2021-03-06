import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Михаил on 29.12.2016.
 */
public class WordList {
    public static void main(String[] args) throws FileNotFoundException {

        // Ask user for file name;
        Scanner in = new Scanner(System.in);
        System.out.println("Input file name: ");
        String filename = in.next();

        //Create scanner for text;
        File f = new File(filename);
        Scanner textToCheck = new Scanner(f);

        //Get name of dictionary
        System.out.println("Input name of dictionary: ");
        String dictName = in.next();

        //read the file and check word with dictionary
        while (textToCheck.hasNext()) {
            String next = textToCheck.next();
            File wordList = new File(dictName);
            Scanner dictionary = new Scanner(wordList);
            boolean found = false;
            while (dictionary.hasNext()) {
                if (next.equals(dictionary.next())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(next);
            }
        }
    }
}
