package com.bwie.shopcarttwo.model;


import com.bwie.shopcarttwo.bean.ShopCar;
import com.bwie.shopcarttwo.net.RetrofitUtils;
import com.bwie.shopcarttwo.presenter.NewsPresenter;

import java.util.Map;

import io.reactivex.Flowable;

public class Model  implements IModel {

    private NewsPresenter presenter;

    public Model(NewsPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getData(Map<String, String> map) {
        Flowable<ShopCar> flowable = RetrofitUtils.getInstance().getApiService().getNews(map);
        presenter.get(flowable);
    }

}
