//работу выполнил Пастухов Матвей г.Нижний Новгород
package src.ru.ibs.progect.homerwork2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
   public static void main(String[] string) throws FileNotFoundException {
       System.out.println(" Enter file path");
       Scanner scannerPath = new Scanner(System.in);
       String path=scannerPath.nextLine();


       StringUtils firstFile=new StringUtils();
       //"test.txt"
       File file2=new File(path);
       System.out.print(firstFile.getFileInfo(file2));

    }
}
