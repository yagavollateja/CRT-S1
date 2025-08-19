class TreadCreate1 extends Thread{
    public void run(){
        try{
            //System.out.println("This is a Thread creation");
            System.out.println("Thread is "+Thread.currentThread().getId()+" Running");
            //Thread.sleep(10000);
            for(int i=0;i<10;i++){
                System.out.print(i+" ");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
class ThreadCreateDemo1{
    public static void main(String[] args) {
        try {
            for(int i=0;i<10;i++){
                System.out.println("Thread "+i+" is executed");
                TreadCreate1 obj=new TreadCreate1();
                obj.start();
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}