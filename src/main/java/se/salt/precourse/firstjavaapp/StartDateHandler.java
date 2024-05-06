package se.salt.precourse.firstjavaapp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class StartDateHandler {
    public long daysToCourseStart(String startDateInput){
        LocalDate targetdate= LocalDate.parse(startDateInput);
        LocalDate currentdate=LocalDate.now();
        long daysRemaining = ChronoUnit.DAYS.between(currentdate, targetdate);
        return daysRemaining;
    }
    public boolean dateHasOnlyNumbers(String startDateInput) {
        String[] dateParts = startDateInput.split("-");
        if (dateParts.length!=3 || dateParts[0].length()!=4 || dateParts[1].length()!=2 || dateParts[2].length()!=2 ) return false;
        for(String datePart : dateParts) {
            if(!StringUtils.isNumeric(datePart)) {
                return false;
            }
        }
        return true;
    }
}
