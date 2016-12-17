package io.yabis.codekobi.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.yabis.codekobi.R;

public class LaunchActivity extends AppCompatActivity {

    private EditText txtusername,txtpassword;
    private Button btnlogin,btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        txtusername = (EditText) findViewById(R.id.username);
        txtpassword = (EditText) findViewById(R.id.password);
        btnlogin = (Button) findViewById(R.id.login);
        btnsignup = (Button) findViewById(R.id.signup);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaunchActivity.this,MainActivity.class));
                finish();
            }
        });

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LaunchActivity.this,SignUpActivity.class));
                finish();
            }
        });


        /*Services apiService = YabisioApi.getRetrofit().create(Services.class);
        apiService.loginUser(new LoginDataModel(txtusername.getText().toString(), txtpassword.getText().toString())).enqueue(new Callback<LoginResponseModel>() {
            @Override
            public void onResponse(Response<LoginResponseModel> response, Retrofit retrofit) {
                String jeton = response.body().getToken();

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });*/
    }
}
