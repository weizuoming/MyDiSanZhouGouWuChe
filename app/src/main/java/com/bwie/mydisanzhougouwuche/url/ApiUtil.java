package com.bwie.mydisanzhougouwuche.url;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Created by admin on 2018/3/17.
 */

public interface ApiUtil {
    @GET("{url}")
    Observable<ResponseBody> doGet(@Path(value = "url"
             ,encoded = true) String url, @QueryMap Map<String,String> map);
    @FormUrlEncoded
    @POST("{url}")
    Observable<ResponseBody> doPost(@Path(value = "url"
            ,encoded = true) String url, @FieldMap Map<String,String> map);
}
