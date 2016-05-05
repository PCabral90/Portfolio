package com.udacity.cabral.portfolio;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_popular_movies)
    AppCompatButton popularMoviesBtn;
    @BindView(R.id.main_stock_hawk)
    AppCompatButton stockHawkBtn;
    @BindView(R.id.main_build_it_bigger)
    AppCompatButton buildItBiggerBtn;
    @BindView(R.id.main_make_your_app_material)
    AppCompatButton makeYouAppMaterialBtn;
    @BindView(R.id.main_go_ubiquitous)
    AppCompatButton goUbiquitousBtn;
    @BindView(R.id.main_capstone)
    AppCompatButton capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.main_header, R.id.main_popular_movies, R.id.main_stock_hawk, R.id.main_build_it_bigger, R.id.main_make_your_app_material, R.id.main_go_ubiquitous, R.id.main_capstone})
    public void onClick(View view) {
        String appName = "";
        switch (view.getId()) {
            case R.id.main_popular_movies:
                appName = getResources().getString(R.string.main_popular_movies);
                break;
            case R.id.main_stock_hawk:
                appName = getResources().getString(R.string.main_stock_hawk);
                break;
            case R.id.main_build_it_bigger:
                appName = getResources().getString(R.string.main_build_it_bigger);
                break;
            case R.id.main_make_your_app_material:
                appName = getResources().getString(R.string.main_make_your_app_material);
                break;
            case R.id.main_go_ubiquitous:
                appName = getResources().getString(R.string.main_go_ubiquitous);
                break;
            case R.id.main_capstone:
                appName = getResources().getString(R.string.main_capstone);
                break;
        }

        DisplayToast(getResources().getString(R.string.main_toast_unavailable, appName));
    }

    private void DisplayToast(String text){
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}
