import java.awt.*;
import java.lang.*;
class RunnableThread implements Runnable{
    String name;
    RunnableThread(String name){
        this.name=name;
    }
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("This is child class execution.......");
                System.out.println("i="+i);
                //Toolkit.getDefaultToolkit().beep();
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class MainThreadR {
    public static void main(String[] args) {
        RunnableThread r=new RunnableThread("Child class");
        Thread t=new Thread(r);
        t.start();
        System.out.println(t.getPriority());
        try{
            for(int i=10;i>=1;i--){
                System.out.println("This is parent class execution.....");
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
