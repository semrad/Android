package io.yabis.codekobi.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Genel list adapter i
 * 
 * 
 * 
 * Gerekli metodlar "override" edilerek kullanilabilir.
 * 
 * @author akaplan
 *
 * @param <E>
 */
@SuppressLint("ViewHolder")
public class GenericAdapter<E> extends BaseAdapter {

	protected Activity activity;
	protected int rowLayoutId;
	protected List<E> list;
	protected LayoutInflater layoutInflater;

	protected static int riverImageWidth = 0;
	protected static int riverImageHeight = 0;
	protected static int riverBannerHeight = 0;

	public GenericAdapter(Activity activity, int rowLayoutId, List<E> list) {

		layoutInflater = LayoutInflater.from(activity);
		this.activity = activity;
		this.rowLayoutId = rowLayoutId;
		this.list = list;
	}

	/**
	 * Verilen row un tagini kontrol eder.
	 * 
	 * Eger true doner ise cagrilan yerde row' u tekrar inflate etmeye gerek
	 * kalmaz
	 * 
	 * @param row
	 * @param tag
	 * @return
	 */
	protected boolean isRowThisType(View row, String tag) {
		if (row == null || row.getTag() == null || !row.getTag().equals(tag)) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public int getCount() {
		return list.size();
	}

	/*
	 * Varsayilan olarak listenin elemanini doner
	 */
	@Override
	public E getItem(int position) {
		return list.get(position);
	}

	/*
	 * Varsayilan olarak pozisyonu doner
	 */
	@Override
	public long getItemId(int position) {
		return position;
	}

	/*
	 * Her seferinde "override" edilmesi gerekli method,
	 * 
	 * eger ayni row kullanilacaksa, alt sinifta inflate e gerek kalmadan
	 * super.getView() denilerek is halledilebilir
	 */
	@Override
	public View getView(int position, View row, ViewGroup parent) {
		row = layoutInflater.inflate(rowLayoutId, parent, false);

		return row;
	}

	public void setListData(List<E> list){
		this.list=list;
	}
	
	public void addToListData(List<E> list){
		this.list.addAll(list);
	}

	public List<E> getListData(){
		return this.list;
	}
}
