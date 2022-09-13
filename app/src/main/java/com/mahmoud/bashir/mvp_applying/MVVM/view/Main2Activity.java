package com.mahmoud.bashir.mvp_applying.MVVM.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mahmoud.bashir.mvp_applying.R;
import com.mahmoud.bashir.mvp_applying.databinding.ActivityMain2Binding;
import com.mahmoud.bashir.mvp_applying.pojo.MoviesModel;
import com.mahmoud.bashir.mvp_applying.ui.InterfacePresenter;
import com.mahmoud.bashir.mvp_applying.ui.MoviesPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Main2Activity extends AppCompatActivity {


    MoviesViewModel moviesViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActivityMain2Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_main2);

        //show.setOnClickListener(this);


        moviesViewModel= ViewModelProviders.of(this).get(MoviesViewModel.class);

        moviesViewModel.getMovieMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.textView.setText(s);
            }
        });

       /* binding.buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moviesViewModel.getMovieName();
            }
        });*/
        binding.setViewmodel(moviesViewModel);
        binding.setLifecycleOwner(this);

       /* moviesViewModel.getMovieMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
               binding.textView.setText(s);
            }
        });*/

    }
}



