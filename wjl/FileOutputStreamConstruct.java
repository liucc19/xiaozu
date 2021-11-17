package com.soft21.java.ioex;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program:
 * @description:
 * @author: weijinlong
 * @create: 2021-11-16 18:35
 **/
public class FileOutputStreamConstruct {
    public static void main(String[] args) {

        // ʹ���ļ����ƴ���������
        //FileOutputStream fos = new FileOutputStream("b.txt");
        //fos.write(97);
        //fos.write(98);
        //fos.write(99);
        //fos.close();





        FileOutputStream fos = null;
        try {
            // ʹ���ļ����ƴ���������
            fos = new FileOutputStream("b.txt");
            fos.write(98);
            fos.write(99);


        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fos!= null)
                try {
                    fos.close();
                }catch (IOException ex) {
                    ex.printStackTrace();
                }
        }
    }

}





