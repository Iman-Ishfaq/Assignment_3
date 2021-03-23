package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    EditText email,pass;
    Button SignIn;
    TextView btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.eamil);
        pass = findViewById(R.id.pass);

        SignIn = findViewById(R.id.signin);
        btn = findViewById(R.id.btn);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail , pas;
                mail= email.getText().toString();
                pas = pass.getText().toString();

                if (mail.equals("")){
                    Toast.makeText(signin.this, "Email is blank", Toast.LENGTH_LONG). show();
                }
                else if(pas.equals("")){
                    Toast.makeText(signin.this, "Password is blank", Toast.LENGTH_LONG). show();
                }

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(signin.this,register.class);
                startActivity(i);
                finish();


            }
        });
    }
}