package aquino.vladimir.example.xenobladever3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tv_blade, tv_monster, tv_shopdeed, tv_secretarea, tv_expansion, tv_mercmissions, tv_hiddenquest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_blade = findViewById(R.id.tv_blade);
        tv_monster = findViewById(R.id.tv_monster);
        tv_shopdeed = findViewById(R.id.tv_shopdeed);
        tv_secretarea = findViewById(R.id.tv_secretarea);
        tv_expansion = findViewById(R.id.tv_expman);
        tv_mercmissions = findViewById(R.id.tv_mercmission);
        tv_hiddenquest = findViewById(R.id.tv_hiddenquest);

        // ONCLICK LISTENERS
        tv_shopdeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShopDeedsPage.class);
                startActivity(i);
            }
        });


        tv_monster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Monster.class);
                startActivity(i);
            }
        });


        tv_blade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BladePage.class);
                startActivity(i);
            }
        });


        tv_secretarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecretAreaPage.class);
                startActivity(i);
            }
        });

        tv_expansion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ExpmanPage.class);
                startActivity(i);
            }
        });

        tv_mercmissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MercMissionsPage.class);
                startActivity(i);
            }
        });

        tv_hiddenquest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HiddenQuestPage.class);
                startActivity(i);
            }
        });

    }
}
