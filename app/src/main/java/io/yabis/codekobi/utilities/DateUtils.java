package io.yabis.codekobi.utilities;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Tarih formatlama, karsilastirma gibi metodlari barindirir
 * 
 * @author akaplan
 *
 */

@SuppressLint("SimpleDateFormat")
public final class DateUtils {

	private static SimpleDateFormat simpleDateFormat;

	public static String formatDateToString_D_MonthName_Year(Date date) {
		simpleDateFormat = new SimpleDateFormat("d MMMM yyyy");
		return simpleDateFormat.format(date);
	}

	public static String formatDateToString_DD_MM_YYYY(Date date) {
		simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
		return simpleDateFormat.format(date);
	}

	/**
	 * Şimdiki tarihi verir
	 * 
	 * @return
	 */
	public static Date getCurrentDate() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}

	/**
	 * 31 Aralik 2010 tarihini doner
	 * 
	 * @return
	 */
	public static Date getMaxDateForBirthdaySpinners() {
		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.YEAR, 2010);
		calendar.set(Calendar.MONTH, Calendar.DECEMBER);
		calendar.set(Calendar.DAY_OF_MONTH, 31);
		return calendar.getTime();
	}

	/**
	 * 1 Ocak 1980 tarihini doner
	 * 
	 * @return
	 */
	public static Date get1980() {
		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.YEAR, 1980);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DAY_OF_MONTH, 1);

		return calendar.getTime();
	}

	/**
	 * 100 yil oncesini verir
	 * 
	 * @return
	 */
	public static Date get100YearAgo() {
		Calendar currentCalendar = Calendar.getInstance();
		currentCalendar.add(Calendar.YEAR, -100);
		Date centuryAgo = currentCalendar.getTime();
		return centuryAgo;
	}

	/**
	 * Şuan ki zamanı yyyy-MM-dd'T'HH:mm:ssZZZZZ formatında verir
	 * 
	 * @return
	 */
	public static String getCurrentFormattedTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ");
		return dateFormat.format(new Date());
	}

	public static String getCurrentFormattedTimeForMixpanel() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		return dateFormat.format(new Date());
	}
}
