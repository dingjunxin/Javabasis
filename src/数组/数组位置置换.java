package 数组;

public class 数组位置置换 {
    /**
     * 发现无论什么排序，都需要对满足条件的元素进行位置置换。
     * 所以可以吧这部分相同的代码提取出来，单独封装成一个函数
     */
    public static  void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public  static  void  Array(int[] arr){
        for (int x=0;x<arr.length-1;x++){
            /**
             * -x：让每一次比较的元素减少，-1.避免角标越界
             */
            for (int y=0;y<arr.length-1;y++){
                if(arr[y]>arr[y+1]){

                    swap(arr,x,y);
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (x != arr.length - 1) {
                System.out.print(arr[x] + ",");
            } else System.out.println(arr[x]);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,5,8,9,6};
        //排序前：
        printArray(arr);
        //排序：
        /**
         * java中已经定义好的一种排序方式，开发中，对数组排序，要是有该句代码。
         */
        Array(arr);
        //排序后
        printArray(arr);
    }
}
