import java.io.File;
import java.util.Objects;

/**
 * @program: java-file
 * @description:
 * @author: yzgui
 * @create: 2021-11-16 21:05
 **/
public class ListFile {
    public static void main(String[] args) {
        File dir = new File("D:\\Code\\JavaStudy");
        //获取当前目录下的文件以及文件夹对象，通过文件对象可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file);
        }
    }
}
