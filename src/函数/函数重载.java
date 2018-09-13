package 函数;

/**
 * 什么时候用重载？
 * 当定义的功能相同，但参与运算的未知内容不同
 * 那么这时就定义一个函数名称以表示其功能，方便阅读，而通过参数列表的不同来区分多个同名函数
 */

/**
 * 判断是否重载
 * 1：函数名称
 * 2：参数个数
 * 3：参数类型
 * 4：参数顺序
 */
public class 函数重载 {
    //定义一个加法运算，获取2个整数的和
    public static  int add(int x,int y){
        return x+y;
    }
    //定义一个加法加法，获取三个整数的和
    public  static  int add(int x,int y,int z){
        return x+y+z;
    }
    //打印99乘法表
    public  static  void  print99(){
        print99(9);
    }
    //打印nn乘法表
    public  static  void  print99(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sum3 = add(1, 2, 3);
        System.out.println("sum="+sum3);
        int sum2 = add(1, 2);
        System.out.println("sum="+sum2);
        System.out.println("\n\n");
        print99(2);
        System.out.println("\n\n");
        print99();


    }
}
