package io.yabis.codekobi.models.responses;

/**
 * Created by mertsaygi on 17/12/16.
 */
public class LoginResponseModel {

    private String token;

    public LoginResponseModel(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
