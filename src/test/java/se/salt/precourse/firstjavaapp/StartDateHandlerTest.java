package se.salt.precourse.firstjavaapp;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static  org.junit.jupiter.api.Assertions.*;

class StartDateHandlerTest {
    @Test
    void returns2ForDateTwoDaysInTheFuture() {
        LocalDate twoDaysInTheFuture = LocalDate.now().plusDays(2);
        long two = new StartDateHandler().daysToCourseStart(twoDaysInTheFuture.toString());

        assertEquals(2, two);
    }
    @Test
    void checksDateHasOnlyNumbers(){
    boolean x= new StartDateHandler().dateHasOnlyNumbers("Kiran");
    boolean y = new StartDateHandler().dateHasOnlyNumbers("2024-05-06");
    boolean z = new StartDateHandler().dateHasOnlyNumbers("");
    assertFalse(x);
    assertTrue(y);
    assertFalse(z);
    }
}