package task3.introduceLocalExtension;

import java.util.Calendar;
import java.util.Date;

public class DateHelper {
    public static Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, days);
        return cal.getTime();
    }
}
