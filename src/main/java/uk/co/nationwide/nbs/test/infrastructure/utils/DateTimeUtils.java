package uk.co.nationwide.nbs.test.infrastructure.utils;

import org.joda.time.DateTimeZone;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.zone.ZoneRules;

public class DateTimeUtils {

    private DateTimeUtils() {
    }

    public static final String DATE_TIME_FORMAT_WITH_MILLISEC_AND_ZONE = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    public static final String DATE_TIME_FORMAT_WITHOUT_MILLISEC = "yyyy-MM-dd'T'HH:mm:ssXXX";
    public static final String DATE_TIME_FORMAT_WITHOUT_MILLISEC_AND_ZONE = "yyyy-MM-dd'T'HH:mm:ss";
    public static final String DATE_FORMAT_DATE_ONLY = "yyyy-MM-dd";
    public static final String TIME_FORMAT_TIME_ONLY = "HH:mm:ss";
    public static final String DEFAULT_DATE_TIME_FORMAT = DATE_TIME_FORMAT_WITHOUT_MILLISEC;


    public static ZonedDateTime getCurrentDateTimeNow() {
        return ZonedDateTime.now().withZoneSameLocal(ZoneId.of("UTC")).withFixedOffsetZone();
    }

    public static String formatDateTime(ZonedDateTime dateTime) {
        return formatDateTime(dateTime, DEFAULT_DATE_TIME_FORMAT);
    }

    public static String formatDateTime(ZonedDateTime dateTime, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return dateTime.format(formatter);
    }

    public static ZonedDateTime parseDateTime(String dateTime, String format) {
        switch (format) {
            case DATE_TIME_FORMAT_WITH_MILLISEC_AND_ZONE:
            case DATE_TIME_FORMAT_WITHOUT_MILLISEC:
                return ZonedDateTime.parse(dateTime);
            case DATE_TIME_FORMAT_WITHOUT_MILLISEC_AND_ZONE:
                LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
                return ZonedDateTime.of(localDateTime, ZoneId.systemDefault()).withFixedOffsetZone();
            case DATE_FORMAT_DATE_ONLY:
                LocalDate localDate = LocalDate.parse(dateTime);
                LocalTime localTime = LocalTime.of(0, 0);
                return ZonedDateTime.of(localDate, localTime, ZoneId.systemDefault()).withFixedOffsetZone();
            case TIME_FORMAT_TIME_ONLY:
                localTime = LocalTime.parse(dateTime);
                localDate = LocalDate.ofEpochDay(0); //this date part SHOULD NOT be used later on
                return ZonedDateTime.of(localDate, localTime, ZoneId.systemDefault()).withFixedOffsetZone();
            default:
                return null;
        }
    }

    public static String getZoneText(ZonedDateTime dateTime) {
        ZoneRules zoneRules = dateTime.getZone().getRules();
        return zoneRules.getOffset(dateTime.toInstant()).getId();
    }

    public static Boolean isSameDay(ZonedDateTime dateToCompare) {
        ZonedDateTime now = DateTimeUtils.getCurrentDateTimeNow();
        ZonedDateTime startOfTheDay = now.truncatedTo(ChronoUnit.DAYS);
        ZonedDateTime endOfTheDay = now.plusDays(1).truncatedTo(ChronoUnit.DAYS).minusMinutes(1);
        return (dateToCompare.toLocalDate().equals(startOfTheDay.toLocalDate()) || dateToCompare.isAfter(startOfTheDay))
                && dateToCompare.isBefore(endOfTheDay);
    }

    public static boolean isDateTimeWinterTime(ZonedDateTime dateTime) {
        DateTimeZone zone = DateTimeZone.forID(dateTime.getZone().getId());
        return zone.isStandardOffset(dateTime.toInstant().toEpochMilli());
    }
}