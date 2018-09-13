package 数组;

public class 冒泡排序 {
    public  static  void  Array(int[] arr){
        for (int x=0;x<arr.length-1;x++){
            /**
             * -x：让每一次比较的元素减少，-1.避免角标越界
             */
            for (int y=0;y<arr.length-1;y++){
                if(arr[y]>arr[y+1]){
                    arr[y]=arr[y]+arr[y+1];
                    arr[y+1]=arr[y]-arr[y+1];
                    arr[y]=arr[y]-arr[y+1];
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
        Array(arr);
        //排序后
        printArray(arr);

    }
}
