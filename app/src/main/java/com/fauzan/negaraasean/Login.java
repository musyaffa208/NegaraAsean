package com.fauzan.negaraasean;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText username, password;
    Button btnlogin;
    String keynama, keypass;

    @Override
    protected void onCreate(Bundle savedInsanceState){
        super.onCreate(savedInsanceState);
        setContentView(R.layout.activity_login);

        btnlogin = findViewById(R.id.buttonLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = findViewById(R.id.editTextUsername);
                password = findViewById(R.id.editTextPassword);
                btnlogin = findViewById(R.id.buttonLogin);

                keynama = username.getText().toString();
                keypass = password.getText().toString();

                //username diisi dengan admin dan password dengan admin
                if (keynama.equals("admin") && keypass.equals("admin")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN BERHASIL", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    Login.this.startActivity(intent);
                    finish();
                }else {
                  //Jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage
                            ("Usernam atau Password salah").setNegativeButton("Ulangi",null).create().show();
                    username.setText("");
                    password.setText("");
                }
            }
        });
    }
}
