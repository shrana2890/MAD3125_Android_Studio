package com.jk.sirra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.cert.Extension;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button  btnlogin;
    Button btnRegister;
    EditText edtEmail;
    EditText edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnlogin = findViewById(R.id.btnLogin);
        btnlogin.setOnClickListener(this);

        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);

        edtEmail=findViewById(R.id.edtEmail);
        edtPassword=findViewById(R.id.edtPassword);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onClick(View v) {
       if(v.getId() == btnlogin.getId()) {
           String email =edtEmail.getText().toString();
           String password = edtPassword.getText().toString();

        if(email.equals("test") && password.equals("test")) {
            Toast.makeText(this, "login Successfull", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "login unSuccessfull", Toast.LENGTH_SHORT).show();
        }
        }else if(v.getId()==btnRegister.getId()){
            Toast.makeText(this, "button tapped", Toast.LENGTH_SHORT).show();
        }

    }
}
