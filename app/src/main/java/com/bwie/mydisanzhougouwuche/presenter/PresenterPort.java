package com.bwie.mydisanzhougouwuche.presenter;

import okhttp3.ResponseBody;

/**
 * Created by admin on 2018/3/17.
 */

public interface PresenterPort {
    void getReView(ResponseBody responseBody);
    void getError(Throwable throwable);
}
