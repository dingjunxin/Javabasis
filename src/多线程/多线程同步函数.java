package 多线程;

/**
 * 需求：
 * 银行有一个金库
 * 有俩个客户分别村300，每次存100，存三次
 * <p>
 * 目的：改程序是否有安全问题，如果有，如何解决？
 * <p>
 * 如何找问题：
 * 1：明确哪些代码是多线程运行代码
 * 2：明确共享数据
 * 3：明确多线程运行代码中哪些语句是操作共享数据。
 */
public class 多线程同步函数 {
    static class Bank {
        private int sum;

        /**
         * 同步的俩种方法：
         * 1：同步函数
         * 2：同步方法
         */
        //Object obj=new Object();
        public synchronized void add(int n) {
            //synchronized (obj){
            sum = sum + n;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sum=" + sum);
        }//}
    }

    static class Cus implements Runnable {
        private Bank b = new Bank();

        public void run() {
            for (int x = 0; x < 3; x++) {
                b.add(100);
            }
        }

    }
    static class BankDemo{
        public static void main(String[] args) {
            Cus c=new Cus();
            Thread t1=new Thread(c);
            Thread t2=new Thread(c);
            t1.start();
            t2.start();
        }
    }

}
