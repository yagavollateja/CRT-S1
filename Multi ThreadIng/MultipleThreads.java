import java.awt.*;
class ThreadEx extends Thread{
    String name;
    ThreadEx(String name){
        this.name=name;
    }
    public void run(){
        try{
            if(name=="s1"){
                for(int i=1;i<=10;i++){
                    System.out.println("s1:"+i);
                    Thread.sleep(1000);
                }
            }
            else if(name=="s2"){
                for(int i=1;i<=10;i++){
                    System.out.println("s2:Disturbed: creates beep sound ");
                    Toolkit.getDefaultToolkit().beep();
                    Thread.sleep(1000);
                }
            }
            else if(name=="s3"){
                for(int i=10;i>=1;i--){
                    System.out.println("s3:"+i);
                    Thread.sleep(1000);
                }
            }
        }catch(Exception e){e.printStackTrace();}
    }
}
class MultipleThreads{
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Main Thread Running");
        ThreadEx t1=new ThreadEx("s1");
        ThreadEx t2=new ThreadEx("s2");
        ThreadEx t3=new ThreadEx("s3");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main Thread Exiting ");
    }
}