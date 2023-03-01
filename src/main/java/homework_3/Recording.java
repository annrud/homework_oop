package homework_3;

import lombok.Getter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

@Getter
public class Recording<T>{
    private String day;
    private String time;
    private Task task;
    private String deadlineDay;
    private String deadlineTime;
    private Author author;
    private T priority;


    public Recording(String day, String time, Task task, String deadlineDay, String deadlineTime, Author author, T priority) {
        this.day = day;
        this.time = time;
        this.task = task;
        this.deadlineDay = deadlineDay;
        this.deadlineTime = deadlineTime;
        this.author = author;
        this.priority = priority;
    }

    public void writeToFile(){
        try {
            File f = new File("taskManager.csv");
            FileReader fileReader = new FileReader(f);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
            int lineNumber = 1;
            while (lineNumberReader.readLine() != null) {
                lineNumber++;
            }
            HashMap<String, String> priorityTranslate = new HashMap<>();
            priorityTranslate.put("High", "1");
            priorityTranslate.put("Medium", "2");
            priorityTranslate.put("Low", "3");

            FileWriter writer = new FileWriter(f, true);
            StringBuilder sb = new StringBuilder();
            sb.append(lineNumber).append(";");
            sb.append(this.day).append(";").append(this.time).append(";");
            sb.append(this.task).append(";");
            sb.append(this.deadlineDay).append(";").append(this.deadlineTime).append(";");
            sb.append(this.author.getFullName()).append(";");
            sb.append(priorityTranslate.get(this.priority.toString())).append("\n");
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public List<List<String>> readCSVFile(){
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("taskManager.csv"))) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return records;
    }


    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(";");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}
