package com.example.administrator.mvplogin.model;

import android.os.Handler;
import android.text.TextUtils;

import com.example.administrator.mvplogin.OnLoginFinishListener;


/**
 * Created by zcq on 2018/1/28.
 */

public class LoginModelImpl implements LoginModel {

    @Override
    public void login(final String name, final String password, final OnLoginFinishListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;

                if (TextUtils.isEmpty(name)) {
                    listener.onUserNameError();
                    error = true;
                }
                if (TextUtils.isEmpty(password)) {
                    listener.onPassWordError();
                    error = true;
                }
                if (!error) {
                    listener.onSuccess();

                }

            }
        }, 2000);

    }
}
