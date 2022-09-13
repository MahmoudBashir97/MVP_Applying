package com.mahmoud.bashir.mvp_applying.ui;

import android.view.View;

import com.mahmoud.bashir.mvp_applying.pojo.MoviesModel;

public class MoviesPresenter {

    InterfacePresenter interfacePresenter;

    public MoviesPresenter(InterfacePresenter interfacePresenter) {
        this.interfacePresenter = interfacePresenter;
    }

    public MoviesModel getMoviesFromDatabase(){
        return new MoviesModel("NCIS","2020-02-26","NCIS Forces a criminals in New York",1);
    }

    public void getMovieName(){
        interfacePresenter.OnGetMovieName(getMoviesFromDatabase().getName());
    }
}
