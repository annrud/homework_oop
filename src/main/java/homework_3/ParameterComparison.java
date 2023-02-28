package homework_3;

import lombok.Getter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Getter
public class ParameterComparison {
    private List<List<String>> records;

    public ParameterComparison(List<List<String>> records) {
        this.records = records;
    }

    public void sortByDate(SimpleDateFormat format, int index) {

        records.sort((o1, o2) -> {
            Date date1;
            Date date2;
            try {
                date1 = format.parse(o1.get(index));
                date2 = format.parse(o2.get(index));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            return date1.compareTo(date2);
        });
    }

    public void sorByPriority(){
        records.sort(Comparator.comparing(o -> o.get(o.size() - 1)));
    }

}
