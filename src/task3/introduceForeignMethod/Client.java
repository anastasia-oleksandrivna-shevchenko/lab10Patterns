package task3.introduceForeignMethod;

import java.util.Calendar;

public class Client {

    public void doSomething() {
        Calendar currentDate = Calendar.getInstance();

        if (isWeekend(currentDate)) {
            System.out.println("It's weekend!");
        } else {
            System.out.println("It's not weekend!");
        }
    }

    // Foreign Method – додана до Client, хоч працює з Calendar
    public boolean isWeekend(Calendar date) {
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;
    }
}
