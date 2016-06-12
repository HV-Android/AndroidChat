package edu.galileo.android.androidchat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.editTxtEmail) EditText inputEmail;
    @BindView(R.id.editTxtPassword) EditText inputPassword;
    @BindView(R.id.btnSignin) Button btnSignIn;
    @BindView(R.id.btnSignup) Button btnSignUp;
    @BindView(R.id.progresBar) ProgressBar progresBar;
    @BindView(R.id.layoutMainContainer) RelativeLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btnSignin)
    public void handleSingIn() {
        Log.e("AndroidChat", inputEmail.getText().toString());
    }

    @OnClick(R.id.btnSignup)
    public void handleSignUp() {

    }
}
