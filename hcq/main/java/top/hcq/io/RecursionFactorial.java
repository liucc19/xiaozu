package top.hcq.io;

/**
 * @program: IntelliJ IDEA
 * @description 递归求阶乘
 * @author: huangcongqi
 * @create:2021-11-16 18:16
 **/
//n的阶乘,用递归求阶乘
public class RecursionFactorial {
    public static void main(String[] args) {
        int res=getFactorial(5);
        System.out.println(res);
    }
    public static int getFactorial(int num) {
        //1的阶乘为1
        if (num==1) {
            return 1;
        }
        //n不为1时,方法返回 n! = n*(n-1)! 递归调用getValue方法
        return num*getFactorial(num-1);
    }
}

