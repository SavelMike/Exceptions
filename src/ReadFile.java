import java.io.*;
import java.util.Scanner;

/**
 * Created by Михаил on 26.12.2016.
 */
public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        /*Open a file with the name hello.txt.*/
        PrintWriter out = new PrintWriter("hello.txt");
        /*Store the message “Hello, World!” in the file.*/
        out.println("Hello, World!");
        //Close the file.
        out.close();
        /*Open the same file again.*/
        File inputFile = new File("hello.txt");
        //Read the message into a string variable and print it.
        Scanner sc = new Scanner(inputFile);
        while (sc.hasNextLine()) {
            String text = sc.nextLine();
            System.out.println(text);
        }
        sc.close();
    }
}