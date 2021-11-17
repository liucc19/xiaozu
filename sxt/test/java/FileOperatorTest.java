import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @program: java-file
 * @description:
 * @author: yzgui
 * @create: 2021-11-16 20:56
 **/
class FileOperatorTest {

    @org.junit.jupiter.api.Test
    void createDir() {
        String path = "C:\\Users\\桐\\Desktop\\file";
        boolean res = FileOperator.createDir(path);
        assertTrue(res);
    }

    @org.junit.jupiter.api.Test
    void createFile() {
        String path = "C:\\Users\\桐\\Desktop\\file\\hello.txt";
        boolean res = false;
        try {
            res = FileOperator.createFile(path);
        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
        assertTrue(res);
    }

    @org.junit.jupiter.api.Test
    void getFileInfo() {
        File file = new File("C:\\Users\\桐\\Desktop\\pic\\001.jpg");
        Properties fileProperties = FileOperator.getFileInfo(file);
        assertEquals(4,fileProperties.size());
    }

    @org.junit.jupiter.api.Test
    void deleteFile() {
        boolean res = FileOperator.deleteFile("C:\\Users\\桐\\Desktop\\pic\\001.jpg");
        assertTrue(res);
    }
}