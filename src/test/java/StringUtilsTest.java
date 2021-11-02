import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import src.ru.ibs.progect.homerwork2.StringUtils;

import java.io.File;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {
    private StringUtils stringUtils;
    @BeforeEach
    void init(){
        stringUtils=new StringUtils();

    }
    @Test
    public void testGetFileInfoOutMok(){
        try{
            File file2=new File("test.txt");
        assertEquals("1 Buzz 7 ",
                stringUtils.getFileInfo(file2),
                "метод сработал не правильно");}
        catch (Exception exception){
            System.out.println("ошибка : "+exception);
        }


    }
    @Test
    public void testFileValid(){
        try {
            File file2=new File("test.txt");
            assertEquals(
                    "1 10 7 ",
                    stringUtils.validFile(file2),
                    "Файл не соответствует заданию"
            );
        }catch(Exception exception){
            System.out.println("ошибка : "+exception);
        }

    }
//    @Test
//    public void testGetFileInfo(){
//        final File mockedFile= Mockito.mock(File.class);
//        Mockito.when(mockedFile.).thenReturn("1 Buzz 7");
//
//try {
//    assertEquals(
//            "1 Buzz 7 ",
//            stringUtils.getFileInfo(mockedFile)
//
//    );
//}catch (Exception exception){
//    System.out.println("ошибка : "+exception);
//}
//
//    }
}
