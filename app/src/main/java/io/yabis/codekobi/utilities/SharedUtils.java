package io.yabis.codekobi.utilities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Cihaza basit verileri kaydetmeye yarayan siniftir.
 * 
 * @author akaplan
 *
 */
@SuppressLint("CommitPrefEdits")
public final class SharedUtils {

	private static SharedPreferences prefs = null;
	private static SharedPreferences.Editor prefEditor = null;

	private static SharedPreferences getSharedPreferencesInstance(Context context) {
		if (prefs == null)
			prefs = PreferenceManager.getDefaultSharedPreferences(context);
		return prefs;
	}

	private static SharedPreferences.Editor getPreferencesEditorInstance(Context context) {
		if (prefs == null)
			prefs = PreferenceManager.getDefaultSharedPreferences(context);
		if (prefEditor == null)
			prefEditor = prefs.edit();
		return prefEditor;
	}

	/**
	 * Yerelden string veriyi getirir, eger boyle bir deger bulamazsa "" yollar
	 * 
	 * @param key
	 * @param context
	 * @return
	 */
	public static String getSharedString(String key, Context context) {
		return getSharedPreferencesInstance(context).getString(key, "");
	}

	/**
	 * Yerelden integer veriyi getirir, eger boyle bir deger bulamazsa "-1990"
	 * yollar
	 * 
	 * @param key
	 * @param context
	 * @return
	 */
	public static Integer getSharedInteger(String key, Context context) {
		return getSharedPreferencesInstance(context).getInt(key, 0);
	}

	/**
	 * Yerelden boolean veriyi getirir, eger boyle bir deger bulamazsa false
	 * yollar
	 * 
	 * @param key
	 * @param context
	 * @return
	 */
	public static boolean getSharedBoolean(String key, Context context) {
		return getSharedPreferencesInstance(context).getBoolean(key, false);
	}

	/**
	 * Yerele string veri kaydeder
	 * 
	 * @param key
	 * @param object
	 * @param context
	 */
	public static void setSharedString(String key, String object, Context context) {
		getPreferencesEditorInstance(context).putString(key, object);
		getPreferencesEditorInstance(context).commit();
	}

	/**
	 * Yerele integer veri kaydeder
	 * 
	 * @param key
	 * @param object
	 * @param context
	 */
	public static void setSharedInt(String key, Integer object, Context context) {
		getPreferencesEditorInstance(context).putInt(key, object);
		getPreferencesEditorInstance(context).commit();
	}

	/**
	 * Yerele boolean veri kaydeder
	 * 
	 * @param key
	 * @param value
	 * @param context
	 */
	public static void setSharedBoolean(String key, boolean value, Context context) {

		getPreferencesEditorInstance(context).putBoolean(key, value);
		getPreferencesEditorInstance(context).commit();
	}

	/**
	 * Key i verilen bir veriyi yerelden siler
	 * 
	 * @param key
	 * @param context
	 */
	public static void removeSharedData(String key, Context context) {
		getPreferencesEditorInstance(context).remove(key);
		getPreferencesEditorInstance(context).commit();
	}

}
