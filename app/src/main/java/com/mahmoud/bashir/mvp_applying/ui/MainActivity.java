package com.mahmoud.bashir.mvp_applying.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mahmoud.bashir.mvp_applying.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, InterfacePresenter {


    MoviesPresenter moviesPresenter;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.button_show)
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        textView = findViewById(R.id.textView);
        show = findViewById(R.id.button_show);

        show.setOnClickListener(this);
        moviesPresenter = new MoviesPresenter(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_show) {
            moviesPresenter.getMovieName();
        }
    }


    @Override
    public void OnGetMovieName(String name) {
        textView.setText(name);
    }
}
