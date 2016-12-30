import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


/**
 * Created by Михаил on 30.12.2016.
 */
public class ReversedFile {
    public static void main(String[] args) throws FileNotFoundException {

        // 1) Проверить аргументы программы;
        if (args.length < 2) {
            System.out.println("too few args");
            System.exit(1);
        }
        String strFilenameInp = args[0];
        String strFilenameOup = args[1];

        // 2) открыть файл для чтения
        File file = new File(strFilenameInp);
        Scanner scInputText = new Scanner(file);

        // 3) читать файл по строкам и записывать в ArrayList
        ArrayList<String> arrList = new ArrayList<>();
        while (scInputText.hasNextLine()) {
            String line = scInputText.nextLine();
            arrList.add(line);
        }

        // 4) Открыть новый файл для записи;
        PrintWriter prwOutput = new PrintWriter(strFilenameOup);

        // 5) Записывать строки с arrayList начиная с последней
        for (int i = args.length ; i >= 0; i--) {
            String strLine = arrList.get(i);
            prwOutput.println(strLine);
        }
        prwOutput.close();
    }
}
