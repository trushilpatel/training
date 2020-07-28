package Learn;

class count implements Runnable{
    Thread t;
    count(String threadName){
        t = new Thread(this,threadName);
        System.out.println(t);
    }
    public void run(){
        try {
            for(int i = 0; i< 7; i++){
                System.out.println(t.getName() + "\t" + i);
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}

class countWithThread extends Thread{
    countWithThread(String name){
        super(name);
    }

    public void run(){
        try {
            for(int i = 0; i< 7; i++){
                System.out.println(this.getName() + "\t" + i);
                Thread.sleep(500);
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

}



public class multithreadingExa {
    public static void main(String[] args) throws InterruptedException {
        count c1 = new count("First");
        count c2 = new count("Second");
        c1.t.start();
        System.out.println("1");
        c2.t.start();
        c1.t.join();
        System.out.println("2");
        c2.t.join();

        countWithThread swt1 = new countWithThread("swt1");
        countWithThread swt2 = new countWithThread("swt2");

        swt1.start();
        swt2.start();
        swt1.setPriority(Thread.MAX_PRIORITY);

        System.out.println(Thread.currentThread());
    }
}
