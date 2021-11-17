package IO;

import java.io.File;

/**
 * @program: java-basic
 * @description: File类的判断方法
 * @author: liuchang
 * @create: 2021-11-16 20:04
 **/
public class FileJudgeMethods {
    public static void main(String[] args) {
        File f = new File("D:\\lc\\aaa\\IoDemo1.java");
        File f2 = new File("D:\\lc\\aaa");
        // 判断是否存在
        System.out.println("D:\\lc\\aaa\\IoDemo1.java 是否存在:"+f.exists());
        System.out.println("D:\\lc\\aaa 是否存在"+f2.exists());
        // 判断是文件还是目录
        System.out.println("D:\\lc\\aaa 是文件?:"+f2.isFile());
        System.out.println("D:\\lc\\aaa 是目录?:"+f2.isDirectory());
    }
}
