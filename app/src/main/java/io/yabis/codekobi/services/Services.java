package io.yabis.codekobi.services;

import io.yabis.codekobi.models.LoginDataModel;
import io.yabis.codekobi.models.responses.LoginResponseModel;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by mertsaygi on 17/12/16.
 */
public interface Services {

    @POST("/auth/login/")
    Call<LoginResponseModel> loginUser(@Body LoginDataModel loginDataModel);

}
