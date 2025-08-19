import java.awt.*;
import java.util.Scanner;

public class MainThreadDemoEx {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        Scanner sc=new Scanner(System.in);
        System.out.println("The current thread name:"+t);
        System.out.println("current thread isAlive:"+t.isAlive());
        try{
            for(int i=0;i<10;i++){
                String name=sc.nextLine();
                t.setName(name+"II-cse 23701A05M");
                System.out.println("Student details:"+t.getName()+i);
//                Toolkit.getDefaultToolkit().beep();
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
