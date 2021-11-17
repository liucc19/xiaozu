package com.liu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class jichu {
    public static void main(String[] args) throws IOException {
        // 记录开始时间
        long start = System.currentTimeMillis();
        // 创建流对象
        FileInputStream fis = new FileInputStream("zkl.txt");
        FileOutputStream fos = new FileOutputStream("copy.txt");
        // 读写数据
        int b = 0;while ((b = fis.read()) !=-1)  {
            fos.write(b);    }
        // 记录结束时间
        long end= System.currentTimeMillis();
        System.out.println("普通流复制时间:"+(end-start)+" 毫秒");}
    }


