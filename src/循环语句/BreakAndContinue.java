package 循环语句;

public class BreakAndContinue {
    public static void main(String[] args) {
        for(int x=0;x<3;x++){
            System.out.println("x="+x);
            //跳出循环
            break;
            //无法执行到该语句
//            System.out.println("x="+x);
        }
        System.out.println("\n\n");
        for (int y=0;y<3;y++){
            for (int i=0;i<4;i++){
                System.out.println("y="+y);
                break;
            }
        }

        System.out.println("\n\n");
        //continue只能作用于循环结构,继续循环。特点：结束本次循环，进行下次循环
        for (int j=0;j<3;j++){
            System.out.println("j="+j);
            continue;
            //continue下的语句永远执行不到
//            System.out.println("j="+j);
        }

        /**
         * 记住：
         * 1：break和continue语句作用的范围
         * 2：break和continue单独存在时，下面可以有任何语句，因为执行不到
         */
    }
}
