import java.io.File;
import java.util.Objects;

/**
 * @program: java-file
 * @description:
 * @author: yzgui
 * @create: 2021-11-16 21:11
 **/
public class JavaFileFilter {
    public static void main(String[] args) {
        File dir = new File("D:\\Code\\JavaStudy\\java-file\\src\\main\\java");
        File[] files = dir.listFiles(file ->{
            //判断如果获取到的目录，直接放行
            if (file.isDirectory()) {
                return true;
            }
            //获取路径中的文件名，判断是否java结尾，是就返回true
            return file.getName().toLowerCase().endsWith("java");
        });
        //遍历files数组
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file);
        }
    }
}
