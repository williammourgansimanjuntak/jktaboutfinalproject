package com.example.tentangjkt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Namanamamember1Activity extends AppCompatActivity {
    Button pindahactivity;
    Button pindahactivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.namanamamember1);

        pindahactivity = findViewById(R.id.btnback);

        pindahactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindahkehomepage = new Intent(Namanamamember1Activity.this,HomepageActivity.class);
                startActivity(pindahkehomepage);
            }
        });


        pindahactivity2 = findViewById(R.id.btnselanjutnya);

        pindahactivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindahkenamanamamember2 = new Intent(Namanamamember1Activity.this, Namanamamember2Activity.class);
                startActivity(pindahkenamanamamember2);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}