package com.vaca.glx7;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private OGLView oglView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        oglView = (OGLView) findViewById(R.id.oglView);
    }

    @Override
    protected void onPause() {
        super.onPause();
//        oglView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        oglView.onResume();
    }
}
