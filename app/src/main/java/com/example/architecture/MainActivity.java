package com.example.architecture;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Main Activity On Create Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Main Activity","OnCreate");
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setTextColor(Color.BLUE);
                startActivity(new Intent(MainActivity.this,SecondActivity.class));

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Main Activity On Start Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Main Activity","OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Main Activity On Stop Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Main Activity","OnStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Main Activity On Pause Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Main Activity","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Main Activity On Destroy Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Main Activity","OnDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Main Activity On Resume Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Main Activity","OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Main Activity On Restart Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Main Activity","OnRestart");
    }
}
