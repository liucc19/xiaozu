package com.soft21.java.ioex;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program:
 * @description:
 * @author: weijinlong
 * @create: 2021-11-16 19:46
 **/
public class ReadByArray {
    public static void main(String[] args) throws IOException {
        // ʹ���ļ����ƴ���������
        FileInputStream fis =  new FileInputStream("b.txt");
       //�����������Ϊ��Ч����
        int len;
        // �����ֽ����飬��Ϊװ�ֽ����ݵ�����
        byte[] b = new byte[2];
        // ѭ����ȡ
        while ((len = fis.read(b)) !=-1) {
        // ÿ�ζ�ȡ��,���������Ч�ֽڲ��֣�����ַ�����ӡ
        // len ÿ�ζ�ȡ����Ч�ֽڸ���
            System.out.println(new String(b , 0 ,len));
        }
        fis.close();
    }
}
