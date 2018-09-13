package 多线程;

/**
 * 死锁：同步中嵌套同步
 *
 *
 */
class Ticket2 implements Runnable {
    private static int tick = 100;
    Object obj = new Object();
    boolean flag = true;

    public void run() {
        if (flag) {
            while (true) {
                synchronized (obj) {
                    show();
                }
            }
        } else
            while (true) {
                show();
            }
    }

    public synchronized void show() {
        synchronized (obj) {
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

class 死锁 {
    public static void main(String[] args) {

        Ticket2 t = new Ticket2();
        Thread t3 = new Thread(t);//创建了一个线程
        Thread t4 = new Thread(t);//创建了一个线程
        t3.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.flag = false;
        t4.start();
    }
}
