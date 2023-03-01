package homework_3;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("d MMMM yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        Task task = new Task("Выключить печь");
        LowPriority lowPriority = new LowPriority();
        MediumPriority mediumPriority = new MediumPriority();
        HighPriority highPriority = new HighPriority();

        GregorianCalendar deadline = new GregorianCalendar();
        deadline.roll(Calendar.MONTH, +0);
        deadline.roll(Calendar.HOUR_OF_DAY, +0);
        deadline.roll(Calendar.MINUTE, +10);
        Date dateDeadline = deadline.getTime();

        Author author = new Author("Анна", "Попова", "Владимировна");

        Recording rec = new Recording(
                dayFormat.format(date),
                timeFormat.format(date),
                task,
                dayFormat.format(dateDeadline),
                timeFormat.format(dateDeadline),
                author,
                highPriority
        );
        rec.writeToFile();
        List<List<String>> records = rec.readCSVFile();
        ParameterComparison recSort = new ParameterComparison(records);
        recSort.sortByDate(timeFormat, 5);
        recSort.sortByDate(dayFormat, 4);
        recSort.sorByPriority();
        records.forEach(System.out::println);
    }
}
