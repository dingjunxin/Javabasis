package 选择语句;

public class SWITCH语句 {
    public static void main(String[] args) {
        int x=2;
        switch (x)//byte short int char(最新jdk版本更改)
        {
            case 4:
                System.out.println("a");
                break;
            case 5:
                System.out.println("b");
                break;
            case 7:
                System.out.println("c");
                break;
            default:
                System.out.println("d");
            //    break;
        }
        //char类型
        int a=4,b=2;
        char ch='+';
        switch (ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                default:
                    System.out.println("非法字符串");
        }
    }
}
