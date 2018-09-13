package 多线程;

/**
 * 线程间通讯
 * 其实就是多个线程在操作同一个资源，
 * 但是操作的动作不同
 */
class Res {
    private String name;
    private String sex;
    private boolean flag = false;

    public synchronized void set(String name, String sex) throws InterruptedException {
        if (flag)
            this.wait();
        this.name = name;
        this.sex = sex;
        flag = true;
        this.notify();
    }

    public synchronized void out() throws InterruptedException {
        if (!flag)
            this.wait();
        System.out.println(name + "......." + sex);
        flag = false;
        this.notify();
    }
}
/**
 * wait（），notify（）；全部用于同步当中
 * 必须要标识出wait要操作的锁
 * 因为同步会嵌套
 * <p>
 * 为什么这些操作线程的方法要定义在在object类中，而不是在线程类中？
 * 因为这些方法在 操作同步线程时，都必须要标识它们所操作线程只有的锁
 * 只有同一个锁上的被等待线程，可以被同一个锁上的notify唤醒
 * 不可以对不同锁中的线程进行唤醒
 * <p>
 * 也就是说：等待和唤醒必须是同一个监视器（锁）
 * 而锁可以是热议对象，所以可以被任意对象调用的方法定义砸死Object中
 * <p>
 * wait（）：
 * notify（）；
 * notifyAll（）：
 * <p>
 * 都是要在同步中，因为要对持有监视器（锁）的线程操作。而监视器一定要要在同步里面
 * 所以要使用在同步中，因为只有同步才具有锁的概念
 */

/**
 * 是否公用一个锁（内存中只有四个类，都是唯一的）
 */
class Input implements Runnable {
    private Res r;

    Input(Res r) {
        this.r = r;
    }

    public void run() {
        int x = 0;
        while (true) {
            /**
             * 线程运行时，会建立一个线程池
             * 等待的进程都叜线程池中
             * 唤醒的进程都是线程池中的线程
             * 通常唤醒的是第一个等待的线程
             */
            /*synchronized (r) {
                 if (r.flag)
                //进程等待
               {
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }*/
                if (x == 0) {
                    try {
                        r.set("mike", "man");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                 else

                {
                    try {
                        r.set("知秋", "男");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                x = (x + 1) % 2;
          /*      r.flag = true;
                //唤醒
                r.notify();*/
           /*}*/
        }
    }
}

class Output implements Runnable {
    private Res r;

    Output(Res r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            try {
                r.out();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*synchronized (r) {
                if (!r.flag) {
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(r.name + "..." + r.sex);
                r.flag = false;
                r.notify();
            }*/

        }
    }
}

class 线程间通讯 {
    public static void main(String[] args) {
        Res r = new Res();
        new Thread(new Input(r)).start();
        new Thread(new Output(r)).start();

      /*  Input input = new Input(r);
        Output output = new Output(r);

        Thread t1 = new Thread(input);
        Thread t2 = new Thread(output);

        t1.start();
        t2.start();*/
    }
}