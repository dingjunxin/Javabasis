package 选择语句;

public class SWITCH练习 {
    public static void main(String[] args) {
        //根据用户指定月份，打印该月份所属的季节。
        //3，4,5春季 6,7,8夏季 9,10,11秋季 12,1,2冬季
        int x=4;
        switch (x){
            case 3:
            case 4:
            case 5:
                System.out.println(x+"月份"+"\n春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(x+"月份"+"\n夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(x+"月份"+"\n秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(x+"月份"+"\n冬季");
                break;
            default:
                System.out.println("非法字符");
        }
        /**
         * if和switch语句很想，
         * 如果判断的具体数值不多，而且符合bytr，short，int，char这四种类型
         * 虽然俩个语句均可使用，建议使用switch语句，因为效率稍高
         *
         * 其他情况，对区间判断 ，对结果为boolean类型判断，使用if，if的使用范围更广
         */
    }
}
