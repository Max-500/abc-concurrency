package models;

public class Monitor {
    private boolean A;
    private boolean B;
    private boolean C;

    public Monitor() {
        this.A = true;
        this.B = false;
        this.C = false;
    }

    public synchronized void printA() {
        while (true) {
            while (!A) {
                System.out.println(Thread.currentThread().getName());
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("A");
            B = true;
            A = false;
            this.notifyAll();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printB() {
        while (true) {
            while (!B) {
                System.out.println(Thread.currentThread().getName());
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("B");
            B = false;
            C = true;
            this.notifyAll();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printC() {
        while (true) {
            while (!C) {
                System.out.println(Thread.currentThread().getName());
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("C");
            C = false;
            A = true;
            this.notifyAll();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Guardas booleanas