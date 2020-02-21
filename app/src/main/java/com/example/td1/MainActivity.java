package com.example.td1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonValidate;
    private EditText prenom;
    private EditText nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonValidate = findViewById(R.id.btt_ok);
        buttonValidate.setOnClickListener(this);
        nom = findViewById(R.id.ed_last_name);
        prenom = findViewById(R.id.ed_first_name);

        Spinner civiliteSpinner = findViewById(R.id.civilite_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.civilite, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        civiliteSpinner.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btt_ok) {
            Log.d("Nom :", nom.getText().toString());
            Log.d("Prénom :", prenom.getText().toString());
        }
    }
}
