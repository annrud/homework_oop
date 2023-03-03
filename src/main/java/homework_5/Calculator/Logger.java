package homework_5.Calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void writeToFile(String msg){
        SimpleDateFormat dateFormat = new SimpleDateFormat("[d MMMM yyyy HH:mm]");
        Date date = new Date();
        try(FileWriter file = new FileWriter("Log.txt", true)) {
            StringBuilder sb = new StringBuilder();
            sb.append(dateFormat.format(date)).append(" ").append(msg).append("\n");
            file.write(sb.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
