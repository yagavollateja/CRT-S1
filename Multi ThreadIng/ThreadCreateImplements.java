import java.awt.*;

class ThreadCreateImplements implements Runnable{
    public void run(){
        try{
            System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
//            for(int i=0;i<10;i++){
//                System.out.print(i+" ");
//                Thread.sleep(1000);
//            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
 class ThreadCreate2{
     public static void main(String[] args) {
         try{
             for(int i=0;i<10;i++){
                 ThreadCreateImplements thread=new ThreadCreateImplements();
                 Thread obj=new Thread(thread);
                 obj.start();
                 Thread.sleep(1000);
                 //Toolkit.getDefaultToolkit().beep();
             }
         }
         catch (Exception e){
             e.printStackTrace();
         }
     }
 }