package Learn;

class quantity{
    int n = 0;
    boolean consumable = false;

    synchronized int get() {
        while (!consumable){
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Consumed : " + n);
        notify();
        consumable = false;
        return n;
    }

    synchronized void put(){
        while (consumable){
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
        n++;
        consumable = true;
        notify();
        System.out.println("Produced " + n);
    }
}

class producer implements Runnable{
    quantity q;
    Thread t ;

    producer(quantity q){
        this.q = q;
        t = new Thread(this,"Producer");
    }


    @Override
    public void run() {
     while(q.n < 10)    {
            q.put();
        }
        }
    }

class consumer implements Runnable{
    quantity q;
    Thread t;
    consumer(quantity q){
        this.q = q;
        t = new Thread(this,"Consumer");
    }

    @Override
    public void run() {
        while(q.n < 10)q.get();
    }
}

public class producerConsumer {
    public static void main(String[] args) {
        quantity q = new quantity();
        producer p = new producer(q);
        consumer c = new consumer(q);

        p.t.start();
        c.t.start();
    }
}
