package 循环语句;

public class For和While的区别 {
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            System.out.println("i="+i);
        }
        /**
         * 变量的作用域，i离开for循环后，内存中i就没有了
         * 导致无法执行输出i语句
         */
        /*System.out.println("i===="+i;*/
        /**
         * 1：变量有自己的作用域，对于for来讲，如果将用于控制循环的增量定义在for语句中，你们该变量只在for语句内有效
         * for语句执行完毕，该变量在内存中被释放
         *
         * 2：for和while可以进行互换，如果需要定义循环增量，用for更为合适
         *
         * 总结：
         * 什么时候使用循环结构？
         * 当要对一些语句执行很多次时，就使用循环结构
         */

        int y=0;
        while (y<3){
            System.out.println("y="+y);
            y++;
        }
        System.out.println("\ny===="+y);
    }
}
