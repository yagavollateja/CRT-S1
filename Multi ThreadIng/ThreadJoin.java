public class ThreadJoin extends Thread{
    String name;
    ThreadJoin(String name){
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
                    System.out.println("s2:"+i);
                    Thread.sleep(1000);
                }
            }
            else if(name=="s3"){
                for(int i=1;i<=10;i++){
                    System.out.println("s3:"+i);
                    Thread.sleep(1000);
                }
            }
        }catch(Exception e){e.printStackTrace();}
    }
}
class Join{
    public static void main(String args[]){
        System.out.println("Main Thread Running");
        ThreadJoin t1=new ThreadJoin("s1");
        ThreadJoin t2=new ThreadJoin("s2");
        ThreadJoin t3=new ThreadJoin("s3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Thread s1 is alive="+t1.isAlive());
        System.out.println("Thread s2 is alive="+t2.isAlive());
        System.out.println("Thread s3 is alive="+t3.isAlive());
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Thread s1 is alive="+t1.isAlive());
        System.out.println("Thread s2 is alive="+t2.isAlive());
        System.out.println("Thread s3 is alive="+t3.isAlive());
        System.out.println("Main Thread Exiting");
    }
}
