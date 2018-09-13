package 面向对象;

/**
 * this：看上去也，是用于区分局部变量和成员变量同名情况
 * this：为什么可以解决这个问题？
 * this：到底代表的是什么？
 *
 * this：就代表本类的对象，到底代表哪一个？
 *      this：代表它所在函数所属对象的引用。
 *      简单说：哪个对象在调用this所在的函数，this就代表哪个对象。
 *
 * this的应用：当定义类中共功能时，该函数内部要用到调用该函数的对象时，这是用this来表示这个对象
 *          但凡本类功能内部使用了本类对象，都用this表示。
 *
 * this语句只能定义在构造函数的第一行。因为初始化要先执行。
 */
class  Person3{
    private  String name;
    private  int age;
    Person3(){
        //this("haha");
    }
    Person3(String name){
        //this();
        this.name=name;
    }
    Person3(String name,int age){

        this(name);//相当于代表着p（name）；
        this.age=age;


    }
}
public class This关键字 {

    public static void main(String[] args) {
        Person3 p=new Person3("li",30);
    }
}
