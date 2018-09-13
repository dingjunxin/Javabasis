package 数组;

/**
 * 对给定值进行排序
 * {3,4,5,6,7,8,9}
 */
public class 选择排序 {
    public  static void Array(int[] arr){
        for (int x=0;x<arr.length;x++){
            //减1，少一次比较
            for (int y=0;y<arr.length-1;y++){
                if(arr[x]>arr[y]){
                    int max=arr[x];
                    arr[x]=arr[y];
                    arr[y]=max;
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
        int[] arr={3,4,5,6,7,8,9};
        //排序前：
        printArray(arr);
        //排序：
        Array(arr);
        //排序后
        printArray(arr);
    }
}
