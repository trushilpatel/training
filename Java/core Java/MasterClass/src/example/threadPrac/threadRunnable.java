package example.threadPrac;

class ThreadExa implements Runnable {
    Thread t ;
    String s;

    ThreadExa(String s, int p){
        t = new Thread(this,s);
        t.setPriority(p);
        this.s = s;
        System.out.println(t);
    }

    public void run(){
        try {
            for (int i = 0; i<5; i++) {
                System.out.println(s + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class threadRunnable {
    public static void main(String[] args) throws InterruptedException {
        ThreadExa te1 = new ThreadExa("C1", 8);
        ThreadExa te2 = new ThreadExa("C2", 3);

        te1.t.start();
        System.out.println("hello");
        te2.t.start();

        Thread t = Thread.currentThread();
        System.out.println(t);

        for (int i = 0; i< 5; i++){
            System.out.println("Main : " + i);
            Thread.sleep(1000);
        }

    }
}
