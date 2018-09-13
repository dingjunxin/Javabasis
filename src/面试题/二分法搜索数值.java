package 面试题;

//1.25
import java.util.Arrays;

public class 二分法搜索数值 {
    //被搜索数据的大小
    private static final int size = 1000;

    public static void main(String[] args) {
        int[] data = new int[size];
        //添加测试数据
        for (int k = 0; k < data.length; k++) {
            data[k] = k + 1;
        }
        data[999] = 567;
        result(data);
    }

    //采用二分法搜索元素
    public static void result(int data[]) {
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            int target = data[i];
            data[i] = 0;
            int result = binaryFind(data, target);
            if (result != -1) {
                System.out.println("相同元素为" + data[result]);
            }
        }
    }

    /**
     * 二分法搜索算法实现
     * data:数据集合
     * target：搜索的数据
     * return：返回找到的数据的位置，返回-1表示没有找到
     */
    public static int binaryFind(int[] data, int target) {
        int start = 0;
        int end = data.length - 1;
        while (start <= end) {
            int middleIndex = (start + end) / 2;
            if (target == data[middleIndex]) {
                return middleIndex;
            }
            if (target >= data[middleIndex]) {
                start = middleIndex + 1;
            } else {
                end = middleIndex - 1;
            }
        }
        return -1;
    }
}
