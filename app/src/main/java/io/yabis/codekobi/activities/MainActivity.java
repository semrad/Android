package io.yabis.codekobi.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import io.yabis.codekobi.R;
import io.yabis.codekobi.constants.PageConstants;

public class MainActivity extends AppCompatActivity {

    private static final int PAGE_VALUE = PageConstants.MAIN_PAGE.getCode();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setClickables();
    }

    private void setClickables(){
        LinearLayout btnMainPage = (LinearLayout)findViewById(R.id.btn_main_page);
        LinearLayout btnCodePage = (LinearLayout)findViewById(R.id.btn_code_page);
        LinearLayout btnSettingsPage = (LinearLayout)findViewById(R.id.btn_settings_page);
        btnMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnCodePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,GetCodeActivity.class));
            }
        });
        btnSettingsPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,UserSettingsActivity.class));
            }
        });

    }
}
