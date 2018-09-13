package 数组;

public class 数组遍历 {
    public static void main(String[] args) {
        //数组的操作
        /**
         * 获取数组中的元素
         * 通常会用到遍历；
         */
        //1:遍历普通数组
        //int[] arr=new int[3];
//2:遍历随机数组
        int[] arr = {3, 4, 5, 6, 7};
        /**数组中有一个属性可以直接获取到数组元素个数。length
         * 使用方式：数组名称.length
         */
        System.out.println("数组长度=" + arr.length);
/*         System.out.println("\n\n");
         for (int x=0;x<5;x++){
            System.out.println("arr["+x+"]="+arr[x]);
        }*/
        printArray(arr);

        System.out.println("\n\n");
        /**
         * [I@1540e19d:打印出了数组的地址值，没意义
         * 输出语句出现错误
         */
        System.out.println(arr);
    }

    /**
     * 定义给你，用于打印数组中的元素，元素间用逗号隔开
     */
    public static void printArray(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (x != arr.length - 1) {
                System.out.print(arr[x] + ",");
            } else System.out.println(arr[x]);
        }
    }
}
