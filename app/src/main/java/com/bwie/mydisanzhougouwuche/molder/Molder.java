package com.bwie.mydisanzhougouwuche.molder;

import com.bwie.mydisanzhougouwuche.presenter.Presenter;
import com.bwie.mydisanzhougouwuche.presenter.PresenterPort;
import com.bwie.mydisanzhougouwuche.url.RetrofitUtil;

import java.util.HashMap;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * Created by admin on 2018/3/17.
 */

public class Molder {
    private Disposable d;
    private PresenterPort presenterPort;

    public Molder(PresenterPort presenterPort) {
        this.presenterPort = presenterPort;
    }

    public void getUrl(String chaxun) {
        HashMap<String, String> map = new HashMap<>();
        map.put("uid","4427");
        map.put("source","android");
        RetrofitUtil.gery().doGet(chaxun,map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {


                    @Override
                    public void onSubscribe(Disposable d) {

                        Molder.this.d = d;
                    }

                    @Override
                    public void onNext(ResponseBody value) {
                        presenterPort.getReView(value);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void jiebang() {
        d.dispose();
    }
}
