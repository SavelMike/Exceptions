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
        Scanner sc = new Scanner(f);
        //read the file and wordlist
        int numOfWords = 0;
        int numOfMatches = 0;
        while (sc.hasNextLine()) {
            // Ask user for file name
            String next = sc.nextLine();
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Input next file name: ");
            String newFile = scanner1.next();
            File wordList = new File(newFile);
            Scanner scanner2 = new Scanner(wordList);
            while (scanner2.hasNext()) {
                if (word.equals(scanner2.next())) {

                }
            }

        }
    }
}
