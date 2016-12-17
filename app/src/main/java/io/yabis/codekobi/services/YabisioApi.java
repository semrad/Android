package io.yabis.codekobi.services;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by mertsaygi on 17/12/16.
 */
public class YabisioApi {

    public static final String BASE_URL = "http://188.166.122.143:8080";

    public static Retrofit getRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

}
