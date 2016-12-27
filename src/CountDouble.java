import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Михаил on 27.12.2016.
 */
public class CountDouble {
    public static void main(String[] args) throws FileNotFoundException {
        //1 получить имя файла от пользователя при помощи консольного сканера и его метода next().
        Scanner in = new Scanner(System.in);
        System.out.println("Input filename: ");
        String filename = in.next();
        //// 2 открыть файл для чтения при помощи сканера связаного с файлом по имени filename
        File f = new File(filename);
        //3// 3 получать из сканера созданного в пункте double-ы пока они есть и складывать
        Scanner sc = new Scanner(f);
        double sum1 = 0;
        double sum2 = 0;
        int counter = 0;
        int n1 = 0;
        int n2 = 0;
        while(sc.hasNextDouble()) {
            if ((counter % 2) == 0) {
                sum1 += sc.nextDouble();
                n1++;
            } else {
                sum2 += sc.nextDouble();
                n2++;
            }
            counter++;
        }
        System.out.println("Sum1 = " + sum1 + ", Sum2 = " + sum2);
    }
}
