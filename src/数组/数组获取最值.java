package 数组;

public class 数组获取最值 {
    /**
     *第一种方式
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }
    /**
     *第二种方式
     * 将临时变量初始化为0
     * 这种方式，其实是在初始化为数组中任意一个角标
     */
    public static int getMax2(int[] arr) {
        int count = 0;
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > arr[count]) {
                arr[count] = arr[x];
            }
        }
        return arr[count];
    }
    public static void main(String[] args) {
        /**
         * 获取数组中的最大值
         * 思路：
         * 1：获取最值需要进行比较，每一次比较都会有一个较大的值，因为该值不确定
         * 通过一个变量进行存储
         * 2：让数组中的每一个元素都和这个变量中的值进行比较。
         * 如果大雨了变量中的值，就用该变量记录较大值
         * 3：当所有的元素比较完成，那么该变量中存储的就是数组中的最大值了
         *
         * 步骤：
         * 1：定义变量，初始化为数组中任意一个元素即可
         * 2：通过循环语句对数组进行遍历
         * 3：在遍历过程中定义判断条件，如果遍历到的元素比变量中的元素大，就赋值给该变量
         *
         * 需要定义一个功能来完成，以便提高复用性
         * 1：明确结果，数组中的最大元素 int
         * 2：未知内容：一个数组 int[]
         */
        int[] arr = {5, 1, 6, 4, 2, 8, 9};
        int max = getMax(arr);
        System.out.println("Max=" + max);
        int max2 = getMax2(arr);
        System.out.println("Max2=" + max2);
    }

}
