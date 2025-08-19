import java.awt.*;
class RusumeSuspend extends Thread{
    String name;
    RusumeSuspend(String name){
        this.name=name;
    }
    public void run(){
        try{
            for(int i=1;i<=30;i++){
                System.out.println(name+":"+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
class SuspendResume {
    public static void main(String args[]) {
        System.out.println("Main Thread Running");
        RusumeSuspend t1 = new RusumeSuspend("s1");
        RusumeSuspend t2 = new RusumeSuspend("s2");
        RusumeSuspend t3 = new RusumeSuspend("s3");
        t1.start();
        t2.start();
        t3.start();
        try {
//            Thread.sleep(500);
//            t2.suspend();
//            t3.suspend();
//            Thread.sleep(5000);
//            t2.resume();
//            Thread.sleep(500);
//            t3.resume();
//            t1.suspend();
//            Thread.sleep(500);
//            t1.resume();
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread Exiting");
    }
}