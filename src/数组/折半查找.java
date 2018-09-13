package 数组;

public class 折半查找 {
    //定义功能，获取key第一次哦出现在数组中的位置。如果返回是-1，你们代表该key在数组中不存在
    public static  int getIndex(int[] arr,int key){
        for (int x=0;x<arr.length;x++){
            if (arr[x]==key)
                return x;
        }return -1;
    }

    /**
     * 折半查找：可以提高效率，但是数组必须是有序的
     */
    public static  int halfSearch(int[] arr,int key){
        int min,max,mid;
        min=0;
        max=arr.length-1;
        mid=(max+min)/2;
        while (arr[mid]!=key){
            if (arr[mid]<key){
                min=mid+1;
            }else  if (key<arr[mid]){
                max=mid-1;
                mid=(max+min)/2;
            }else if (min>max){
                return -1;
            }
        }return mid;
    }

    /**
     * 折半的第二种方式
     */
    public static  int halfSearch2(int[] arr,int key){
        int min=0,max=arr.length-1,mid;
        while (min<max){
            //"2<<3"表示2左移3位
            //(max+min)>>1=(max+min)/2
            mid=(max+min)>>1;
            if (key>arr[mid]){
                min=mid+1;
            }else  if (key<arr[mid]){
                max=mid-1;
            }else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int index=getIndex(arr,3);
        System.out.println("index="+index);
        System.out.println("\n\n");
        int index2=halfSearch(arr,3);
        System.out.println("index2="+index2);
    }
}
