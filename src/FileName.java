import java.io.FileNotFoundException;
import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Михаил on 26.12.2016.
 */
public class FileName {
    public static void main(String[] args) throws FileNotFoundException {

        // 1.ask user for input file name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inputfile name: ");
        String filename1 = sc.next();

        // 2. ask user for output file name
        System.out.println("Enter outputfile name: ");
        String filename2 = sc.next();

        // 3. open input file (Scanner)
        File input = new File(filename1);
        Scanner in = new Scanner(input);

        // 4. open output file (Printwriter)
        PrintWriter output = new PrintWriter(filename2);
        // 5. set variable strNum to 1
        int strNum = 1;

        //6. Read each line and send it to the output file, preceded by line numbers //
        while (sc.hasNextLine()) {
            String next = sc.nextLine();
            output.println("/ " + strNum + " /" + next);
            strNum++;
        }
    }
}
