package com.example.tentangjkt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Namanamamember3Activity extends AppCompatActivity {

    Button pindahactivity;
    ImageButton pindahhomepage;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.namanamamember3);

        pindahactivity = findViewById(R.id.back1);
        pindahactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindahkenamamember2 = new Intent(Namanamamember3Activity.this,Namanamamember2Activity.class);
                startActivity(pindahkenamamember2);
            }
        });

        pindahhomepage = findViewById(R.id.homepagebtn);
        pindahhomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindahkehomepage = new Intent(Namanamamember3Activity.this,HomepageActivity.class);
                startActivity(pindahkehomepage);
            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}