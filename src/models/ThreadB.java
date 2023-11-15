package models;

public class ThreadB implements Runnable {
    private Monitor monitor;

    public ThreadB(Monitor monitor){
        this.monitor = monitor;
    }

    @Override
    public void run() {
        monitor.printB();
    }
    
}
