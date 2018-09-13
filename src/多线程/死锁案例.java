package 多线程;

class  Test3 implements  Runnable{
    private  boolean flag;

    Test3(boolean flag) {
        this.flag = flag;
    }
    public  void  run(){
        if (flag){
            while (true){
            synchronized (MyLock.Locka){
                System.out.println("if Locka");
                synchronized (MyLock.Lockb){
                    System.out.println("if Lockb");

                }
            }}
        }else {
            while (true){
            synchronized (MyLock.Lockb){
                System.out.println("else Lockb");
                synchronized (MyLock.Locka){
                    System.out.println("else Locka");

                }
        }}
    }
}
}
class MyLock{
   static Object Locka=new Object();
    static Object Lockb=new Object();

}

    class 死锁案例 {
    public static void main(String[] args) {
        Thread t1=new Thread((new Test3(true)));
        Thread t2=new Thread((new Test3(false)));
        t1.start();
        t2.start();
    }
    }
