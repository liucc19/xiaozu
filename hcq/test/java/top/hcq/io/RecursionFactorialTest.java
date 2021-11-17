package top.hcq.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @program: IntelliJ IDEA
 * @description
 * @author: huangcongqi
 * @create:2021-11-17 12:31
 **/
class RecursionFactorialTest{

    @Test
    void main() {
    }

    @Test
    void getFactorial() {
        System.out.println("n阶乘测试");
        int mul = RecursionFactorial.getFactorial(6);
        Assertions.assertEquals(120,mul);
    }
}