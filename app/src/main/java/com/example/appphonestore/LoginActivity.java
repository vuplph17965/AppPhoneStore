package com.example.appphonestore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText ed_user, ed_pass;
    Button btn_login, btn_exit;
    CheckBox chk_remember;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("LOGIN");
        ed_user = findViewById(R.id.ed_user);
        ed_pass = findViewById(R.id.ed_user);
        btn_login = findViewById(R.id.btn_login);
        btn_exit = findViewById(R.id.btn_exit);
        chk_remember = findViewById(R.id.chk_remember);
    }
}