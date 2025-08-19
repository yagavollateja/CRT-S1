//Demonstration of Main Thread 
class MainThreadDemo{
    public static void main(String args[]){
        Thread t=Thread.currentThread();
        System.out.println("Current Thread="+t);
        t.setName("AITS-II CSE");
        System.out.println("After Name Changing="+t.getName());
        System.out.println("Thread Priority="+t.getPriority());
        System.out.println("Thead is alive="+t.isAlive());
        System.out.println("Thread Description="+t);
        try{
            for(int i=1;i<=5;i++){
                System.out.println("i value is="+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("HAVE A NICE DAY");
    }
} 