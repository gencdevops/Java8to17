package java9.privatemethodsinterface;

import java.time.LocalDate;

//Example of private methods in an interface.
public interface HolidayCalendar {

    //Default method Java8de gelmisti

    boolean isHoliday(LocalDate date);

    default boolean isBusinessDay(LocalDate date){
        validate(date);
        return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date){
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate) : nextDate;
    }

    // since Java9
    private void validate(LocalDate date){
        if (date.isBefore(LocalDate.of(2001, 1, 1))) {
            throw new IllegalArgumentException();
        }
    }


}
