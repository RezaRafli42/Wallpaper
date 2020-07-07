package com.example.wallpaper;

import android.app.WallpaperManager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.os.Bundle;

import java.io.IOException;

public class BackgroundActivity extends AppCompatActivity {
    LinearLayout theme_preview;
    Button btn_back, btn_save;
    String newString;

    Button btn_10, btn_11, btn_12, btn_13, btn_14, btn_15, btn_16, btn_17, btn_18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);

        btn_10 = (Button) findViewById(R.id.btn_wal10);
        btn_11 = (Button) findViewById(R.id.btn_wal11);
        btn_12 = (Button) findViewById(R.id.btn_wal12);
        btn_13 = (Button) findViewById(R.id.btn_wal13);
        btn_14 = (Button) findViewById(R.id.btn_wal14);
        btn_15 = (Button) findViewById(R.id.btn_wal15);
        btn_16 = (Button) findViewById(R.id.btn_wal16);
        btn_17 = (Button) findViewById(R.id.btn_wal17);
        btn_18 = (Button) findViewById(R.id.btn_wal18);

        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BackgroundActivity.this, ThemeActivity.class);
                String pathpic = "btn_10";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);

            }
        });

        btn_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BackgroundActivity.this, ThemeActivity.class);
                String pathpic = "btn_11";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);

            }
        });

        btn_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BackgroundActivity.this, ThemeActivity.class);
                String pathpic = "btn_12";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);

            }
        });

        btn_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BackgroundActivity.this, ThemeActivity.class);
                String pathpic = "btn_13";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);

            }
        });

        btn_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BackgroundActivity.this, ThemeActivity.class);
                String pathpic = "btn_14";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);

            }
        });

        btn_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BackgroundActivity.this, ThemeActivity.class);
                String pathpic = "btn_15";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);

            }
        });

        btn_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BackgroundActivity.this, ThemeActivity.class);
                String pathpic = "btn_16";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);

            }
        });

        btn_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BackgroundActivity.this, ThemeActivity.class);
                String pathpic = "btn_17";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);

            }
        });btn_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BackgroundActivity.this, ThemeActivity.class);
                String pathpic = "btn_18";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.bgi) {
            startActivity(new Intent(this, BackgroundActivity.class));
        } else
            startActivity(new Intent(this, BackgroundColorActivity.class));

            return true;
        }
    }

