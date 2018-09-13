package 循环语句;

public class While语句 {
    public static void main(String[] args) {
    //需求：规定区间看i的变化
        /**
         * 定义初始化表达式
         * while（条件表达式）
         * {
         * 循环体（执行语句）；
         * }
         */
        int i=0;
        int x=0;
        while (i<10){
            System.out.println("i="+i);
            i++;
        }
        while (x<10){
            System.out.println("\nx="+x);
            ++x;
        }
    }
}
