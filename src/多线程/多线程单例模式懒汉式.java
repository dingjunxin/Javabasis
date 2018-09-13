package 多线程;

/**
 * 单例设计模式。
 * 1：懒汉式
 * 2：饿汉式：
 * class Single
 * {
 * private static final Single s=new Single();
 * private Single(){}
 * public static Single getInstance()
 * {
 * return s.
 * }
 * }
 */
class Single {
    private static Single s = null;

    private Single() {
    }

    //题目：
    // 写一个延时加载的多线程设计实例
    public static Single getInstance() {
        if (s == null) {
            synchronized (Single.class) {
                if (s == null) {
                    s = new Single();

                }
            }

        }
        return s;
    }
}

class 多线程单例模式懒汉式 {
    public static void main(String[] args) {

    }
}
