package com.morales.apps.androidfunwithflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity_msmmm extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_msmmm);

        user = findViewById(R.id.editTextText_User2);
        pass = findViewById(R.id.editTextText_Pass2);
        log = findViewById(R.id.button_acept2);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().equals("pepe") && pass.getText().toString().equals("pepe")
                || ser.getText().toString().equals("juan") && pass.getText().toString().equals("juan")){

                }else{
                    Toast.makeText(MainActivity_msmmm.this, "")
                }
            }
        });
    }
}