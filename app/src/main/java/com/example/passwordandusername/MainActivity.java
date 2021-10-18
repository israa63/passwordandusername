package com.example.passwordandusername;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editname;
    private EditText editpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editname= findViewById(R.id.editname);
        editpassword = findViewById(R.id.editpassword);
    }

    public void btnsubmitonclick(View view) {
        String name = editname.getText().toString();
        String pass = editpassword.getText().toString();

        String msg = "name:" + name + ", pass: " + pass;


    }

}