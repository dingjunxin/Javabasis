package 循环语句;

//语句嵌套形式，语句中还有语句
//循环嵌套
public class For嵌套语句 {
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.print("*");
            }
            System.out.println();//只有一个功能，就是换行功能
        }
        System.out.println("\n\n");
        //对于打印长方形，外循环控制的行数，内循环控制的是每一行的列数，也就是一行中元素的个数
        /**
         *
         *  *****
         *  ****
         *  ***
         *  **
         *  *
         *  发现图形有很多行，每一个行有很多列
         *  要是有嵌套循环。原理：形象说法，大圈套小圈
         */
        int a = 0;
        for (int x = 0; x <= 5; x++) {
            for (int z = 5; z > a; z--) {
                System.out.print("*");
            }
            a++;
            System.out.println();
        }

        System.out.println("\n\n");
        for (int g = 0; g < 5; g++) {
            for (int t = g; t < 5; t++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
