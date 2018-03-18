package com.bwie.mydisanzhougouwuche.presenter;

import com.bwie.mydisanzhougouwuche.MainActivity;
import com.bwie.mydisanzhougouwuche.molder.Molder;
import com.bwie.mydisanzhougouwuche.view.MyView;

import okhttp3.ResponseBody;

/**
 * Created by admin on 2018/3/17.
 */

public class Presenter extends BasePresenter implements PresenterPort {

    private MyView myView;
    private final Molder molder;

    public Presenter(MyView myView) {
        molder = new Molder(this);
        this.myView = myView;
    }

    @Override
    public void getReView(ResponseBody responseBody) {
        myView.getReView(responseBody);
    }

    @Override
    public void getError(Throwable throwable) {
        myView.getError(throwable);
    }

    public void getUrl(String chaxun) {
        molder.getUrl(chaxun);
    }

    public void jiebang() {
        molder.jiebang();
    }
}
