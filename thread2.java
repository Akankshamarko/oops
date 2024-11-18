
class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println(" xyz");
    }

}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println(" zyx");
    }

}



public class thread2 {
    public static void main(String[] args) {
        MyThreadRunnable t1 = new MyThreadRunnable(); 
        Thread z1 = new Thread(t1);   
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread z2 = new Thread(t2);
        z1.start();
        z2.start();
    }
    
}
