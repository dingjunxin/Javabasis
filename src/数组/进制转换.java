package 数组;

public class 进制转换 {
    /**
     * 10进制-->二进制
     */
    public static void tobin(int num) {
        StringBuffer sb = new StringBuffer();
        while (num > 0) {
/*
            System.out.println(num%2);
*/
            sb.append(num % 2);
            num = num / 2;
        }
        /**
         * 里面有一个反转的功能，便于将输出的二进制反转
         */
        System.out.println(sb.reverse());
    }
    public static  void toHex(int num){
        StringBuffer sb = new StringBuffer();
        for (int x=0;x<8;x++){
            int temp=num&15;
            if (temp>9){
                sb.append((char)( temp-10+'A'));
/*
                System.out.println((char)( temp-10+'A'));
*/
            }else
                sb.append(temp);
/*
                System.out.println(temp);
*/
            num=num>>>4;
        }
        System.out.println(sb.reverse());
    }
    /**
     * 十进制>>十六进制
     */
    public static void main(String[] args) {
        tobin(6);
        toHex(60);
    }
}
