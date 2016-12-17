package io.yabis.codekobi.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.UUID;

import io.yabis.codekobi.R;
import io.yabis.codekobi.constants.PageConstants;

public class GetCodeActivity extends AppCompatActivity {

    private static final int PAGE_VALUE = PageConstants.CODE_PAGE.getCode();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_code);
        setClickables();
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView textView = (TextView)findViewById(R.id.shopping_token);
        textView.setText(UUID.randomUUID().toString());
    }

    private void setClickables(){
        LinearLayout btnMainPage = (LinearLayout)findViewById(R.id.btn_main_page);
        LinearLayout btnCodePage = (LinearLayout)findViewById(R.id.btn_code_page);
        LinearLayout btnSettingsPage = (LinearLayout)findViewById(R.id.btn_settings_page);
        btnMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GetCodeActivity.this,MainActivity.class));
                finish();
            }
        });
        btnCodePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnSettingsPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GetCodeActivity.this,SettingsActivity.class));
                finish();
            }
        });

    }
}
