package se.salt.precourse.firstjavaapp;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static  org.junit.jupiter.api.Assertions.*;

class StartDateHandlerTest {
    @Test
    void returns2ForDateDwoDaysInTheFuture() {
        LocalDate twoDaysInTheFuture = LocalDate.now().plusDays(2);
        long two = new StartDateHandler().daysToCourseStart(twoDaysInTheFuture.toString());

        assertEquals(2, two);
    }
}