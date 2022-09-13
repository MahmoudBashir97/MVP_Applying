package com.mahmoud.bashir.mvp_applying.MVVM.view;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mahmoud.bashir.mvp_applying.pojo.MoviesModel;

import java.util.ArrayList;
import java.util.List;

public class MoviesViewModel extends ViewModel{

     MutableLiveData<String> getMovieMutableLiveData = new MutableLiveData<>();

    MutableLiveData<List<MoviesModel>> list = new MutableLiveData<>();

    public void getMovieName (){
        String moviename=getMoviesFromDatabase().getName();
        getMovieMutableLiveData.setValue(moviename);
    }

    public void getList(){
        List<MoviesModel> lm= getMoviesList();
        list.setValue(lm);
    }

    private MoviesModel getMoviesFromDatabase(){

        return new MoviesModel("NCIS","2020-02-26","NCIS Forces a criminals in New York",1);
    }

    private List<MoviesModel> getMoviesList(){
        MoviesModel m = new MoviesModel("NCIS","2020-02-26","NCIS Forces a criminals in New York",1);
        List<MoviesModel> mlist=new ArrayList<>();
        mlist.add(m);

        return mlist;
    }
}
