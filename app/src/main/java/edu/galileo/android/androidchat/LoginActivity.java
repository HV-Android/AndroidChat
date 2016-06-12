package edu.galileo.android.androidchat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @Bind(R.id.editTxtEmail) EditText inputEmail;
    @Bind(R.id.editTxtPassword) EditText inputPassword;
    @Bind(R.id.btnSignin) Button btnSignIn;
    @Bind(R.id.btnSignup) Button btnSignUp;
    @Bind(R.id.progresBar) ProgressBar progresBar;
    @Bind(R.id.layoutMainContainer) RelativeLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btnSignin)
    public void handleSignIn() {
        Toast.makeText(getApplicationContext(),inputEmail.getText().toString(),Toast.LENGTH_LONG).show();
        Log.e("AndroidChat", inputEmail.getText().toString());
    }

    @OnClick(R.id.btnSignup)
    public void handleSignUp() {
        Toast.makeText(getApplicationContext(),inputPassword.getText().toString(),Toast.LENGTH_LONG).show();
        Log.e("AndroidChat", inputPassword.getText().toString());
    }
}
