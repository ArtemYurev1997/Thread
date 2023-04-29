package by.pvt.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
      Threads thread1 = new Threads("Поток1");
      Threads thread2 = new Threads("Поток2");
      Threads thread3 = new Threads("Поток3");
      Threads thread4 = new Threads("Поток4");
      Threads thread5 = new Threads("Поток5");
      Threads thread6 = new Threads("Поток6");
      Threads thread7 = new Threads("Поток7");
      Threads thread8 = new Threads("Поток8");
      Threads thread9 = new Threads("Поток9");
      Threads thread10 = new Threads("Поток10");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        Auto auto1 = new Auto(500L, "BMW");
        Auto auto2 = new Auto(500L, "Mercedes");
        Auto auto3 = new Auto(500L, "Volkswagen");
        Thread autoThread1 = new Thread(auto1);
        Thread autoThread2 = new Thread(auto2);
        Thread autoThread3 = new Thread(auto3);
        autoThread1.start();
        autoThread1.join();
        autoThread2.start();
        autoThread3.start();

    }
}
