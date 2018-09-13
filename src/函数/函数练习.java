package 函数;

public class 函数练习 {
    /**
     * 定义一个功能，用于打印矩形
     * 思路：
     * 1:确定结果，没有，因为直接打印，所以返回值类型是void
     * 2：有未知内容吗？有，俩个，矩形的行和列
     */
    public static  void draw(int a,int b){
        for (int x=0;x<a;x++){
            for (int y=0;y<b;y++){
                System.out.print("*");
            }
                System.out.println();
        }
    }
    public static void main(String[] args) {
                draw(5,6);

    }
    }
