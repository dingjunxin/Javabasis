package 数组;

public class 数组静态初始化 {
    public static void main(String[] args) {
        /**
         * 创建数组实体，并给每一个位置都添加了具体元素
         */
    //int[] arr=new int[]{3,4,5,6,7};
        /**
         *
         */
       /* int[] arr=new int[5];
        arr[0]=90;
        arr[1]=80;*/
       int[] arr=new int[3];
        /**
         * 编译时检查不到错误，因为还没有分配数组空间
         * 运行时才在堆中分配数组空间，会发现错误
         * System.out.println(arr[3]);{
         * ArrayIndexOutOfBoundsException：操作数组时，访问到了数组中不存在的角标，报该异常
         * }
         */
//        System.out.println(arr[3]);
        /**
         *NullPointerException:空指针异常；当引用没有指向值为null的情况，该引用还被用来操作实体；
         * arr不指向任何实体，但是还被引用，所以报该错
         */
        arr=null;
        System.out.println(arr[1]);
    }
}
