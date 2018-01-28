package com.example.administrator.mvplogin.view;

/**
 * Created by zcq on 2018/1/28.
 * 登录view
 * 的接口
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPassWordError();

    void navigateToHome();

}
