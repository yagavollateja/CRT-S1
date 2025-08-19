class A {
    void m1(){
        try{
            String Thread_name=Thread.currentThread().getName();
            System.out.println("Before Synchronization method is: "+Thread_name);
            synchronized(this){
                for(int i=0;i<10;i++){
                    String thread_Name1=Thread.currentThread().getName();
                    System.out.println("Inside Synchronized Block :"+thread_Name1);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
class B extends Thread{
    A a;
    B(A a){
        this.a=a;
    }
   public void run(){
        a.m1();
    }
}
class C extends Thread{
    A a;
    C(A a){
        this.a=a;
    }
    public void run(){
        a.m1();
    }
}
class D extends Thread{
    A a;
    D(A a){
        this.a=a;
    }
    public void run(){
        a.m1();
    }
}
class SynchronizeDemo{
    public static void main(String[] args) {
        A a=new A();
        B b=new B(a);
        C c=new C(a);
        D d=new D(a);
        b.start();
        c.start();
        d.start();
    }
}