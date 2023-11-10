package org.example;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

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
    void dateFormatterNullInput() {
        OffsetDateTime nullDate = null;
        assertThrows(NullPointerException.class,
                () -> Main.dateFormatter(nullDate));
    }

    @org.junit.jupiter.api.Test
    void dateFormatterRegularInput() {
        OffsetDateTime testDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String testString = testDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        assertEquals(testString, Main.dateFormatter(testDate));
    }
}