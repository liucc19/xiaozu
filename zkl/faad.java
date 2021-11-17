package com.liu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class faad {
    public static void main(String[] args) throws IOException {
          // 1.创建流对象
          // 1 指定数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\打卡\\10月22.png");
          // 1.2 指定目的地
        FileOutputStream fos = new FileOutputStream("10月22_copy.png");
        // 2.读写数据
        // 2.1 定义数组
        byte[] b=new byte[1024];
        // 2.2 定义⻓度
        int len;
        // 2.3 循环读取
        while (( len = fis.read(b))!=-1) {
            // 2.4 写出数据
            fos.write(b, 0 , len);     }
        // 3.关闭资源
        fos.close();
        fis.close();
    }
        }




