package 多线程;

/**
 * 需求：买票程序
 * 多个窗口买票。
 * <p>
 * 创建线程的第二种方式：实现Runable接口
 * <p>
 * 步骤：
 * 1：定义类实现Runable接口
 * 2：覆盖Runable接口中的run方法。
 * 将线程要运行的代码存放在该run方法中
 * 3：通过Thread类建立线程对象。
 * 4：将Runable类接口的子类对象作为实际参数传递给Thread类的构造函数
 * 为什么要将Runable接口的子类对象床底给Thread的构造函数。
 * 因为，自定义 润发方法所属的对象的run方法，就必须明确该run方法所属对象。
 * <p>
 * 5：调用Thread类的start方法开启线程并且调用Runable接口子类的run 方法
 * <p>
 * 实现方式和继承方式有什么区别呢？
 * 实现方式好处：避免了单继承的局限性。
 * 在定义线程时，建议使用实现方式。
 * <p>
 * 俩种方式的区别：
 * 继承Thread：线程代码存放在Thread子类run方法中。
 * 实现Runable：线程代码存放在接口子类的run方法中。
 */
class Ticket implements Runnable {
//extends Thread{
    /**
     * 四个对象公用100张票，使用静态
     * 但是其生命周期过长，不常使用
     */
    /**
     * 如果同步函数被静态修饰后，使用的锁是什么呢？
     * 通过验证，发现不再是this，因为静态方法中不可以定义this
     *
     * 静态进内场时，内存中没有本类对象，但是一定有该类对于的字节码文件对象。
     * 类名.class  该对象的类型是Class
     *
     * 静态的同步方法，使用的锁是该方法所在类的字节码文件对象。类名.class。
     */
    private static int tick = 100;
    //java里面的上帝对象
        Object obj=new Object();
        boolean flag=true;
    public void run() {
        /**
         * 通过分析：分析，打印出0，-1，-2等错票
         *
         * 多线程的运行出现了安全问题。
         *
         * 问题的原型：
         *          当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行了一部分，还没有执行完，
         *          另一个线程参与进来执行，导致共享数据的错误。
         *
         * 解决办法：
         *          对多条操作共享数据的语句，只能让一个线程都执行完，在执行过程中，其他线程不可以参与执行。
         *
         * java对于多线程的安全问题提供了专业的解决方式。
         * 就是：同步代码块
         *  synchronized (对象){
         *  需要被同步的代码
         *}（哪些语句在操作共享数据，哪些代码就需要被同步）
         * 对象如同锁，持有锁的线程可以在同步中执行
         * 没有持有锁的线程即使获取了cpu的执行权，也进不去。因为没有获取锁。
         *
         * 火车上的卫生间---经典。
         *
         * 同步可以解决线程的安全问题。
         * 同步的前提：
         * 1：必须要有2个或者2个以上的线程。
         * 2：必须是多个线程使用同一个锁。
         *
         * 必须保证同步中只能有一个线程在运行。
         * 好处：解决多线程的安全问题。
         * 弊端：消耗了资源，多个线程需要判断锁。
         */
        if(flag){
        while (true) {
            synchronized(this) {
                //线程锁是obj。将obj更改为this，线程安全
                //将this改为Ticket.class
                /**
                 * 同步函数用的是哪一个锁呢？
                 * 函数需要被对象钓鱼。那么函数都有一个所属对象引用。就是this
                 * 所以同步函数使用的锁是this。
                 *
                 * 通过该程序进行验证。
                 * 使用俩个线程来卖票
                 * 一个线程在同步代码块中。
                 * 一个线程在同步函数中。
                 * 都在执行卖票动作。
                 */
                if (tick > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                    }
                    System.out.println(Thread.currentThread().getName() + "\tcode:" + tick--);
                }
                 }
            }
        }
        else
            while (true){
                show();
            }
    }
    public synchronized void show(){//线程锁是this。
        if (tick > 0) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            System.out.println(Thread.currentThread().getName() + "\tshow......:" + tick--);
        }
    }
}

public class 售票案例 {
    public static void main(String[] args) {
        /**
         * java.lang.IllegalThreadStateException
         * 线程状态出问题：已经运行的线程不需要再次运行
         */
        Ticket t = new Ticket();
        /**
         * Thread(Runnable target)
         * 分配新的 Thread 对象。
         */
        Thread t1 = new Thread(t);//创建了一个线程
        Thread t2 = new Thread(t);//创建了一个线程


        //Thread t3 = new Thread(t);//创建了一个线程
        //Thread t4 = new Thread(t);//创建了一个线程
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.flag=false;
        t2.start();


        //t3.start();
        //t4.start();
       /* Ticket t1=new Ticket();
        Ticket t2=new Ticket();
        Ticket t3=new Ticket();
        Ticket t4=new Ticket();
        t1.start();
//        t1.start();
//        t1.start();
//        t1.start();

        t2.start();
        t3.start();
        t4.start();*/

    }
}
