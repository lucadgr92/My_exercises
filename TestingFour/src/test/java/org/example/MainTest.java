package org.example;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void fromStringToDateNullInput() {
        String nullString = null;
        assertThrows(NullPointerException.class,
                () -> Main.fromStringToDate(nullString));
    }

    @org.junit.jupiter.api.Test
    void fromStringToDateEmptyStringInput() {
        String emptyString = "";
        assertThrows(DateTimeParseException.class,
                () -> Main.fromStringToDate(emptyString));
    }

    @org.junit.jupiter.api.Test
    void fromStringToDateBlankStringInput() {
        String blankString = " ";
        assertThrows(DateTimeParseException.class,
                () -> Main.fromStringToDate(blankString));
    }

    @org.junit.jupiter.api.Test
    void fromStringToDateRegularStringInput() {
        String regularString = "2023-03-01T13:00:00Z";
        assertEquals(OffsetDateTime.parse(regularString), Main.fromStringToDate(regularString));
    }

    @org.junit.jupiter.api.Test
    void fromStringToDateLeadingWhiteSpaceString() {
        String leadingWhiteSpaceString = " 2023-03-01T13:00:00Z";
        assertThrows(DateTimeParseException.class,
                () -> Main.fromStringToDate(leadingWhiteSpaceString));
    }

    @org.junit.jupiter.api.Test
    void fromStringToDateTrailingWhiteSpaceString() {
        String trailingWhiteSpaceString = "2023-03-01T13:00:00Z ";
        assertThrows(DateTimeParseException.class,
                () -> Main.fromStringToDate(trailingWhiteSpaceString));
    }

    @org.junit.jupiter.api.Test
    void fromStringToDateIrregularString() {
        String irregularString = " 2023-01T13:00:00Z";
        assertThrows(DateTimeParseException.class,
                () -> Main.fromStringToDate(irregularString));
    }

    @org.junit.jupiter.api.Test
    void fromOffsetToYearNullInput() {
        OffsetDateTime nullDate = null;
        assertThrows(NullPointerException.class,
                () -> Main.fromOffsetToYear(nullDate));
    }

    @org.junit.jupiter.api.Test
    void fromOffsetToYearRegularInput() {
        String testString = "2023-03-01T13:00:00Z";
        assertEquals(2023, Main.fromOffsetToYear(Main.fromStringToDate(testString)));
    }


    @org.junit.jupiter.api.Test
    void fromOffsetToMonthValueNullInput() {
        OffsetDateTime nullDate = null;
        assertThrows(NullPointerException.class,
                () -> Main.fromOffsetToMonthValue(nullDate));
    }

    @org.junit.jupiter.api.Test
    void fromOffsetToMonthValueRegularInput() {
        String testString = "2023-03-01T13:00:00Z";
        assertEquals(3, Main.fromOffsetToMonthValue(Main.fromStringToDate(testString)));
    }


    @org.junit.jupiter.api.Test
    void fromOffsetToDayOfMonthNullInput() {
        OffsetDateTime nullDate = null;
        assertThrows(NullPointerException.class,
                () -> Main.fromOffsetToDayOfMonth(nullDate));
    }

    @org.junit.jupiter.api.Test
    void fromOffsetToDayOfMonthRegularInput() {
        String testString = "2023-03-01T13:00:00Z";
        assertEquals(1, Main.fromOffsetToDayOfMonth(Main.fromStringToDate(testString)));
    }

    @org.junit.jupiter.api.Test
    void fromOffsetToDayOfWeekNullInput() {
        OffsetDateTime nullDate = null;
        assertThrows(NullPointerException.class,
                () -> Main.fromOffsetToDayOfWeek(nullDate));
    }

    @org.junit.jupiter.api.Test
    void fromOffsetToDayOfWeekRegularInput() {
        String testString = "2023-03-01T13:00:00Z";
        assertEquals("mercoledì", Main.fromOffsetToDayOfWeek(Main.fromStringToDate(testString)));
    }

}