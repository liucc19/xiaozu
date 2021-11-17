import java.io.File;
import java.io.IOException;

/**
 * @program: java-file
 * @description:
 * @author: yzgui
 * @create: 2021-11-16 20:53
 **/
public class FileCreateDelete {
    public static void main(String[] args) throws IOException {
        //文件的创建
        File file1 = new File("a.txt");
        System.out.println("是否存在：" + file1.exists());
        System.out.println("是否创建：" + file1.createNewFile());
        System.out.println("是否存在：" + file1.exists());

        //目录的创建
        File file2 = new File("newDir");
        System.out.println("是否存在：" + file2.exists());
        System.out.println("是否创建：" + file2.mkdirs());
        System.out.println("是否存在：" + file2.exists());

        //文件的删除
        System.out.println(file1.delete());

        //目录的删除
        System.out.println(file2.delete());
    }
}
