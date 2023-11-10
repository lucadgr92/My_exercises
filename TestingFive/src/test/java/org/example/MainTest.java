package org.example;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void firstDateMakerNullInput() {
        String nullString = null;
        assertThrows(NullPointerException.class,
                () -> Main.firstDateMaker(nullString));
    }

    @org.junit.jupiter.api.Test
    void firstDateMakerEmptyStringInput() {
        String emptyString = "";
        assertThrows(DateTimeParseException.class,
                () -> Main.firstDateMaker(emptyString));
    }

    @org.junit.jupiter.api.Test
    void firstDateMakerBlankStringInput() {
        String blankString = " ";
        assertThrows(DateTimeParseException.class,
                () -> Main.firstDateMaker(blankString));
    }

    @org.junit.jupiter.api.Test
    void firstDateMakerRegularStringInput() {
        String regularString = "2023-03-01T13:00:00Z";
        assertEquals(OffsetDateTime.parse(regularString), Main.firstDateMaker(regularString));
    }

    @org.junit.jupiter.api.Test
    void firstDateMakerLeadingWhiteSpaceString() {
        String leadingWhiteSpaceString = " 2023-03-01T13:00:00Z";
        assertThrows(DateTimeParseException.class,
                () -> Main.firstDateMaker(leadingWhiteSpaceString));
    }

    @org.junit.jupiter.api.Test
    void firstDateMakerTrailingWhiteSpaceString() {
        String trailingWhiteSpaceString = "2023-03-01T13:00:00Z ";
        assertThrows(DateTimeParseException.class,
                () -> Main.firstDateMaker(trailingWhiteSpaceString));
    }

    @org.junit.jupiter.api.Test
    void firstDateMakerIrregularSpaceString() {
        String trailingWhiteSpaceString = "2023-01T13:00:00Z ";
        assertThrows(DateTimeParseException.class,
                () -> Main.firstDateMaker(trailingWhiteSpaceString));
    }

    @org.junit.jupiter.api.Test
    void secondDateMakerNullInput() {
        String nullString = null;
        assertThrows(NullPointerException.class,
                () -> Main.secondDateMaker(nullString));
    }

    @org.junit.jupiter.api.Test
    void secondDateMakerEmptyStringInput() {
        String emptyString = "";
        assertThrows(DateTimeParseException.class,
                () -> Main.secondDateMaker(emptyString));
    }

    @org.junit.jupiter.api.Test
    void secondDateMakerBlankStringInput() {
        String blankString = " ";
        assertThrows(DateTimeParseException.class,
                () -> Main.firstDateMaker(blankString));
    }

    @org.junit.jupiter.api.Test
    void secondDateMakerRegularStringInput() {
        String regularString = "2024-03-01T13:00:00Z";
        assertEquals(OffsetDateTime.parse(regularString), Main.secondDateMaker(regularString));
    }

    @org.junit.jupiter.api.Test
    void secondDateMakerLeadingWhiteSpaceString() {
        String leadingWhiteSpaceString = " 2024-03-01T13:00:00Z";
        assertThrows(DateTimeParseException.class,
                () -> Main.secondDateMaker(leadingWhiteSpaceString));
    }

    @org.junit.jupiter.api.Test
    void secondDateMakerTrailingWhiteSpaceString() {
        String trailingWhiteSpaceString = "2024-03-01T13:00:00Z ";
        assertThrows(DateTimeParseException.class,
                () -> Main.secondDateMaker(trailingWhiteSpaceString));
    }

    @org.junit.jupiter.api.Test
    void secondDateMakerIrregularSpaceString() {
        String trailingWhiteSpaceString = "2023-01T13:00:00Z ";
        assertThrows(DateTimeParseException.class,
                () -> Main.secondDateMaker(trailingWhiteSpaceString));
    }

    @org.junit.jupiter.api.Test
    void beforeCheckRegularInput() {
        OffsetDateTime testDate1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime testDate2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        assertEquals(testDate1.isBefore(testDate2), Main.beforeCheck(testDate1, testDate2));
    }


    @org.junit.jupiter.api.Test
    void beforeCheckNullInputOne() {
        OffsetDateTime testDate1 = null;
        OffsetDateTime testDate2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        assertThrows(NullPointerException.class,
                () -> Main.beforeCheck(testDate1, testDate2));
    }

    @org.junit.jupiter.api.Test
    void beforeCheckNullInputTwo() {
        OffsetDateTime testDate1 =  OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime testDate2 = null;
        assertThrows(NullPointerException.class,
                () -> Main.beforeCheck(testDate1, testDate2));
    }

    @org.junit.jupiter.api.Test
    void afterCheckRegularInput() {
        OffsetDateTime testDate1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime testDate2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        assertEquals(testDate2.isAfter(testDate1), Main.beforeCheck(testDate1, testDate2));
    }

    @org.junit.jupiter.api.Test
    void afterCheckNullInputOne() {
        OffsetDateTime testDate1 = null;
        OffsetDateTime testDate2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        assertThrows(NullPointerException.class,
                () -> Main.afterCheck(testDate1, testDate2));
    }

    @org.junit.jupiter.api.Test
    void afterCheckNullInputTwo() {
        OffsetDateTime testDate1 =  OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime testDate2 = null;
        assertThrows(NullPointerException.class,
                () -> Main.afterCheck(testDate1, testDate2));
    }


    @org.junit.jupiter.api.Test
    void nowCheckOneRegularInput() {
        OffsetDateTime testDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(testDate.isEqual(OffsetDateTime.now()), Main.nowCheckOne(testDate));
    }

    @org.junit.jupiter.api.Test
    void nowCheckOneNullInput() {
        OffsetDateTime testDate = null;
        assertThrows(NullPointerException.class,
                () -> Main.nowCheckOne(testDate));
    }

    @org.junit.jupiter.api.Test
    void nowCheckTwoRegularInput() {
        OffsetDateTime testDate = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        assertEquals(testDate.isEqual(OffsetDateTime.now()), Main.nowCheckTwo(testDate));
    }

    @org.junit.jupiter.api.Test
    void nowCheckTwoNullInput() {
        OffsetDateTime testDate = null;
        assertThrows(NullPointerException.class,
                () -> Main.nowCheckTwo(testDate));
    }
}