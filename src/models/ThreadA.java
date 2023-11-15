package models;

public class ThreadA implements Runnable {
    private Monitor monitor;

    public ThreadA(Monitor monitor){
        this.monitor = monitor;
    }

    @Override
    public void run() {
        monitor.printA();
    }
    
}
