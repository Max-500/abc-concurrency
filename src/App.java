import models.Monitor;
import models.ThreadA;
import models.ThreadB;
import models.ThreadC;

public class App {
    public static void main(String[] args) throws Exception {
        Monitor abc = new Monitor();
        Thread h1 = new Thread(new ThreadA(abc));
        Thread h2 = new Thread(new ThreadB(abc));
        Thread h3 = new Thread(new ThreadC(abc));
        h1.start();
        h2.start();
        h3.start();
    }
}