package 面向对象;

/**
 * private：私有权限修饰符；用于修饰类中的成员（成员变量，成员函数）。
 * 私有只在本类中有效
 */

/**
 * 将age私有化以后，类以外即使建立对象，也不能直接访问。
 * 但是人一个有年龄，就需要在Person类中提供对应访问age的方式
 * <p>
 * 注意：私有仅仅是封装的一种表现形式
 * 对访问的数据进行操作，提高代码健壮性
 */
class Person {


    private int age;

    void speak() {
        System.out.println("age=" + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
            speak();
        } else {
            System.out.println("输入字符不合法！！！");
        }
    }
}

class 封装 {
    public static void main(String[] args) {
        Person person = new Person();

        //不能再访问age属性// person.age=10;
        person.setAge(-20);
        //person.speak();
    }

}
