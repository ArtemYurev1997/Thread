package by.pvt.thread;


public class Auto implements Runnable {
    private Long millis;
    private String name;

    public Auto(Long millis, String name) {
        this.millis = millis;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(millis);
            for (int i = 0; i < 50; i++) {
                System.out.println(name + " едет " + i + " раз");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
