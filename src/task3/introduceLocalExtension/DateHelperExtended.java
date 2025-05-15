package task3.introduceLocalExtension;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateHelperExtended {
    public static long daysBetween(Date startDate, Date endDate) {
        long diffInMillis = endDate.getTime() - startDate.getTime();
        return TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
    }
}
