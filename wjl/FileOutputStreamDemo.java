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
        // ʹ���ļ����ƴ���������
        FileOutputStream fos= new FileOutputStream("fos.txt");
        // �ַ���ת��Ϊ�ֽ�����
        byte[] b = "asd123".getBytes("utf-8");

        // д���ֽ���������
        fos.write(b);
        // �ر���Դ
        fos.close();
    }
}
