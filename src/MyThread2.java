public class MyThread2 implements Runnable{
    private boolean isEven;
    public MyThread2(boolean isEven){
        this.isEven = isEven;
    }

    public boolean isEven() {
        return isEven;
    }
    @Override
    public void run(){
        if(isEven){
            for(int i=0;i<100;i+=2){
                System.out.println(i);
            }
        }else{
            for(int i=1;i<100;i+=2){
                System.out.println(i);
            }
        }
    }
}
