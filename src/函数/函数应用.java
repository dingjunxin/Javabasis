package 函数;


public class 函数应用 {
    /**
     * 如何定义一个函数呢
     * 1：既然函数是一个独立的功能，你们该功能的运算结果是什么先明确
     * 因为这是在明确函数的返回值类型
     * 2：再明确在定义该功能的过程中是否需要未知的内容参与运算。
     * 因为是在明确函数的参数列表（参数的类型和参数的个数）
     */
    //需求：定义一个功能，完成3+4的运算，并将结果返回给调用者

    /**
     * 1：明确功能的结果：是一个整数的和
     * 2：在实现该功能的过程中是否有未知内容参与运算，没有
     * 其实，这俩个功能就是在明确函数的定义
     * 1：是在明确函数的返回值类型
     * 2：明确函数的参数列表（参数类型和参数的个数）
     */
   public static int getSum(){
       return 3+4;
    }

    /**
     * 以上这个函数的功能，结果是固定的，毫无扩展性而言
     * 为了方便用户需求，由用户来指定加数和被加数，这样，功能才有意义
     * 思路：
     * 1:功能结果是一个和，返回值类型是int
     * 2：有未知内容参与运算，有2个，这2个未知内容的类型为int
     */
    public static  int getResult(int a,int b){
        return a+b;
    }

    /**
     * x需求：判断俩个数是否相同
     */
    /**
     * 1：是一个判断，返回值类型是boolean
     * 2：有未知参数参加运算，2个参数，类型为int
     */
    public static  boolean gerEqury(int x,int y){
       /* if (x==y){
            return true;
        }else return  false;*/
/*
       return (x==y)?true:false;
*/
       return  x==y;
    }

    /**
     * 对俩个数进行比较，获取最大的数
     */
    public static  int getMax(int i,int j){
        return (i>j)?i:j;
    }
    public static void main(String[] args) {
        int sum=getSum();
        System.out.println("sum="+sum);
        int getsum=getResult(3,4);
        System.out.println("getsum="+getsum);
        boolean gerequry=gerEqury(1,1);
        System.out.println("gerequry="+gerequry);
        int getmax=getMax(3,6);
        System.out.println("getmax="+getmax);
    }
}
