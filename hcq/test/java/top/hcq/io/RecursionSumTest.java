package top.hcq.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @program: IntelliJ IDEA
 * @description
 * @author: huangcongqi
 * @create:2021-11-17 16:51
 **/
class RecursionSumTest {

    @Test
    void main() {
        System.out.println("计算1~n的和");

        int sum = RecursionSum.getSum(6);
        Assertions.assertEquals(15,sum);
    }

    @Test
    void getSum() {
    }
}