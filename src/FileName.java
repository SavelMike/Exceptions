import java.io.FileNotFoundException;
import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Михаил on 26.12.2016.
 */
public class FileName {
    public static void main(String[] args) throws FileNotFoundException {

        String filename1 = "";
        String filename2 = "";
        if (args.length == 0) {
            // 1.ask user for input file name
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter inputfile name: ");
            filename1 = sc.next();
            // 2. ask user for output file name
            System.out.println("Enter outputfile name: ");
            filename2 = sc.next();
        }

        if (args.length == 2) {
            filename1 = args[0];
            filename2 = args[1];
        }

        if (args.length != 0 && args.length != 2) {
            System.out.println("user error");
            System.exit(1);
        }

        // 3. open input file (Scanner)
        File input = new File(filename1);
        Scanner in = new Scanner(input);

        // 4. open output file (Printwriter)
        PrintWriter output = new PrintWriter(filename2);
        // 5. set variable strNum to 1
        int strNum = 1;

        //6. Read each line and send it to the output file, preceded by line numbers //
        while (in.hasNextLine()) {
            String next = in.nextLine();
            output.println("/* " + strNum + " */ " + next);
            strNum++;
        }
        // 7. close Scanner and PrintWrite
        in.close();
        output.close();
    }
}
