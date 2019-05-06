package br.com.digitalhouse.ciclodevidaactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Log","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("log", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("log", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("log", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("log", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("log", "onDestroy() ");
    }
}
