package models;

public class ThreadC implements Runnable {
    private Monitor monitor;

    public ThreadC(Monitor monitor){
        this.monitor = monitor;
    }

    @Override
    public void run() {
        monitor.printC();
    }
    
}
