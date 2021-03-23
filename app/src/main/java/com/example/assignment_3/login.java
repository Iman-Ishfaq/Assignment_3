package com.example.assignment_3;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SQLiteDatabase db;
        SQLiteOpenHelper openHelper;
        final Cursor[] cursor = new Cursor[1];
        Button button4;
        final EditText editText8, editText9;


        editText8 = (EditText) findViewById(R.id.editText8);
        editText9 = (EditText) findViewById(R.id.editText9);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editText8.getText().toString();
                String pass = editText9.getText().toString();

                Intent i = new Intent(login.this,remember_location.class);
                startActivity(i);
                finish();



            }
        });
    }
}