package com.soft21.java.ioex;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program:
 * @description:
 * @author: weijinlong
 * @create: 2021-11-16 18:59
 **/
public class ReadByte {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis = new FileInputStream("read.txt");
        //定义变量，保存数据
        // 读取数据，返回一个字节
        int read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println((char) read);


        fis.close();
    }
}
