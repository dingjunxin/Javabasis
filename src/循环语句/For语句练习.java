package 循环语句;


public class For语句练习 {
    public static void main(String[] args) {
        /**
         * 1：获取1~10的和，并且打印
         */
        //1：定义变量用户存储不断变化和的和
        int whilesum = 0;
        int forsum = 0;
        //2：定义变量，记录不断变化的被加的数
        int x = 1;
        //3:定义循环，重复加法的过程
        while (x <= 10) {
            whilesum += x;
            x++;
        }
        System.out.println("通过while语句执行的sum：" + whilesum);

        for (int i = 1; i <= 10; i++) {

            forsum += i;
        }
        System.out.println("通过for执行的sum:" + forsum);
        /**
         * 循环注意：
         * 一定要明确哪些语句需要参与循环，哪些不需要循环
         */
        /**
         * 这就是累加思想
         * 通过变量记录住循环操作后的结果。
         * 通过循环的形式，进行累加操作。
         */


        /**
         * 2:1~100之间 7的倍数的个数，并打印
         */
        /**
         * 1：先对1~100进行循环（遍历），通过循环的形式
         * 2：在遍历的过程中，定义条件，支队7的倍数进行操作
         * 步骤：
         * 1：定义循环语句：选择for语句
         * 2：在循环中定义判断，只要是7的倍数即可，使用if语句。条件：7的倍数Z%7==0；
         * 3：定义变量，该变量随着7的出现而自增
         */
        int count = 0;
        for (int z = 1; z <= 100; z++) {
            if (z % 7 == 0) {
                count += 1;
            }
        }
        System.out.println("1~100中被7整除的个数为：" + count);
        /**
         * 计数器思想。
         * 通过一个变量记录住数据的状态变化。
         * 也可以通过循环完成
         */
    }
}
