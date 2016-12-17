package io.yabis.codekobi.utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

public final class ResourcesUtils {

	/**
	 * Drawable i bulur
	 * 
	 * @param activity
	 * @param drawableID
	 * @return
	 */
	public static Drawable getDrawable(Activity activity, Integer drawableID) {
		if (drawableID == null) {
			return null;
		}
		return activity.getResources().getDrawable(drawableID);
	}

	/**
	 * String i bulur
	 * 
	 * @param activity
	 * @param stringID
	 * @return
	 */
	public static String getString(Activity activity, Integer stringID) {
		if (stringID == null) {
			return "";
		}
		return activity.getResources().getString(stringID);
	}

	public static String getString(Context context, Integer stringID) {
		if (stringID == null) {
			return "";
		}
		return context.getResources().getString(stringID);
	}

	/**
	 * String.xml de bulunan %1s formatlarini doldurarak , string doner
	 * 
	 * @param activity
	 * @param stringID
	 * @param strings
	 * @return
	 */
	public static String getString(Activity activity, Integer stringID, Object... strings) {
		if (stringID == null) {
			return "";
		}
		return activity.getResources().getString(stringID, strings);
	}

	/**
	 * String array doner
	 * 
	 * @param activity
	 * @param stringArrayID
	 * @return
	 */
	public static String[] getStringArray(Activity activity, Integer stringArrayID) {
		if (stringArrayID == null) {
			return null;
		}
		return activity.getResources().getStringArray(stringArrayID);
	}

	/**
	 * Renk bulur
	 * 
	 * @param activity
	 * @param colorID
	 * @return
	 */
	public static Integer getColor(Activity activity, Integer colorID) {
		if (colorID == null) {
			return 0;
		}
		return activity.getResources().getColor(colorID);
	}

	/**
	 * Çözünürlüğe bağlı olarak uzunluğu doner
	 * 
	 * @param activity
	 * @param dimenID
	 * @return
	 */
	public static Integer getDimen(Activity activity, Integer dimenID) {
		if (dimenID == null) {
			return 0;
		}
		return (int) (activity.getResources().getDimension(dimenID) / activity.getResources().getDisplayMetrics().density);
	}

}
