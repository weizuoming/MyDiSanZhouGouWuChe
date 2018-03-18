package com.bwie.mydisanzhougouwuche.view;

import okhttp3.ResponseBody;

/**
 * Created by admin on 2018/3/17.
 */

public interface MyView {
    void getReView(ResponseBody responseBody);
    void getError(Throwable throwable);
}
