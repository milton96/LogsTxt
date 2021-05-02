package main;

public class Main {
    public static void main(String[] args) {
        try {
            LOG.Add(LOG.ERROR, "Mensaje para LOG.ERROR");
            System.out.println("Agregando datos...");
            PAUSE.Stop();

            LOG.Add(LOG.INFO, "Mensaje para LOG.INFO");
            PAUSE.Stop();
            System.out.println("Agregando datos...");

            LOG.Add(LOG.WARNING, "Mensaje para LOG.WARNING");
            System.out.println("Agregando datos...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
