package sergey_white.org.patterns.singleton;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public enum Logger {

    INSTANCE;

    public void classLogg(Object obj, String info) {
        String timeLogg = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        System.out.printf("Log info: %s - %s - %s", timeLogg, obj.getClass().getName(), info);
    }
}
