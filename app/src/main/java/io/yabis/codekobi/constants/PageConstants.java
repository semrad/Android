package io.yabis.codekobi.constants;

/**
 * Created by mertsaygi on 17/12/16.
 */
public enum PageConstants {

    MAIN_PAGE(0),
    CODE_PAGE(1),
    CONFIG_PAGE(2);

    private int code;

    PageConstants(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
