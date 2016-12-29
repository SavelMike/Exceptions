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
        //Open file by scanner with filename;
        File f = new File(filename);
        Scanner textToCheck = new Scanner(f);
        Scanner dictionary = new Scanner(System.in);
        System.out.println("Input name of next file: ");
        String newFile = dictionary.next();
        //read the file and wordlist
        int numOfWords = 0;
        int numOfMatches = 0;
        while (textToCheck.hasNextLine()) {
            // Ask user for file name
            String next = textToCheck.nextLine();
            File wordList = new File(newFile);
            Scanner wordlist = new Scanner(wordList);
            while (wordlist.hasNext()) {
                if (word.equals(wordlist.next())) {

                }
            }

        }
    }
}
