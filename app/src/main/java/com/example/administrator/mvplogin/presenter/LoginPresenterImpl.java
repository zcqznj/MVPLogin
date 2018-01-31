package com.example.administrator.mvplogin.presenter;

import com.example.administrator.mvplogin.OnLoginFinishListener;
import com.example.administrator.mvplogin.model.LoginModel;
import com.example.administrator.mvplogin.model.LoginModelImpl;
import com.example.administrator.mvplogin.view.LoginView;

/**
 * Created by zcq on 2018/1/29.
 */

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishListener {
    private LoginModel loginModel;
    private LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginModel = new LoginModelImpl();
        this.loginView = loginView;
    }

    @Override
    public void validateCredentials(String username, String password) {
        if (loginView != null) {
            loginView.showProgress();
        }
        loginModel.login(username, password, this);

    }

    @Override
    public void onDestroy() {
        loginView = null;

    }

    @Override
    public void onUserNameError() {
        if (loginView != null) {
            loginView.setUsernameError();
            loginView.hideProgress();
        }

    }

    @Override
    public void onPassWordError() {
        if (loginView != null) {
            loginView.setPassWordError();
            loginView.hideProgress();
        }

    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.navigateToHome();
        }
    }
}
