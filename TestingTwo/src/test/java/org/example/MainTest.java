package org.example;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
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
        String regularString = "2002-03-01T13:00:00Z";
        assertEquals(OffsetDateTime.parse(regularString).toZonedDateTime(), Main.fromStringToDate(regularString));
    }

    @org.junit.jupiter.api.Test
    void fromStringToDateLeadingWhiteSpaceString() {
        String leadingWhiteSpaceString = " 2002-03-01T13:00:00Z";
        assertThrows(DateTimeParseException.class,
                () -> Main.fromStringToDate(leadingWhiteSpaceString));
    }

    @org.junit.jupiter.api.Test
    void fromStringToDateTrailingWhiteSpaceString() {
        String trailingWhiteSpaceString = "2002-03-01T13:00:00Z ";
        assertThrows(DateTimeParseException.class,
                () -> Main.fromStringToDate(trailingWhiteSpaceString));
    }

    @org.junit.jupiter.api.Test
    void fromStringToDateIrregularString() {
        String irregularString = " 2002-01T13:00:00Z";
        assertThrows(DateTimeParseException.class,
                () -> Main.fromStringToDate(irregularString));
    }

    @org.junit.jupiter.api.Test
    void toStringLongNullInput() {
        ZonedDateTime nullDateTime = null;
        assertThrows(NullPointerException.class,
                () -> Main.toStringLong(nullDateTime));
    }

    @org.junit.jupiter.api.Test
    void toStringLongRegularInput() {
        ZonedDateTime testDate = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        assertEquals(testDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)), Main.toStringLong(testDate));
    }

    @org.junit.jupiter.api.Test
    void toStringMediumNullInput() {
        ZonedDateTime nullDateTime = null;
        assertThrows(NullPointerException.class,
                () -> Main.toStringMedium(nullDateTime));
    }

    @org.junit.jupiter.api.Test
    void toStringMediumRegularInput() {
        ZonedDateTime testDate = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        assertEquals(testDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)), Main.toStringMedium(testDate));
    }

    @org.junit.jupiter.api.Test
    void toStringShortNullInput() {
        ZonedDateTime nullDateTime = null;
        assertThrows(NullPointerException.class,
                () -> Main.toStringShort(nullDateTime));
    }

    @org.junit.jupiter.api.Test
    void toStringShortRegularInput() {
        ZonedDateTime testDate = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        assertEquals(testDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)), Main.toStringShort(testDate));
    }
}