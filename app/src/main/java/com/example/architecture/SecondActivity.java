package com.example.architecture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(this, "Second Activity On Create Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Function","OnCreate");
        b1 = findViewById(R.id.Sbutton);
        b2 = findViewById(R.id.Sbutton2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
           //     intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Second Activity On Start Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Function","OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Second Activity On Stop Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Function","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Second Activity On Destroy Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Function","OnDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Second Activity On Resume Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Function","OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Second Activity On Restart Triggered", Toast.LENGTH_SHORT).show();
        Log.d("Function","OnRestart");
    }
}
