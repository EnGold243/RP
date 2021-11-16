package com.cubism.roleplay;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FinalActivity extends AppCompatActivity {

    TextView genText;

    int rand = (int) (1 + Math.random() * 5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        RPText.main();

        genText = findViewById(R.id.textView);
        genText.setText(
                RPText.greeting.get(rand)+ MainActivity.name+"!" + " Рядом с вами есть " + RPText.places.get(rand) + ", не хотите его ограбить?"
                );
    }
}
