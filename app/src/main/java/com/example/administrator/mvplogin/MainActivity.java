package com.example.administrator.mvplogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.administrator.mvplogin.presenter.LoginPresenter;
import com.example.administrator.mvplogin.presenter.LoginPresenterImpl;
import com.example.administrator.mvplogin.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView, View.OnClickListener {
    private ProgressBar progressBar;
    private EditText username;
    private EditText password;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        findViewById(R.id.button).setOnClickListener(this);
        presenter = new LoginPresenterImpl(this);

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setUsernameError() {
        username.setError("");
        setPassWordError();

    }

    @Override
    public void setPassWordError() {
        password.setError("");

    }

    @Override
    public void navigateToHome() {
        Toast.makeText(this, "login success", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View view) {
        presenter.validateCredentials(username.getText().toString(), password.getText().toString());


    }
}
