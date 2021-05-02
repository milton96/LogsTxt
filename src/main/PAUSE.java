package main;

public class PAUSE {
    private static final int SECONDS = 5;
    public static void Stop() {
        try {
            Thread.sleep(SECONDS * 1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
