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

public class HomepageActivity extends AppCompatActivity {
    Button pindahactivity23;
    Button pindahactivity22;

    Button activitymain;

    Button kejkt48;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.homepage);

        pindahactivity23 = findViewById(R.id.btnaboutapp);

        pindahactivity23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent pindahakeapp = new Intent(HomepageActivity.this, AboutappActivity.class);
                startActivity(pindahakeapp);
            }
        });

        pindahactivity22 = findViewById(R.id.btnnamamember);

        pindahactivity22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkenamamember = new Intent(HomepageActivity.this, Namanamamember1Activity.class);
                startActivity(pindahkenamamember);
            }
        });

        kejkt48 = findViewById(R.id.btnjkt48);
        kejkt48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent jkt48app = new Intent(HomepageActivity.this,Aboutjkt48Activity.class);
                startActivity(jkt48app);
            }
        });

        activitymain = findViewById(R.id.btnback);
        activitymain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent kemain = new Intent(HomepageActivity.this,MainActivity.class);
                startActivity(kemain);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}