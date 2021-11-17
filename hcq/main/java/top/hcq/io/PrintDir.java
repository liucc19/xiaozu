package top.hcq.io;

import java.io.File;
import java.util.Objects;

/**
 * @program: IntelliJ IDEA
 * @description
 * @author: huangcongqi
 * @create:2021-11-16 18:38
 **/
//遍历 E:\\JavaStudy 目录下的所有文件和所有的子目录。
//目录遍历，无法判断多少级目录，所以在遍历需要进行判断，如果遍历到的还是目录，就要使用递归，遍历所有目录。

public class PrintDir {
    public static void main(String[] args) {
        // 创建File对象
        File dir=new File("E:\\JavaStudy");
        // 调用打印目录方法
        printDir(dir);
    }
    public static void printDir(File dir) {
        System.out.println(dir);
        // 获取子文件和目录
        File[] files=dir.listFiles();
        // 循环打印
        for (File file : Objects.requireNonNull(files)) {
            //判断是文件，直接输出
            if (file.isFile()) {
                System.out.println(file);
        } else {
            // 是目录，继续遍历,形成递归
            printDir(file);
        }
    }
}
}



