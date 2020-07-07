package com.example.wallpaper;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class BackgroundColorActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5,btn_6, btn_7, btn_8, btn_9, btn_10, btn_11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = (Button) findViewById(R.id.btn_wal1);
        btn_2 = (Button) findViewById(R.id.btn_wal2);
        btn_3 = (Button) findViewById(R.id.btn_wal3);
        btn_4 = (Button) findViewById(R.id.btn_wal4);
        btn_5 = (Button) findViewById(R.id.btn_wal5);
        btn_6 = (Button) findViewById(R.id.btn_wal6);
        btn_7 = (Button) findViewById(R.id.btn_wal7);
        btn_8 = (Button) findViewById(R.id.btn_wal8);
        btn_9 = (Button) findViewById(R.id.btn_wal9);


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(BackgroundColorActivity.this, ThemeActivity.class);
                String pathpic="btn_1";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(BackgroundColorActivity.this, ThemeActivity.class);
                String pathpic="btn_2";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(BackgroundColorActivity.this, ThemeActivity.class);
                String pathpic="btn_3";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(BackgroundColorActivity.this, ThemeActivity.class);
                String pathpic="btn_3";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(BackgroundColorActivity.this, ThemeActivity.class);
                String pathpic="btn_4";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(BackgroundColorActivity.this, ThemeActivity.class);
                String pathpic="btn_5";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(BackgroundColorActivity.this, ThemeActivity.class);
                String pathpic="btn_6";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(BackgroundColorActivity.this, ThemeActivity.class);
                String pathpic="btn_7";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(BackgroundColorActivity.this, ThemeActivity.class);
                String pathpic="btn_8";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(BackgroundColorActivity.this, ThemeActivity.class);
                String pathpic="btn_9";
                i.putExtra("PATH_PICTURE",pathpic);
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
