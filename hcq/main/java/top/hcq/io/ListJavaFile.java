package top.hcq.io;

import java.io.File;
import java.util.Objects;

/**
 * @program: IntelliJ IDEA
 * @description
 * @author: huangcongqi
 * @create:2021-11-16 18:44
 **/
//目录遍历搜索java文件

public class ListJavaFile {
    public static void main(String[] args) {
        // 创建File对象
        File dir=new File("E:\\JavaStudy");
        // 调用打印目录方法
        printDir(dir);
    }
    public static void printDir(File dir) {
        // 获取子文件和目录
        File[] files=dir.listFiles(pathname-> {
            if (pathname.isDirectory()) {
                return true;
            }
            return pathname.getName().toLowerCase().endsWith("java");
        });
        // 循环打印
        for (File file : Objects.requireNonNull(files)) {
            if (file.isFile()) {System.out.println(file);
            } else {
                // 是目录，继续遍历,形成递归
                printDir(file);
            }
        }
    }
}
