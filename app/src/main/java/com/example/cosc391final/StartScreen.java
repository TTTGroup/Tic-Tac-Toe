package com.example.cosc391final;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class StartScreen extends AppCompatActivity {

    public static final String TAG = "StartScreen";
    TextView tvTitle;
    ImageView ivLogo;
    TextView tvRules;
    TextView tvStart;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        Log.i(TAG, "Started App");
        tvTitle = findViewById(R.id.tvTitle);
        ivLogo = findViewById(R.id.ivLogo);
        tvRules = findViewById(R.id.tvRules);
        tvStart = findViewById(R.id.tvStart);
        tvStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Clicked Start");
                goMainActivity();
            }
        });
    }

    private void goMainActivity(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
