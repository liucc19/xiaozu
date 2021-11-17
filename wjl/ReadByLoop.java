package com.soft21.java.ioex;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program:
 * @description:
 * @author: weijinlong
 * @create: 2021-11-16 21:36
 **/
public class ReadByLoop {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("b.txt");
        int b = 0;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
        fis.close();
    }
}
