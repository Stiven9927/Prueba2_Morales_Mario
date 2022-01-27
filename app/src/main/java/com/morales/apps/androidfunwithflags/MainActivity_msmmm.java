package com.morales.apps.androidfunwithflags;

import android.content.Intent;
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
        setContentView(R.layout.activity_mainn_msmmm);

        user = findViewById(R.id.editTextText_User2);
        pass = findViewById(R.id.editTextText_Pass2);
        log = findViewById(R.id.button_acept2);
    }

    public void onCLickAceptar(View view){
        user = findViewById(R.id.editTextText_User2);
        pass = findViewById(R.id.editTextText_Pass2);
        log = findViewById(R.id.button_acept2);

        if(user.getText().toString().equals("pepe") && pass.getText().toString().equals("pepe")
                || user.getText().toString().equals("juan") && pass.getText().toString().equals("juan")){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            Toast.makeText(MainActivity_msmmm.this, "Credenciales correctas", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(MainActivity_msmmm.this, "Credenciales Erroneas", Toast.LENGTH_LONG).show();
        }
    }
}