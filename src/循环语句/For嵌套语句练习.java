package 循环语句;

import java.time.Year;

public class For嵌套语句练习 {
    public static void main(String[] args) {
        /**
         *   *
         *   **
         *   ***
         *   ****
         *   *****
         *
         *   不是规律的规律
         *   尖朝上，可以改变条件，让条件随着外循环变化
         *   尖朝下，可以初始化值，让初始化随着外循环变化
         */
        int q = 0;
        for (int v = 0; v < 5; v++) {
            for (int b = 0; b <= q; b++) {
                System.out.print("*");
            }
            q++;
            System.out.println();
        }
        /**
         *   1
         *   12
         *   123
         *   1234
         *   12345
         */
        System.out.println("\n\n");
        int e=0;
        for(int i=0;i<=5;i++){
            for (int a=1;a<=e;a++){
                System.out.print(a);
            }
            e++;
            System.out.println();
        }

        /**
         * 99乘法口诀表
         * 1*1=1
         * 1*2=2 2*2=2
         */
        System.out.println("\n\n");
        int h=1;
        for (int j=0;j<=9;j++){
            for (int k=1;k<=h;k++){
                System.out.print("\t"+k+"*"+h+"="+k*h);
            }
            h++;
            System.out.println();
        }
        /**
         * 99乘法口诀表(翻转)
         * 10*10=100
         * 	10*9=90	9*9=81
         * 	10*8=80	9*8=72	8*8=64
         */
        System.out.println("\n");
        int p=10;
        for (int count=0;count<=9;count++){
            for (int r=10;r>=p;r--){
                System.out.print("\t"+r+"*"+p+"="+r*p);
            }
            p--;
            System.out.println();
        }
        /**
         *  10*1=10	9*1=9	8*1=8	 7*1=7	6*1=6	5*1=5	4*1=4	3*1=3	2*1=2	1*1=1
         * 	10*2=20	9*2=18	8*2=16	7*2=14	6*2=12	5*2=10	4*2=8	3*2=6	2*2=4
         * 	10*3=30	9*3=27	8*3=24	7*3=21	6*3=18	5*3=15	4*3=12	3*3=9
         */
        System.out.println("\n");
        int i1=1;
        for (int count2=0;count2<=9;count2++){
            for (int r1=10;r1>=i1;r1--){
                System.out.print("\t"+r1+"*"+i1+"="+r1*i1);
            }
            i1++;
            System.out.println();
        }
    }
}
