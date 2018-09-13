package 面试题;
//1.27(有错误)
public class 找出没有放入数组的数值 {
    public static void main(String[] args) {
    int[] a=new int[98];
    int[] b=new int[100];
    for (int t:b){
        a[t-1]=t;
    }
    for (int t=0;t<a.length;t++){
        if (a[t]==0){
            System.out.println(t+1);
        }
    }
    }
    }
