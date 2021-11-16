package com.cubism.roleplay;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button generation;
    EditText personName;
    Spinner setting;

    public static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generation = findViewById(R.id.generation);
        personName = findViewById(R.id.textPersonName);
    }

    public void generation(View view) {
        if(String.valueOf(personName.getText()).length() == 0){
            generation.setText("Вы не написали имя");
        }
        else {
            generation.setText("ГЕНЕРИРОВАТЬ");
            name = String.valueOf(personName.getText());
            Intent intent = new Intent(this, FinalActivity.class);
            startActivity(intent);
        }

    }

}