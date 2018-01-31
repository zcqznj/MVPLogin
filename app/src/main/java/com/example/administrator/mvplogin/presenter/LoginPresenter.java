package com.example.administrator.mvplogin.presenter;

/**
 * Created by zcq on 2018/1/29.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();

}
