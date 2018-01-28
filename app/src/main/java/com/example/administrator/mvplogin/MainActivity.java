package com.example.administrator.mvplogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.mvplogin.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setUsernameError() {

    }

    @Override
    public void setPassWordError() {

    }

    @Override
    public void navigateToHome() {

    }
}
