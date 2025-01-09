package com.example.tentangjkt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Namanamamember2Activity extends AppCompatActivity {
    Button pindahactivity1;
    Button kenamanamamember3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_namanamamember2);

        pindahactivity1 = findViewById(R.id.back);
        pindahactivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindahback = new Intent(Namanamamember2Activity.this,Namanamamember1Activity.class);
                startActivity(pindahback);
            }
        });

        kenamanamamember3 = findViewById(R.id.selanjutnya);
        kenamanamamember3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent member3 = new Intent(Namanamamember2Activity.this,Namanamamember3Activity.class);
                startActivity(member3);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}