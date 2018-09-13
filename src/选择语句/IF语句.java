package 选择语句;

public class IF语句 {
    //需求1：根据用户定义的数值不同，打印对应的星期英文
    public static void main(String[] args) {
        int num = 1;
        if (num == 1) {
            System.out.println("monday");
        } else if (num == 2) {
            System.out.println("tesday");
        }else{
            System.out.println("输入错误");
        }
     //需求2：根据用户指定月份，打印该月份所属的季节。
     //3，4,5春季 6,7,8夏季 9,10,11秋季 12,1,2冬季
        int x=4;
        if(x==3|| x==4||x==5)
            System.out.println(x+"月份"+"\n春季");
        else if(x==6|| x==7||x==8)
            System.out.println(x+"月份"+"\n夏季");
        else if(x==9|| x==10||x==11)
            System.out.println(x+"月份"+"\n秋季");
        else if(x==12|| x==1||x==2)
            System.out.println(x+"月份"+"\n冬季");
        else
            System.out.println("月份不存在");


        if(x>=3&&x<=5)
            System.out.println(x+"月份"+"\n春季");
        else if(x>=6&&x<=8)
            System.out.println(x+"月份"+"\n夏季");
        else if(x>=9&&x<=11)
            System.out.println(x+"月份"+"\n秋季");
        else if(x>12|| x<1)
            System.out.println("月份不存在");
        else
            System.out.println(x+"月份"+"\n冬季");
    }
}
