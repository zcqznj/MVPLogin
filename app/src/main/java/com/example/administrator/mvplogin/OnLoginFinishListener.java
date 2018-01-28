package com.example.administrator.mvplogin;

/**
 * Created by zcq on 2018/1/28.
 * 登录事件的监听
 */

public interface OnLoginFinishListener {
    void onUserNameError();

    void onPassWordError();

    void onSuccess();

}
