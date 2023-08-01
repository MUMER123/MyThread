public class Main {
    public static void main(String[] args) {

//        MyThread mt1 = new MyThread("Even",true);
//        MyThread mt2 = new MyThread("Odd",false);
//        mt1.start();
//        mt2.start();
        MyThread2 mt1 = new MyThread2(false);
        MyThread2 mt2 = new MyThread2(true);
        mt1.run();
        mt2.run();
    }
}