package com.example.administrator.mvplogin.model;

import com.example.administrator.mvplogin.OnLoginFinishListener;

/**
 * Created by zcq on 2018/1/28.
 * 模拟登录的操作接口
 */


public interface LoginModel {
    void login(String name ,String password, OnLoginFinishListener listener);
}
