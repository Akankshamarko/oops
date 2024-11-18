
class MyThread extends Thread{
    @Override
    public void run(){
        int i =0;
        while(true){

        
        
        System.out.println("MY THREAD IS RUNNING");
        System.out.println(" I M HAPPY");
        i++;
        }

    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
        
        System.out.println("MY THREAD  2 IS RUNNING");
        System.out.println(" I M HAPPY");
        }
    }
}

public class thred1 {
    public static void main(String[] args) {
        MyThread T1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        T1.start();
        t2.start();
        
    }
    
}
