package top.hcq.io;

/**
 * @program: IntelliJ IDEA
 * @description 递归求和
 * @author: huangcongqi
 * @create:2021-11-15 22:33
 **/

// 计算1~n的和

public class RecursionSum {
    public static void main(String[] args) {
        //计算1~num的和，使用递归完成
        int num=5;
        // 调用求和的方法
        int sum=getSum(num);
        // 输出结果
        System.out.println(sum);
    }

    public static int getSum(int num) {
        //num为1时,方法返回1,相当于是方法的出口,num总有是1的情况
        if (num==1) {
            return 1;
        }
        //num不为1时,方法返回 num +(num-1)的累和, 递归调用getSum方法
        return num+getSum(num-1);
    }
}


