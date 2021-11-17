package IO;

import java.io.File;

/**
 * @program: java-basic
 * @description: 绝对路径和相对路径
 * @author: liuchang
 * @create: 2021-11-16 19:59
 **/
public class FilePath {
    public static void main(String[] args) {
        File f = new File("D:\\FileDemo\\hello.txt");
        System.out.println(f.getAbsolutePath());

        File f2 = new File("IoDemo1.java");
        System.out.println(f2.getAbsolutePath());
    }
}
