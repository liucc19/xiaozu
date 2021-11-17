package com.soft21.java.ioex;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program:
 * @description:
 * @author: weijinlong
 * @create: 2021-11-17 09:27
 **/
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos= new FileOutputStream("fos.txt");
        // 字符串转换为字节数组
        byte[] b = "asd123".getBytes("utf-8");

        // 写出字节数组数据
        fos.write(b);
        // 关闭资源
        fos.close();
    }
}
