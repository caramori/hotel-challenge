package model.types;

import java.time.DayOfWeek;
import java.time.LocalDate;

public enum WeekDayType {

    WEEKDAY, WEEKEND;

    public static WeekDayType fromDate(LocalDate date){
        boolean saturdayOrSunday = date.getDayOfWeek() == DayOfWeek.SATURDAY ||
                                    date.getDayOfWeek() == DayOfWeek.SUNDAY;
        return saturdayOrSunday ? WEEKEND : WEEKDAY;

    }
}
