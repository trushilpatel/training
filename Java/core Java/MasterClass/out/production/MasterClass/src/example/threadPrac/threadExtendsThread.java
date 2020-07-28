package example.threadPrac;

import java.io.PrintStream;

class ThreadExam extends Thread{
    ThreadExam(String s){
        super(s);
    }

    public void run(){
        try {
            for(int i=0; i< 5; i++){
                System.out.println(this.getName() + " " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

public class threadExtendsThread {
    public static void main(String[] args) {
        ThreadExam te1 = new ThreadExam("C1");
        te1.start();
        Thread t = Thread.currentThread();

        try{
            te1.join(0);
            for(int i=0 ; i< 5; i++){
                System.out.println(t.getName() + " " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
