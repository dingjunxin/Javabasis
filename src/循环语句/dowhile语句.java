package 循环语句;

public class dowhile语句 {
    public static void main(String[] args) {
        int x=0;
        do {
            System.out.println("x="+x);
            x++;
        }
        while (x<3);

        int y=0;
        while (y<3){
            System.out.println("y="+y);
            y++;
        }
        /**
         * 不成立时，dowhile先运行一次
         */
        int z=4;
        do {
            System.out.println("\nz="+z);
            z++;
        }
        while (z<3);
        /**
        * while (o<3)；
         * while (o<3)加入分号，会没有循环体，会持续判断循环条件：0<3的语句，CPU一直做运行。
         * 但是因为分号是循环体结束，会出错
        */
        int o=4;
        while (o<3){
            System.out.println("o="+o);
            o++;
        }
        /**
         * while：先判断条件，只有条件满足才执行循环体。
         * do while：先执行循环体，再判断条件，条件满足，再继续执行循环体。
         * 简单一句话：
         * do while：无论条件十分满足，循环体只是执行一次。
         */
    }
}
