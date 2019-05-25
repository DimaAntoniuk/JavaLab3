package ua.lviv.iot.museum.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void compareToTest() {
        Date firstDate = new Date(1, 1, 1);
        Date secondDate = new Date(2, 2, 2);
        assertEquals(secondDate.compareTo(firstDate), 1);
    }
}