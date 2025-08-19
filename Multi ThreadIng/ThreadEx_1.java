import java.awt.*;

class ThreadExample extends Thread{
    String name;

    public ThreadExample(String name) {
        this.name = name;
    }
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println(name+" I="+i);
                Toolkit.getDefaultToolkit().beep();
                Thread.sleep(1000);
                //Toolkit.getDefaultToolkit().beep();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class ThreadEx_1 {
    public static void main(String[] args) {
        ThreadExample t=new ThreadExample("Teja");
        t.run();
    }
}
