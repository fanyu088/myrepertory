package com.example.Util;

import com.google.common.collect.Maps;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import static java.util.Calendar.*;

public class TimeUtil {

	public static final ZoneOffset zoneOffset = ZoneOffset.of("+8");

	public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";

	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

	public static final String DEFAULT_TIME_PATTERN = "HH:mm:ss";

	private static final Map<String, DateTimeFormatter> FORMATTER_MAP = Maps.newConcurrentMap();

	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	static {
		FORMATTER_MAP.put(DEFAULT_PATTERN, DateTimeFormatter.ofPattern(DEFAULT_PATTERN));

	}

	public static DateTimeFormatter getDateTimeFormatter(String pattern) {
		if (FORMATTER_MAP.containsKey(pattern)) {
			return FORMATTER_MAP.get(pattern);
		}
		synchronized (FORMATTER_MAP) {
			if (FORMATTER_MAP.containsKey(pattern)) {
				return FORMATTER_MAP.get(pattern);
			} else {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
				FORMATTER_MAP.put(pattern, formatter);
				return formatter;
			}
		}
	}

	public static long getTime(String time) {
		time = getToday("-") + " " + time;
		LocalDateTime localDateTime = LocalDateTime.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return localDateTimeToTimestamp(localDateTime);
	}

	public static long getTime(String date, String time) throws ParseException {
		LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalTime localTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		return localDateTimeToTimestamp(localDateTime);
	}

	public static long getTime(LocalDate localDate, LocalTime localTime) {
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		return localDateTimeToTimestamp(localDateTime);
	}

	public static long getYearStartTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String time = String.format("%s-01-01 00:00:00", sdf.format(new Date()));
		LocalDateTime localDateTime = LocalDateTime.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return localDateTimeToTimestamp(localDateTime);
	}

	public static long getYearEndTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String time = String.format("%s-12-31 23:59:59", sdf.format(new Date()));
		LocalDateTime localDateTime = LocalDateTime.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return localDateTimeToTimestamp(localDateTime);
	}

	public static String getToday() {
		return getToday("");
	}

	public static String getToday(String separator) {
		String pattern = "yyyy" + separator + "MM" + separator + "dd";
		return format(LocalDate.now(), pattern);
	}

	public static String getYesterday(String separator) {
		String pattern = "yyyy" + separator + "MM" + separator + "dd";
		Calendar calendar = Calendar.getInstance();
		calendar.add(DATE, -1);
		LocalDate localDate = LocalDate.of(calendar.get(YEAR), calendar.get(MONTH) + 1, calendar.get(DATE));
		return format(localDate, pattern);
	}

	public static String getYesterday() {
		return getYesterday("");
	}

	public static String getTomorrow(String separator) {
		String pattern = "yyyy" + separator + "MM" + separator + "dd";
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 1);
		LocalDate localDate = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DATE));
		return format(localDate, pattern);
	}

	public static String getTomorrow() {
		return getTomorrow("");
	}

	public static String getNow() {
		return getNow("yyyy-MM-dd HH:mm:ss");
	}

	public static String getNow(String pattern) {
		return format(LocalDateTime.now(), pattern);
	}

	public static String format(LocalDateTime localDateTime, String pattern) {
		return localDateTime.format(DateTimeFormatter.ofPattern(pattern));
	}

	public static String format(LocalDate localDate, String pattern) {
		return localDate.format(DateTimeFormatter.ofPattern(pattern));
	}

	public static String format(LocalTime localTime, String pattern) {
		return localTime.format(DateTimeFormatter.ofPattern(pattern));
	}

	public static String formatTime(String pattern, long timestamp) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(new Date(timestamp));
	}

	public static String[] formatTime(String pattern, long... timestamps) {
		String[] results = new String[timestamps.length];
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		int i = 0;
		for (long timestamp : timestamps) {
			results[i] = format.format(new Date(timestamp));
			i++;
		}
		return results;
	}

	public static long localDateTimeToTimestamp(LocalDateTime localDateTime) {
		return localDateTime.toInstant(zoneOffset).toEpochMilli();
	}


	//yyyy-MM-dd HH:mm:ss 格式转成 时间戳

	public static long toTimestamp(String time) {
		SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_PATTERN);
		Date date;
		long sTime = 0;
		try {
			date = sdf.parse(time);
			sTime = date.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sTime;
	}

	/*
	 * 将时间转换为时间戳
	 */
	public static long dateToTimestamp(String s) {
		Date date = null;
		try {
			date = simpleDateFormat.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date.getTime();
	}

	/*
	 * 将时间戳转换为时间字符串
	 */
	public static String stampToDate(long s){
		String res;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_PATTERN);
		Date date = new Date(s);
		res = simpleDateFormat.format(date);
		return res;
	}

}
