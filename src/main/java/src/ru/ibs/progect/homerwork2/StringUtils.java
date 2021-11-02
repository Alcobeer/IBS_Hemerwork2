package src.ru.ibs.progect.homerwork2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StringUtils {

    public String getFileInfo(File b) throws FileNotFoundException {
        String vozvrat=new String();
        File file = new File(b.getAbsolutePath());
        Scanner scanner1= new Scanner(file);
        int count=0;
        Scanner scanner= new Scanner(file);
        String line = new String();
        while (scanner1.hasNextLine()){
            count++;
            scanner1.nextLine();
             line +=scanner.nextLine()+" ";
        }

        String[] numString=line.split(" ");

        int[] num=new int[count];
        int cou=0;
        for (String number : numString){
            num[cou]=Integer.parseInt(number);
            if (num[cou]%5==0&&num[cou]%3==0)
                vozvrat +="FizzBuzz ";
            else if (num[cou]%5==0)
                vozvrat +="Buzz ";

            else if (num[cou]%3==0)
                vozvrat +="Fizz ";
            else
            vozvrat +=num[cou]+" ";

            cou++;
        }

        scanner1.close();
        scanner.close();
        return vozvrat;
    }
     public  String validFile (File b) throws FileNotFoundException {
        String vozvrat= new String();
        File file = new File(b.getAbsolutePath());
         int count=0;
         Scanner scanner= new Scanner(file);
         String line = new String();
         while (scanner.hasNextLine()){
             line +=scanner.nextLine()+" ";
         }

         scanner.close();
        return line;
    }
}
