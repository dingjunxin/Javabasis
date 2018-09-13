package 面向对象;

/**
 * 对象一建立，就会调用与之对象的构造函数
 *
 * 构造函数的作用：可以给对象进行初始化
 *
 * 构造函数的小细节：
 * 当一个类中没有定义构造函数时，系统会默认给该类加入一个空参数的构造函数
 * 当一个类中自定义的构造含税后，默认的构造函数就没有了，建议还是加上
 */

/**
 * 构造函数和一般函数在写法上有不同。
 *
 * 在运行商也有不同
 * 构造函数是在对象一建立就运行，给对象初始化
 * 一般方法是对象钓鱼才执行，就是给对象添加对象具备的功能。
 *
 * 一个对象建立，构造函数值运行一次
 * 而一般方法可以被该对象调用多次。
 *
 * 什么时候定义构造函数？
 * 当分析事物时，该事物存在具备一些特性或者行为，你们讲这些内容放在构造函数当中
 */
class Person2{
    //空构造函数：方便该类初始化，否则这对象建立不出来，因为对象没有办法初始化 Person2（）{}
   private String name;
   private  int age;

    /**
     * 构造代码块：
     * 作用：给对象进行初始化
     * 对象一建立就运行，而且优先于构造函数执行。
     * 和构造函数的区别：
     * 构造代码块是给所以对象进行统一初始化，
     * 而构造函数是给对于的对象初始化。
     */
    {
        System.out.println("构造代码块");
    }
   Person2(){
        System.out.println("name="+name+"\nage="+age);
    }
    Person2(String name){
       name=name;
        System.out.println("name="+name+"\nage="+age);
    }
    Person2(String name,int age){
        name=name;
        age=age;
        System.out.println("name="+name+"\nage="+age);
    }
}
class 构造函数 {
    public static void main(String[] args) {
    Person2 p=new Person2();
        System.out.println();
    new Person2();
    new  Person2("不好");
    new Person2("你好",2);
    }
}
