package 面试题;
//1.23
public class 选择排序实现10个随机数字排序 {
    //选择排序算法
    public  static  void selectSort(int[] number){
        for (int i=0;i<number.length-1;i++){
            int m=i;
            for (int j=i+1;j<number.length;j++){
                if (number[j]<number[m])
                    m=j;
            }if (i!=m)
                SWAP(number,i,m);
        }
    }
    //用于交换数组的索引为i，j的元素
    private  static void SWAP(int[] number,int i,int j){
        int t;
        t=number[i];
        number[i]=number[j];
        number[j]=t;
    }
    public static void main(String[] args) {
    //定义一个数组
        int[] num=new int[10];
        for (int i=0;i<num.length;i++){
            num[i]=(int)(Math.random()*100)+1;
        }
        //排序
        selectSort(num);
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
    }
