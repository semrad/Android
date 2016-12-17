package io.yabis.codekobi.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import io.yabis.codekobi.R;
import io.yabis.codekobi.constants.PageConstants;

public class UserSettingsActivity extends AppCompatActivity {

    private static final int PAGE_VALUE = PageConstants.CONFIG_PAGE.getCode();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setClickables();
        menuClickables();
    }

    private void menuClickables(){
        LinearLayout btnProfile = (LinearLayout)findViewById(R.id.btn_settings_profile_info);
        LinearLayout btnPayment = (LinearLayout)findViewById(R.id.btn_settings_payment_info);
        LinearLayout btnNotification = (LinearLayout)findViewById(R.id.btn_settings_notification_info);
        LinearLayout btnCardSettings = (LinearLayout)findViewById(R.id.btn_settings_card_info);
        LinearLayout btnHelp = (LinearLayout)findViewById(R.id.btn_settings_help_info);
        LinearLayout btnAbout = (LinearLayout)findViewById(R.id.btn_settings_about_info);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnCardSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void setClickables(){
        LinearLayout btnMainPage = (LinearLayout)findViewById(R.id.btn_main_page);
        LinearLayout btnCodePage = (LinearLayout)findViewById(R.id.btn_code_page);
        LinearLayout btnSettingsPage = (LinearLayout)findViewById(R.id.btn_settings_page);
        btnMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserSettingsActivity.this,MainActivity.class));
            }
        });
        btnCodePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserSettingsActivity.this,GetCodeActivity.class));
            }
        });
        btnSettingsPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
