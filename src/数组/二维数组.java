package 数组;

/**
 * int []x,y[];   x是一维数组，y是二维数组
 * int []x;
 * int[] y[];
 *
 * a:
 * x[0]=y;//error
 * b:
 * y[0]=x;//yes
 * c:
 * y[0][0]=x;//error
 * d:
 * x[0][0]=y;//error
 * e:
 * y[0][0]=x[0];//yes
 * f:
 * x=y;//error
 */
public class 二维数组 {
    public static void main(String[] args) {
        int[] arr=new int[3];//一维数组
        int[][] arr2=new int[3][4];//定义了名称为arr等等二维数组。二维数组中有三个一维数组。
                                    //每一个一维数组中有四个元素
        //打印二维数组的长度 3
        System.out.println(arr2.length);
        //打印二维数组中第一个一维数组长度
        System.out.println(arr2[0].length);
        //遍历二维数组
        int[][] arr3={{1,1,1,1},{1,1,1,1}};
        int sum=0;
        for (int x=0;x<arr3.length;x++){
            for (int y=0;y<arr3[x].length;y++){
                sum=sum+arr3[x][y];
            }
        }
        System.out.println("sum="+sum);
    }
}
