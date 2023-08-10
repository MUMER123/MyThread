public class Main {
    public static void main(String[] args) {

//        MyThread mt1 = new MyThread("Even",true);
//        MyThread mt2 = new MyThread("Odd",false);
//        mt1.start();
//        mt2.start();
       MyThread2 mt2 = new MyThread2(true);
        MyThread2 mt3 = new MyThread2(false);
        Thread t1 = new Thread(mt2);
        Thread t2 = new Thread(mt3);
        t1.start();
        t2.start();
    }
}
