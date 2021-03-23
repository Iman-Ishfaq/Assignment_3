package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.assignment_3.R;

public class register extends AppCompatActivity {

    EditText name, num, email ,pass;
    Button reg;
    TextView btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.name);
        num = findViewById(R.id.num);

        email = findViewById(R.id.eamil);
        pass = findViewById(R.id.pass);

        reg = findViewById(R.id.reg);
        btn1 = findViewById(R.id.btn1);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name, Num, Mail ,Passw;

                Name = name.getText().toString();
                Num = num.getText().toString();
                Mail= email.getText().toString();
                Passw= pass.getText().toString();

                if(Name.equalsIgnoreCase(""));{
                    name.setError("name is blank");
                    // Toast.makeText(register.this, "Name is blank", Toast.LENGTH_SHORT). show();
                }
                if(Num.equalsIgnoreCase(""));{
                    num.setError("num is blank");
                    //Toast.makeText(register.this, "Number is blank", Toast.LENGTH_SHORT). show();
                }
                if(Mail.equalsIgnoreCase(""));{
                    email.setError("email is blank");

                    //Toast.makeText(register.this, "Email is blank", Toast.LENGTH_SHORT). show();
                }
                if(Passw.equalsIgnoreCase(""));{
                    pass.setError("password is blank");
                    //Toast.makeText(register.this, "Password is blank", Toast.LENGTH_SHORT). show();
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent R = new Intent(register.this, login. class);
                startActivity(R);
                finish();
            }
        });
    }
}