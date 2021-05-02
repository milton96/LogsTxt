package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LOG {
    public static final String ERROR = "ERROR";
    public static final String INFO = "INFO";
    public static final String WARNING = "WARNING";
    private static final String PATH = "LOGS/";
    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    public static void Add(String type, String msg) {
        try {
            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter dateTime_format = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
            DateTimeFormatter date_format = DateTimeFormatter.ofPattern(DATE_FORMAT);
            String filename = PATH + date.format(date_format) + ".txt";
            File file = new File(PATH);

            if (!file.exists()) {
                boolean ok = file.mkdirs();
            }

            String text = date.format(dateTime_format) + " - " + type + " - " + msg + "\n";

            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            writer.write(text);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}