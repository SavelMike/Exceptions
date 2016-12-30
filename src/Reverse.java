import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Михаил on 29.12.2016.
 */
public class Reverse {
    public static void main(String[] args) throws FileNotFoundException {

        /* 1. взять имя файла  - это args[0] */
        if (args.length == 0) {
            System.out.println("too few args");
            System.exit(1);
        }
        String strFilename = args[0];

        // 2. открыть файл для чтения
        File file = new File(strFilename);
        Scanner scInputText = new Scanner(file);

        // 3. читать файл по строкам
        ArrayList<String> arrList = new ArrayList<>();
        while (scInputText.hasNextLine()) {
            String line = scInputText.nextLine();
            arrList.add(line);
        }
        //  для каждой строки
        //   перевернуть ее и добавить с array_list

        //4. открыть файл для записи
        PrintWriter prwOutput = new PrintWriter(strFilename);

        //5. пройти по всем строкам array list-а и записать в файл
        for (int i = 0; i < arrList.size(); i++) {
            String strOrg = arrList.get(i);
            String strRev = new String();
            for (int j = strOrg.length() - 1; j >= 0; j--) {
                strRev += strOrg.charAt(j);
            }
           // печатать развёрнутую строку
            prwOutput.println(strRev);
            prwOutput.close();
        }
    }
}