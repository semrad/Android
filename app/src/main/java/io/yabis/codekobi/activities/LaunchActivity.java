package io.yabis.codekobi.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import io.yabis.codekobi.R;
import io.yabis.codekobi.models.LoginDataModel;
import io.yabis.codekobi.models.responses.LoginResponseModel;
import io.yabis.codekobi.services.Services;
import io.yabis.codekobi.services.YabisioApi;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class LaunchActivity extends AppCompatActivity {

    private EditText txtusername,txtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        txtusername = (EditText) findViewById(R.id.username);
        txtpassword = (EditText) findViewById(R.id.password);

        Services apiService = YabisioApi.getRetrofit().create(Services.class);
        apiService.loginUser(new LoginDataModel(txtusername.getText().toString(), txtpassword.getText().toString())).enqueue(new Callback<LoginResponseModel>() {
            @Override
            public void onResponse(Response<LoginResponseModel> response, Retrofit retrofit) {
                String jeton = response.body().getToken();
                startActivity(new Intent(LaunchActivity.this,MainActivity.class));
                finish();
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
