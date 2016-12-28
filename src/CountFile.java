import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Михаил on 28.12.2016.
 */
public class CountFile {
    public static void main(String[] args) throws FileNotFoundException {
        // Ask user for file name;
        Scanner in = new Scanner(System.in);
        System.out.println("Input file name: ");
        String filename = in.nextLine();
        //Open file by scanner with filename;
        File f = new File(filename);
        Scanner sc = new Scanner(f);
        //read the file and count characters, words and lines
        int numOfLines = 0;
        int numOfWords = 0;
        int numOfChar = 0;
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            numOfLines++;
            numOfChar += s.length();
            Scanner strsc = new Scanner(s);
            while (strsc.hasNext()) {
                strsc.next();
                numOfWords++;
            }
        }
        System.out.println("Number of line: " + numOfLines + ", words: " + numOfWords + ", chars: " + numOfChar);
    }
}

