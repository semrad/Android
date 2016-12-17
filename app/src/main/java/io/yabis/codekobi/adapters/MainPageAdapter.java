package io.yabis.codekobi.adapters;

import android.app.Activity;

import java.util.List;

import io.yabis.codekobi.R;
import io.yabis.codekobi.models.responses.MainResponseModel;

/**
 * Created by mertsaygi on 17/12/16.
 */
public class MainPageAdapter extends GenericAdapter<MainResponseModel> {

    public MainPageAdapter(Activity activity, List<MainResponseModel> list) {
        super(activity, R.layout.row_layout_main_list, list);
    }
}
