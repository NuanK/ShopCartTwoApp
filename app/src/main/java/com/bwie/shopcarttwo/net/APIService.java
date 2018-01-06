package com.bwie.shopcarttwo.net;


import com.bwie.shopcarttwo.bean.ShopCar;

import java.util.Map;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface APIService {

    //http://120.27.23.105/product/getCarts
    @GET("product/getCarts")
    Flowable<ShopCar> getNews(@QueryMap Map<String, String> map);

}
