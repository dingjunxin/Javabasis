package 多线程;
//主线程没有多线程运行
/*
练习：
创建俩个线程，与主线程交替运行
 */

/**
 * 原来线程都有自己默认的名称。
 * Thread-编号：该编号从0开始，通过GetName就可以获取
 *
 * static Thread currentThread():获取当前线程对象。
 * getName（）：获取线程名称。
 *
 * 设置线程名称：setName或者构造函数。
 */
class Test extends Thread {
    //private String name;

    Test(String name) {
        //this.name = name;
        //自定义线程名称
        super(name);
    }

    public void run() {
        for (int x = 0; x < 60; x++) {
/*
            System.out.println(name + "\ttest run..." + x);
*/
/*
            System.out.println(this.getName() + "\ttest run..." + x);
*/
            System.out.println((Thread.currentThread()==this)+"......"+this.getName() + "\ttest run..." + x);

        }
    }
}

class 线程练习 {
    public static void main(String[] args) {
        for (int x = 0; x < 60; x++) {
            System.out.println("main..." + x);
        }
        Test t1 = new Test("one----");
        Test t2 = new Test("two----");
        t1.start();
        t2.start();
        /**
         * 线程的四种状态
         *         //睡眠
         *         t1.sleep(1);
         *         //等待
         *         t2.wait("2");
         *         //唤醒
         *         t2.notify();
         *         //消亡
         *         t2.stop();
         *
         * 临时状态（阻塞状态）：具备运行资格，但没有执行权。
         * 冻结状态：放弃了执行资格。（唤醒过后，先回到临时状态，有执行资格，等待cpu运行）
         *
         *
         *
         */


    }
}
