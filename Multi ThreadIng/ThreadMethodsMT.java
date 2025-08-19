class ThreadMethodsMT {
    public static void main(String[] args) {
        //create Thread class object
        Thread t=new Thread();
        //set the name to Thread object
        t.setName("Teja");
        //get the name of the Thread object
        System.out.println("This is t Thread:"+t.getName());
        //create another Threda
        Thread t1=new Thread();
        //set the name of the Thread
        t1.setName("Prasad");
        //get the name of Thread
        System.out.println("This is t1 Thread:"+t1.getName());
        //set the priority
        t.setPriority(10);
        t1.setPriority(1);
        //get priority of the Thread
        System.out.println("The priority of Thred t:"+t.getPriority());
        System.out.println("The priority of Thred t1:"+t1.getPriority());
        //count the number of Threads active
        System.out.println(Thread.activeCount());
        t.start();
        //isAlive() method
        System.out.println(t.isAlive());
        System.out.println(Thread.currentThread());
    }
}
